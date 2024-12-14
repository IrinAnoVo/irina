#!/bin/bash
echo "Hello Student"
echo "Enter your name"
read NAME
echo "Welcome to terminal $NAME"
mkdir /tmp/test
touch /tmp/test/mydate.txt
date +"%H:%M:%S" >> mydate.txt
echo "Сохраняем данные"
for run in {1..10}
do
sleep 0.2
echo $run
done
echo "Data saved.continue work"
df -h >> /tmp/test/mydate.txt
mkdir /opt/mydate
cp /tmp/test/mydate.txt /opt/mydate
mv /opt/mydate/mydate.txt /opt/mydate/newmydate.txt
for run in {1..5}
do
sleep 0.5
echo $run
done
echo "Well done Boss"
