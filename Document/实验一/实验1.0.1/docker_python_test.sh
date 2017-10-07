#!/bin/sh

sudo rm -rf /home/serane/testProgram/tempFile/*
for i in 1
do
  sudo docker run -itd -v /home/serane/testProgram:/home --privileged=true --name=centos_$i docker.io/centos /home/print-python.py $i
  sleep $i
  sudo docker rm -f centos_$i
done
