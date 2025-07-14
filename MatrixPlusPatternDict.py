# Input number of rows and columns
r, c = map(int, input().split())

# Input matrix
m = [list(map(int, input().split())) for _ in range(r)]

# Initialize direction arrays
up = [[0] * c for _ in range(r)]
left = [[0] * c for _ in range(r)]
down = [[0] * c for _ in range(r)]
right = [[0] * c for _ in range(r)]

# Compute `up` and `left` counts
for i in range(r):
    for j in range(c):
        if m[i][j] == 1:
            up[i][j] = 1 + (up[i - 1][j] if i > 0 else 0)
            left[i][j] = 1 + (left[i][j - 1] if j > 0 else 0)

# Compute `down` and `right` counts
for i in range(r - 1, -1, -1):
    for j in range(c - 1, -1, -1):
        if m[i][j] == 1:
            down[i][j] = 1 + (down[i + 1][j] if i < r - 1 else 0)
            right[i][j] = 1 + (right[i][j + 1] if j < c - 1 else 0)

# Find the largest arm length of the cross
max_arm = 0
for i in range(r):
    for j in range(c):
        if m[i][j] == 1:
            arm = min(up[i][j], down[i][j], left[i][j], right[i][j])
            max_arm = max(max_arm, arm)

# Each arm length includes center, so actual size of cross = arm length
print(max_arm if max_arm >= 2 else -1)


# The program must accept an integer matrix of size R°C containing only Os and is as the input.
# The program must find the biggest plus sign (+) formed by 1s in the given matrix.
# Then the program must print the length of the edge of the biggest plus sign (Edge length = the number of cells from the middle cell of the plus sign to one of the four ends). 
# All four edges of the plus sign must be equal.
# If the plus sign is not present in the matrix, then the program must print -1 as the output.
