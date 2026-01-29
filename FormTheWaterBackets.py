import sys

d = list(map(int, sys.stdin.read().split()))

if not d:
    sys.exit()

n = d[0]
a = d[1:1 + n]
c = d[1 + n]

while True:
    idx = None

    # find first element < c
    for i in range(len(a)):
        if a[i] < c:
            idx = i
            break

    if idx is None:
        break

    w = a[idx]

    for j in range(idx + 1, len(a)):
        if w == 0:
            break

        if a[j] < c:
            need = c - a[j]
            give = min(need, w)

            a[j] += give
            w -= give

    if w == 0:
        a.pop(idx)
    else:
        a[idx] = w

    break

print("".join(map(str, a)))

# /*
# There are N buckets arranged in a row. The amount of water in each bucket is passed as the input. All N buckets have the same capacity C which is also passed as the input. A boy wants to fill as many buckets as possible based on the following conditions.

# - He chooses the leftmost incomplete bucket(i.e., the bucket with less water than capacity), and he fills the remaining incomplete buckets from left to right using the water in the chosen bucket. Once the chosen bucket is empty, he removes that bucket from the row.

# - Then he repeats the process of filling the buckets till all the buckets are stable.

# Finally, the program must print the amount of water in the remaining buckets as the output.

# Boundary Condition(s):

# 2 <= N <= 100

# 1 <= Amount of water in each bucket <= C <= 1000

# Input Format:

# The first line contains N.

# The second line contains N integers separated by a space.

# The third line contains C.

# Output Format:

# The first line contains the integer values representing the amount of water in the remaining buckets.

# Example Input/Output 1:

# Input:

# 5 58379 10

# Output: 10 2 10 10
# */
