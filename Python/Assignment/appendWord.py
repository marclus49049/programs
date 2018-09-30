# Marclus Lopes
# Read a file and replace the start of the word with z and add the start of the
# word to the end of the word

f = open("../testFile", "r")
for line in f:
    temp_line = ''
    words = line.split(" ")
    for word in words:
        if word[0].isupper():
            alpha = 'Z'
        else:
            alpha = 'z'

        if (word == words[len(words)-1]):
            word = alpha + word[1:len(word)-1:] + word[0].lower() + "\n"
        else:
            word = alpha + word[1::] + word[0].lower() + " "
        print(word, end='')
    #     temp_line += word
    # print(temp_line)
