n = int(input())

y = {}
m = {}

months = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
          'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']

for _ in range(n):
    d = input().strip()
    mo, yr = d.split('-')
    
    # Count occurrences per year
    y[yr] = y.get(yr, 0) + 1
    # Count occurrences per month
    m[mo] = m.get(mo, 0) + 1

# Find the maximum values
max_y = max(y.values())
max_m = max(m.values())

# Get years with max occurrence, sorted numerically
ry = sorted([k for k in y if y[k] == max_y], key=int)

# Get months with max occurrence, in order defined in months[]
rm = [mon for mon in months if mon in m and m[mon] == max_m]

print(' '.join(ry))
print(' '.join(rm))
