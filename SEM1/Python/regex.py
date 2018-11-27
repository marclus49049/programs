# Only numbers as output
# Add only those numbers which two same consecutive digits
import re

dict = {}
fileOpened = open("testFile", "r")
for line in fileOpened:
    word = re.sub('[ \t\n\r\f\v]', "", line).split(',')
    dict[word[3]] = 0
fileOpened.close()
fileOpened = open("testFile", "r")
for line in fileOpened:
    word = re.sub('[ \t\n\r\f\v]', "", line).split(',')
    print(word)
    dict[word[3]] += int(word[2], 10)
print(dict)
