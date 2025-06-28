s = input()
r = ""
v = set()

for c in s:
    if c.isalpha():
        x = c.lower()
        while x in v:
            x = chr((ord(x) - 97 + 1) % 26 + 97)  # Wrap around a-z
        v.add(x)
        r += x if c.islower() else x.upper()
    elif c.isdigit():
        x = c
        while x in v:
            x = str((int(x) + 1) % 10)  # Wrap around 0-9
        v.add(x)
        r += x

print(r)


# The program must accept a string 5 containing only alphabets and digits as the input. The program must modify the string 5 based on the following conditions.

# - The program must replace each duplicate character from left to right in the string with the next possible value such that there is no duplicate character till that character

# - All 26 English alphabets must be considered in a circular fashion(a, b, c, ... x, y, z, a, b,..) by ignoring the case.

# - All 10 digits must be considered in a circular fashion(0, 1, 2, 8, 9, 0, 1, 2,...). Finally, the program must print the revised string S as the output.

# Note:

# - The number of alphabets in the string is always less than or equal to 26.

# - The number of digits in the string is always less than or equal to 10.

# Boundary Condition(s): 1 <= Length of S <= 36

# Input Format: The first line contains S.

# Output Format:

# The first line contains the revised string S.

# Example Input/Output 1:

# Input: Twenty5667

# Output: Twenuy5678

# Explanation:

# Here the given string is Twenty5667.

# The character 't' is a duplicate value (ignoring the case), so it is replaced with the next possible value 'u'.

# The character '6' (2nd occurrence) is a duplicate value, so it is replaced with the next possible value '7'.

# The character '7' is a duplicate value, so it is replaced with the next possible value '8'. After replacing all the duplicate characters, the revised string becomes Twenuy5678.
