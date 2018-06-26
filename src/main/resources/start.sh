kill -9 `ps -ef | grep -o demo-0.0.1-SNAPSHOT.jar | cut -d ' ' -f 5`
nohup java -Dfile.encoding=UTF-8 -jar ~/workspace/test/target/demo-0.0.1-SNAPSHOT.jar >~/workspace/log4.log &
exit 0