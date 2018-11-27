# Program to list all the users from /etc/passwd
# Marclus Lopes
# 15/09/18
# User name
# Encrypted password
# User ID number (UID)
# User's group ID number (GID)
# Full name of the user (GECOS)
# User home directory
# Login shell

try:
    file_path = '/etc/passwd'
    file_opened = open(file_path, "r")  # Will open the file in read mode
    file_content = file_opened.read().strip().splitlines()
    # Will read the whole file and split each line
    for line in file_content:
        content = line.split(':')
        print('Username:',content[0],'Password (Encrypted):',content[1],'UID:',content[2],'GID:',content[3],'\nFullname User:',content[4],'~ Dir:',content[5],'Login Shell:',content[6], end='\n\n\n')
except FileNotFoundError:
    print("File does not exist please enter a correct path")
