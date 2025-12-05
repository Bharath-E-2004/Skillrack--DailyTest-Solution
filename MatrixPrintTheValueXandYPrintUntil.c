char* getStringFromRows(int R, int C, char *matrix, int X, int Y) {

    // Convert 1-based to 0-based
    X--;
    Y--;

    char result = (char)malloc(R * C + 1);
    if (result == NULL) return NULL;

    int idx = 0;
    int row = X;

    while (1) {

        // Copy entire row using row*C + col
        for (int col = 0; col < C; col++) {
            result[idx++] = matrix[row * C + col];
        }

        if (row == Y) break;

        row = (row + 1) % R;  // circular
    }

    result[idx] = '\0';
    return result;
}
/*
[05-12-2025 12:57] Bharath. E: The function/method getString FromRows accepts five arguments - R, C, matrix, X and Y. The first two arguments R and C represent the size of a character matrix. The third argument matrix represents a pointer to the R*C character matrix. The last two arguments X and Y represent the positions of two rows.

The function/method getStringFromRows must form a string value using the characters from the xth to the yth row of the given matrix. Consider the rows of the matrix in circular fashion when forming the string value. Finally, the function must return the resulting string.

Your task is to implement the function getStringFromRows so that the program runs successfully.

IMPORTANT: Do not implement the main() function as it is already defined.

Example Input/Output 1:

Input

85

kbnzc

mnnoh

ayvnq

elraq

ibjdo

uwvje

uahxg

bbjsd

25

Output:

mnnohayvnqelraqibjdo
[05-12-2025 12:57] Bharath. E: Explanation:

The characters from the 2nd row to the 5th row of 8*5 character matrix are highlighted below.

kbnzc

mnnoh

ayvnq

elraq

ibjdo

uwvje

uahxg

bbjsd

Example Input/Output 2:

Input:

85

kbnzc

mnnoh

ayvnq

elraq

ibjdo

uwvje

uahxg

bbjsd

72

Output:

uahxgbbjsdkbnzcmnnoh
*/
