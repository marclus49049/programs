# Create a directory structure as shown in the question
# a
#     a
#         a
#         b
#         c
#     b
#         a
#         b
#         c
#     c
#         a
#         b
#         c

import os

print("Current working directory : ", os.getcwd())
directory = os.getcwd()
directories = ['a', 'b', 'c']
if os.path.isdir("a"):
    print("Directory already exists")
    exit()
os.mkdir('a')
os.chdir('./a')
for j in range(3):
    os.mkdir(directories[j-1])
    os.chdir(('./'+directories[j-1]))
    for k in range(3):
        os.mkdir(directories[k-1])
    os.chdir('../')
