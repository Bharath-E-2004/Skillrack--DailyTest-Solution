boundedArray* removeRowsWithSameValue(int R, int C, int *matrix)
{
    boundedArray *result = (boundedArray*)malloc(sizeof(boundedArray));
    result->matrix = (int**)malloc(sizeof(int*) * R);

    int ind = 0;

    for(int i = 0; i < R; i++)
    {
        int same = 1;

        for(int j = 1; j < C; j++)
        {
            if(matrix[i*C + j] != matrix[i*C + j - 1])
            {
                same = 0;
                break;
            }
        }

        if(!same)
        {
            result->matrix[ind] = (int*)malloc(sizeof(int) * C);

            for(int j = 0; j < C; j++)
            {
                result->matrix[ind][j] = matrix[i*C + j];
            }

            ind++;
        }
    }

    if(ind == 0)
    {
        result->R = 1;
        result->C = 1;

        result->matrix = (int**)malloc(sizeof(int*));
        result->matrix[0] = (int*)malloc(sizeof(int));
        result->matrix[0][0] = -1;

        return result;
    }

    result->R = ind;
    result->C = C;

    return result;
}
