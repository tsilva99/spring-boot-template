#!/bin/sh

JAVA_OPTS="$JAVA_OPTS -Xmx1024m -Xms512m"
JAVA_OPTS="$JAVA_OPTS -XX:+UseSerialGC -XX:MaxGCPauseMillis=500 -XX:MaxMetaspaceSize=128m"
java ${JAVA_OPTS} -jar application.jar