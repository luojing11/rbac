#!/bin/bash
git pull origin master
mvn clean package -Dmaven.test.skip=true
ID=`ps -ef | grep rbac | grep -v grep | awk '{print $2}'`
echo $ID
for id in $ID
do
kill -9 $id
echo "kill $id"
done

java -jar /usr/project/rbac/target/rbac-0.0.1-SNAPSHOT.jar