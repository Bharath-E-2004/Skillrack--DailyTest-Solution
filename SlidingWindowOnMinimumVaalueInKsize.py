from collections import deque

# Read inputs
N, K = map(int, input().split())
arr = list(map(int, input().split()))

dq = deque()
max_values = []

# Process first K elements
for i in range(K):
    while dq and arr[dq[-1]] <= arr[i]:
        dq.pop()
    dq.append(i)

# Process remaining elements
for i in range(K, N):
    max_values.append(arr[dq[0]])
    
    # Remove elements out of current window
    while dq and dq[0] <= i - K:
        dq.popleft()
        
    # Remove smaller elements
    while dq and arr[dq[-1]] <= arr[i]:
        dq.pop()
        
    dq.append(i)

# Add maximum of last window
max_values.append(arr[dq[0]])

# Print minimum among all maximums
print(min(max_values))

# The program must accept an integer array of size N and an integer K as the input. The program must find the maximum value in each subarray of size K in the given array. Then the program must print the minimum value among those maximum values as the output.

# Boundary Condition(s): 2 <= K <= N <= 10^4 1 <= Each integer value <= 10^8

# Input Format:

# The first line contains N and K separated by a space. The second line contains N integer values separated by a space.

# Output Format:

# The first line contains an integer representing the minimum value among the obtained maximum values.

# Example Input/Output 1:

# Input:

# 104 38 6 24 47 51 60 45 22 35 59

# Output: 47

# Explanation:

# Here N 10 and K = 4.

# 1st subarray -> 38 6 24 47 -> Maximum = 47

# 2nd subarray -> 6 24 47 51 -> Maximum = 51

# 3rd subarray -> 24 47 51 60 -> Maximum = 60

# 4th subarray -> 47 51 60 45 -> Maximum = 60

# 5th subarray -> 51 60 45 22 -> Maximum = 60

# 6th subarray -> 60 45 22 35 -> Maximum = 60

# 7th subarray -> 45 22 35 59 -> Maximum - 59

# The minimum value among the obtained maximum values is 47.
# Example Input/Output 2:

# Input:

# 10 3

# 2164673314

# Output: 3
