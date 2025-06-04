def read_matrix(rows):
    return [input().split() for _ in range(rows)]

# Input dimensions
m, n = map(int, input().split())

# Read matrix a
a = read_matrix(m)

# Read r and c (position in a where to check for match)
r, c = map(int, input().split())

# Read matrix b
b = read_matrix(8)

# Set maximum possible square size
k = min(m - r, n - c, 8)

found = False

for s in range(k, 0, -1):
    match = True
    for i in range(s):
        for j in range(s):
            if a[r + i][c + j] != b[i][j]:
                match = False
                break
        if not match:
            break
    if match:
        for i in range(r, r + s):
            print(' '.join(a[i][c:c + s]))
        found = True
        break

if not found:
    print(-1)
