int shiftAndCompareBits(int N, int X)
{
    int bits = 0, temp = N;

    // Count number of bits in N
    while (temp > 0) {
        bits++;
        temp >>= 1;
    }

    // Normalize X
    X = X % bits;

    // Right rotate N by X bits
    int M = (N >> X) | (N << (bits - X));

    // Mask to keep only 'bits' bits
    int mask = (1 << bits) - 1;
    M = M & mask;

    // Count equal bits
    int count = 0;
    for (int i = 0; i < bits; i++) {
        int bitN = (N >> i) & 1;
        int bitM = (M >> i) & 1;
        if (bitN == bitM)
            count++;
    }

    return count;
}

/*
The function/method shiftAndCompareBits must form an integer M by shifting the bits (i.e., rotating the bits) in the binary representation of N to the right by X positions. The program must return an integer representing the count of bits that are equal in N and M at the same positions.

Your task is to implement the function shiftAndCompareBits so that the program runs successfully.

IMPORTANT: Do not implement the main() function as it is already defined.

Example Input/Output 1:

Input:

10 1

Output 0

Explanation:

Here N = 10 and X = 1.

The binary representation of 10 is 1010.

After shifting the bits to the right by 1 position, the integer M = 0101.

No bits are equal in N and M at the same positions.

So 0 is printed as the output.

Example Input/Output 2:

Input: 10 2

Output: 4

Explanation:

Here N 10 and X = 2.

The binary representation of 10 is 1010.

After shifting the bits to the right by 2 positions, the integer M = 1010.

All four bits are equal in N and M at the same positions.

So 4 is printed as the output.
*/
