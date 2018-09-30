#Marclus Lopes
#finding the sum of multiples of 3 or 5
MAX_NUM = 1000
sum = 0
for multiple in range(3,MAX_NUM,3):
    sum = sum + multiple
for multiple in range(5,MAX_NUM,5):
    sum = sum + multiple
for multiple in range(15,MAX_NUM,15):
    sum = sum - multiple
print "The Sum of Multiples of 3 or 5 between",MAX_NUM,"are:",sum
