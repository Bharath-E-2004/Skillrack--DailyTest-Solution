n = int(input())
d = {}

for _ in range(n):
    x, y = map(int, input().split())
    if y in d:
        d[y].append(x)
    else:
        d[y] = [x]

res = -1
for xy in d.values():
    if len(xy) >= 2:
        xy.sort()
        length = xy[-1] - xy[0]
        res = max(res, length)

print(res if res != -1 else -1)
