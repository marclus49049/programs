# Program to open a file and find the consicutive numbers and add them
# Marclus Lopes
# 15/09/18
import re

try:
    file_path = input("Enter path to file >>> ")
    file_opened = open(file_path, "r")  # Will open the file in read mode
    file_content = file_opened.read().strip()
    file_content = re.sub('[ \t\n\r\f\v]', "", file_content)
    sum = 0
    for i in range(len(file_content)):
        if file_content[i] == file_content[i-1]:
            sum = sum + (int(file_content[i])*2)
            # Or we can also just multiply file_content[i]*2
    print(sum)
except FileNotFoundError:
    print("File does not exist please enter a correct path")
except ValueError:
    print("\n\nTry Again\n\nEnter Digts only inside the file")
