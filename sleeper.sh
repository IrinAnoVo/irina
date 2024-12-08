#!/bin/bash
echo Urok
for DATA in {1..10}
do
echo $DATA
date +"%H:%M:%S"
#sleep 0.5
sleep 1
done
ps -ef | tail -n +2 | wc -l
cat /proc/cpuinfo >> my.txt
cat /etc/os-release | grep Name >> my.txt
cat /etc/os-release | grep 'NAME=' | awk '{print$1}'
cat /etc/os-release | grep 'NAME=' | awk '{print$2}'
for TXT in {50..100}.txt
do
echo $TXT
touch txt.txt
done

