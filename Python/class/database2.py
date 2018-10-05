import sqlite3

conn = sqlite3.connect('test.db')

print ("Opened database successfully\n\n")

query = '''CREATE TABLE IF NOT EXISTS etcPasswd (uname TEXT , psw TEXT, UID TEXT, GID TEXT, fname TEXT, home TEXT, login TEXT);'''
if conn.execute(query):
    print ("Table created successfully")

file = open("/etc/passwd", "r")

for line in file:
    data = line.split(':')
    conn.execute("insert into etcPasswd values (?, ?, ?, ?, ?, ?, ?)", data)

print("Insertion Success")

query = "SELECT * from etcPasswd"

cursor = conn.execute(query)

for row in cursor:
    print("Username:", row[0], "Password (Enrypted):", row[1])
    print("UID:", row[2], "GID:", row[3])
    print("Full Name:", row[4], "Home:", row[5], "Login:", row[6], end='\n\n')
print ("Printed all values")

conn.close()
