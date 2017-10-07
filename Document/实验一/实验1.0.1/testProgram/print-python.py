#!/usr/bin/env python
import datetime;
import sys;
import random;
import string;

print('Hello World!')
i = sys.argv[1]
file1 = open('/home/tempFile/file'+i+'_1.txt','a')
file2 = open('/home/tempFile/file'+i+'_2.txt','a')
i=10
try:
  while i > 1:
    nowtime = datetime.datetime.now()
    file1.write(str(nowtime) + '   start\n')
    seed = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+=-"
    sa = []
    for j in range(1024):
        sa.append(random.choice(seed))
    ran_str = ''.join(sa)
    file2.write(str(nowtime) + ran_str + ' \n')
    file1.write(str(nowtime) + '   end\n')
    i=i-1
finally:
  file1.close()
  file2.close()
