import sys

data = sys.stdin.read().strip().splitlines()
n = int(data[0])
arr = data[1:]

for i in range(n):
    curr = arr[i]
    prev = arr[(i - 1) % n]
    nxt = arr[(i + 1) % n]

    # ----- Mark in next string -----
    last_char = curr[-1]
    if last_char in nxt:
        p = nxt.index(last_char)
    else:
        p = 0

    # ----- Mark in previous string -----
    first_char = curr[0]
    if first_char in prev:
        q = prev.rfind(first_char)
    else:
        q = len(prev) - 1

    # ----- Print result -----
    if p <= q:
        print(nxt[p:q + 1])
    else:
        print(nxt[p:] + nxt[:q + 1])
'''
The program must accept N string values as the input. The program must print the output based on the following conditions.

- For each string, the program must mark the first occurrence of the last letter of the current string in the next string. If the last letter is not present, then mark the first letter in the next string. Consider the first string as the next string of the Nth string.

- For each string, the program must mark the last occurrence of the first letter of the current string in the previous string. If the first letter is not present, then mark the last letter in the previous string. Consider the Nth string as the previous string of the first string.

- Then the program must print the letters between the two positions marked on each string(both inclusive).

Boundary Condition(s):

2<= N <= 100

1<= Length of each string <= 100

Input Format:

The first line contains N.

The next N lines, each contains a string value.

Output Format:

The first N lines, each contains a string value based on the given conditions.

Example Input/Output 1:

Input:

4

jungle

notebook

king

poem

Output

jun ebook

king

poem
'''
