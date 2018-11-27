#No of words in a string
sum=0
stringSum="";
words = []
StringVar = input("Enter a String :")
for x in StringVar:
    if x==" " or x=='\n':
        words.append(stringSum)
        stringSum=""
    stringSum = stringSum + x;
print(words)
'''SplitString = StringVar.split(' ')
for x in SplitString:
    if x==" " or x=='\n':
        continue
    sum=sum+1
print("The number of words in",StringVar+" are ",sum)'''
#first make a dic with the keys are the string and assign them value 0
#then run another loop accessing them 
