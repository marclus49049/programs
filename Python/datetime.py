import os
from datetime import datetime
from datetime import timedelta

now = datetime.now()
ago = now-timedelta(minutes=20)
path = "./"
for files in os.listdir(path):
    path_name = path + files
    st = os.stat(path)
    mtime = datetime.fromtimestamp(st.st_mtime)
    if mtime > ago:
        print(path_name, "modified", mtime)
