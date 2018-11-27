import sqlite3

conn = sqlite3.connect('test.db')

print ("Opened database successfully")
query = '''CREATE TABLE IF NOT EXISTS COMPANY (ID INT PRIMARY KEY NOT NULL, NAME TEXT NOT NULL, AGE INT NOT NULL, ADDRESS CHAR(50), SALARY REAL);'''
if conn.execute(query):
    print ("Table created successfully")


querys = ["INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) VALUES (1, 'Paul', 32, 'California', 20000.00 )", "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) VALUES (2, 'Tejas', 21, 'Pune', 20000.00 )"]
for query in querys:
    conn.execute(query)

query = "SELECT id, name, address, salary from COMPANY"

cursor = conn.execute(query)

for row in cursor:
    print ("ID = ", row[0])
    print ("NAME = ", row[1])
    print ("ADDRESS = ", row[2])
    print ("SALARY = ", row[3], "\n")

print ("Printed all values")

conn.close()
