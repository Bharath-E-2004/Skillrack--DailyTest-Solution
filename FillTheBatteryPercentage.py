n = int(input())
list1 = list(map(int, input().split()))

m = int(input())
list2 = list(map(int, input().split()))

charge = sum(list1)

list2.sort()

# Convert list2 values to "required charge" i.e., 100 - value
for i in range(len(list2)):
    list2[i] = 100 - list2[i]

# Try to fulfill each requirement from charge
for i in range(len(list2)):
    if (charge - list2[i]) >= 0:
        charge -= list2[i]
        list2[i] = 0

# Count how many items are fulfilled (i.e., value became 0)
print(list2.count(0))

# Example Input/Output 1:

# Input:

# 2 4

# 51 25

# 0 99 50 85

# Output:

# 3

# Explanation:

# The 3 mobiles that can be fully charged are 2nd, 3rd and 4th.

# So 3 is printed as the output.

# Example Input/Output 2:

# Input:

# 2 5

# 50 100

# 20 30 40 50 20

# Output:

# 2
