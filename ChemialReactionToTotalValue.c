#include <stdio.h>
#include <string.h>
#include <ctype.h>

int get_value(char *temp) {
    if (strcmp(temp, "H") == 0) return 1;
    if (strcmp(temp, "He") == 0) return 4;
    if (strcmp(temp, "C") == 0) return 12;
    if (strcmp(temp, "N") == 0) return 14;
    if (strcmp(temp, "O") == 0) return 16;
    if (strcmp(temp, "Mg") == 0) return 24;
    if (strcmp(temp, "S") == 0) return 32;
    if (strcmp(temp, "Ca") == 0) return 40;
    if (strcmp(temp, "Cu") == 0) return 63;
    return 0;
}

int main() {
    char S[51];
    scanf("%s", S);

    int len = strlen(S);
    long result = 0;
    int i = 0;

    while (i < len) {
        char temp[3] = "";
        temp[0] = S[i++];

        // If next is lowercase -> 2 letter element (e.g., Ca, Mg, Cu)
        if (i < len && islower(S[i])) {
            temp[1] = S[i++];
            temp[2] = '\0';
        } else {
            temp[1] = '\0';
        }

        int value = get_value(temp);

        // Read number (if present)
        int num = 0;
        while (i < len && isdigit(S[i])) {
            num = num * 10 + (S[i] - '0');
            i++;
        }

        if (num == 0) num = 1; // default count

        result += value * num;
    }

    printf("%ld", result);
    return 0;
}

/*
The program must accept a string S representing a chemical formula as the input. The program must print the molecular mass for the given chemical formula as the output. The given chemical formula contains the following elements (Element Name -> Symbol -> Atomic Mass).

Hydrogen -> H -> 1 Helium -> He -> 4 Carbon -> C -> 12 Sulfur -> S-> 32 Calcium -> Ca -> 40 Copper -> Cu -> 63

Nitrogen -> N -> 14 Oxygen -> 0 -> 16 Magnesium -> Mg -> 24

Boundary Conditions(s): 1<= Length of S <= 50

Input Format:

The first line contains S.

Output Format:

The first line contains an integer value representing the molecular mass for the given chemical formula.

Example Input/Output 1:

Input: H2O

Output: 18

Explanation:

H2O -> 2 Hydrogen and 1 Oxygen Molecular Mass (21) 16-18.

Example Input/Output 2:

Input: C3H8O3

Output: 92

Explanation:

C3H8O3 -> 3 Carbon, 8 Hydrogen and 3 Oxygen Molecular Mass = (3*12) + (81) + (316) = 92.

Example Input/Output 3:

Input:

CuSO4

Output: 159

Example Input/Output 4:

Input: C12H15

Output: 159
*/
