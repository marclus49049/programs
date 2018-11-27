# Given any text file find the number count in a text file
# opening a file

# given a directory


def fileMode():
    fileMode = input("Do you want to \n1. Read the file,\n 2. Write a new file or \n 3. Modify a file \n 4. Exit")
    if fileMode < 0 or fileMode > 4:
        raise ValueError
    return fileMode


try:
    takeInput = True
    while(takeInput):
        fileMode = fileMode()
        if fileMode == 4:
            takeInput = False
            break
        elif fileMode == 3:

        elif fileMode == 2:

        elif fileMode == 1:

except ValueError:
    print("Enter correct value")
except FileNotFoundError:
    print("The file name entered is not found")
