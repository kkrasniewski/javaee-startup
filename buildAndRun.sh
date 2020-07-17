#!/bin/sh
mvn clean package && docker build -t org.example/JavaEEStartup .
docker rm -f JavaEEStartup || true && docker run -d -p 8080:8080 -p 4848:4848 --name JavaEEStartup org.example/JavaEEStartup 
