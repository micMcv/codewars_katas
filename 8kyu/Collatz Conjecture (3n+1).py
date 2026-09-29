# IMPERATIVE APPROACH
def hotpo(n, c=0):
    while n > 1:
        n = 3*n+1 if n%2 else n/2
        c += 1
    return c

# RECURSIVE APPROACH
def hotpo(n, c=0):
    return hotpo(3*n+1 if n%2 else n/2, c+1) if n>1 else c
