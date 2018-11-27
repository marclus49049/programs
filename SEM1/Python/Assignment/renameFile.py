# Marclus Lopes
# If a file has spaces change the spaces to '_'
import os

path = './'
for file in os.listdir(path):
    file_name = ''
    flag = False
    if ' ' in file.strip():
        for alpha in file.strip():
            if alpha == ' ':
                alpha = '_'
                flag = True
            file_name += alpha
    if flag:
        os.rename(file, file_name)
        print(file, "has been renamed to", file_name)
