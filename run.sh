#!/bin/sh

java -version

java -jar -d64 -server -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -XX:+UseStringDeduplication -XX:+AggressiveOpts -XX:+UseG1GC -Xss512k  -Xms128m -Xmx512m /app.jar