# Marclus Lopes
# Program to print the occurences of a word in a file
import re
try:
    filePath = input("Enter path to file: ")
    fileOpened = open(filePath, "r")  # Will open the file in read mode
    fileContent = fileOpened.read().lower()
    fileContent = re.sub('[ \t\n\r\f\v]', " ", fileContent).strip()
    fileOpened.close()
    words = []
    words = fileContent.split(" ")
    wordCount = {}
    for word in words:
        wordCount[word] = 0

    for word in words:
        wordCount[word] += 1

    for word in wordCount:
        print("The count of '", word, "' is", wordCount[word])

except FileNotFoundError:
    print("File does not exist please enter a correct path")
