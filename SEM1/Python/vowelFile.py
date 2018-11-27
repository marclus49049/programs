# Marclus Lopes
# Create a file and replace each vowel with its next vowel

new_data = []
vowels = {'a': 'e', 'e': 'i', 'i': 'o', 'o': 'u', 'u': 'a'}
file_path = input("Enter File Path : ")
file_open = open("testFile.txt", "r")
file_content = file_open.read().lower()
for c in file_content:
    if c in vowels:
        new_data.append(vowels[c])
    else:
        new_data.append(vowels)
