#!/bin/bash
NAME=Irina
date
echo Hello Irina!
pwd
ps -ef | tail -n +2 | wc -l 
ps -ef | grep bioset | grep -v grep | wc -l
ls -l /etc/passwd | awk '{print $1}'

