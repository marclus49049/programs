#add odd and even sub, sub cube root if odd and add square in even
name = raw_input("Enter Name: ")
name = name.upper();
print(name)
#Using ASCII 
'''sum = 0
for x in name:
    index = ord(x) - 64
    print x, " is ", index
    if index>26 and index<1:
        continue
    if index%2 == 0:
        sum = sum - index
    else:
        sum = sum + index
print (sum)'''

#using Dictionary for this
"""name = name.lower();
sum= 0
alpha = {'a':1,'b':-2,'c':3,'d':-4,'e':5,'f':-6,'g':7,'h':-8,'i':9,'j':-10,'k':11,'l':-12,'m':13, 'n':-14, 'o':15, 'p':-16, 'q':17, 'r':-18, 's':19, 't':-20, 'u':21, 'v':-22, 'w':23, 'x':-24, 'y':25, 'z':-26}
for x in name:
    sum = sum + alpha[name]
print(sum)"""

#using list
'''sum = 0
alpha = "abcdefghijklmnopqrst".upper()
for x in name:
    t = alpha.find(x)
    if t>-1:
        sum += (t+1)
print (sum);
'''
