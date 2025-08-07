char* asciiToString(int SIZE, int arr[]) {
    char* result = (char*)malloc(sizeof(char) * (SIZE + 1)); // +1 for null terminator
    if (result == NULL) {
        return NULL; // handle memory allocation failure
    }

    for (int i = 0; i < SIZE; i++) {
        result[i] = (char)arr[i];
    }

    result[SIZE] = '\0'; // null-terminate the string
    return result;
}
/*
The function/method asciiToString accepts two arguments - SIZE and arr. The integer SIZE represents the size of the integer array arr. The values in the given array represent the ASCII values of the characters present in a string.

The function/method asciiToString must form a string using the given ASCII values and return the string.

Your task is to implement the function asciiToString so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Boundary Condition(s):

40 <= Each integer value <= 125

Example Input/Output 1:

Input

9

83 107 105 108 108 82 97 99 107

Output

Skill Rack

Explanation:

The 9 ASCII values are 83 107 105 108 108 82 97 99 107.

So the string formed using the 9 ASCII values is Skill Rack.

Example Input/Output 2:

Input:

19

73 114 111 110 77 97 110 124 76 111 107 105 64 97 115 103 97 114

100

Output:

Iron Man Loki@asgard
*/
