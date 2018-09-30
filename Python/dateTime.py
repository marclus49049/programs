# A program to check all the files in the current directory that were
# created in the last 20 min

from datetime import datetime
import os
import platform

# function to get the creation time of a file based on the operation system
# windows and mac store the creation time but linux does not so we take
# the modified time


def cr_time(path):
    if platform.system() == 'Windows':
        return os.path.getctime(path)
    else:
        stat = os.stat(path)
        try:
            return stat.st_birthtime  # for MACOS will return the creation time
        except AttributeError:
            # We are on linux and there is no way to accsess the creation time
            # so we access the modification time as linux does not store
            # the creation time
            return stat.st_mtime


current_time = datetime.now()  # savinf the current system time
# os.listdir() gives a list of all the files in the said path
path = './'
for file in os.listdir(path):
    # file_time will covert the epoch creation time/modified time (linux)
    # into datetime format
    file_name = path + file
    file_time = datetime.fromtimestamp(cr_time(file_name))
    # calculating the diffrence between current_time and file_time
    # type deltatime
    diff = current_time - file_time
    # checking if the days of the fill are less than equal to zero
    if diff.days == 0:
        # Converting to Minutes and checking it its less than 21 because we
        # need to display files created in the last 20 mins
        if diff.seconds/60 < 21:
            # printing the file name and the timestamp which is of type
            # deltatime because we performed a subtraction
            print("File Name:", file_name)
            print(diff, end='\n\n')
