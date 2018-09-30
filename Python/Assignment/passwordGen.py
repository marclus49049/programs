# Marclus Lopes
# Generate a password length more than 12 and with one upper and one special char

import random
try:
    no_of_passwords = int(input("Enter how many passwords do you want? : "))
    password_length = int(input("Enter how many characters do you want?(min:12): "))
    if password_length < 12:
        raise ValueError
except ValueError:
    print("Enter Correct value")
char_lower = "abcdefghijklmnopqrstuvwxyz"
char_upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
char_special = "'!@#$%^&*()[]{}_-.="
num = "Aa."
for psw in range(no_of_passwords):
    password = random.choice(char_lower) + random.choice(char_upper) + random.choice(char_special)
    for i in range(password_length):
        if random.choice(num) == 'a':
            password += random.choice(char_lower)
        elif random.choice(num) == 'A':
            password += random.choice(char_upper)
        else:
            password += random.choice(char_special)
    password = "".join(random.sample(password, len(password)))
    print(password, "\nPassword Length: ", len(password), end="\n\n")
