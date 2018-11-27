import re

file = open('/etc/passwd', 'r')
pattern = '^([^:]*).*:([^:\s]*)$'

# [^:]*$ for finding last delimiter

for line in file:
    s = re.search(pattern, line)
    # print(s.group())
    print(s.groups()[0], s.groups()[1])
