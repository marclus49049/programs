'''ODD - cube root and EVEN + square'''
name = "i".lower()
alpha = "abcdefghijklmnopqrstuvwxyz"
name = name.lower()
sum = 0
for char in name:
    t = alpha.find(char)
    if t > -1:
        t += 1
        if t%2 == 0:
            sum += t**2
        else:
            sum -= t**(1/3.0)
print(sum)
