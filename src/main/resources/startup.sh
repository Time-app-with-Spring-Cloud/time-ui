#!/bin/sh

# Hack to give time to Eureka to start up before calling it. Use with care.
sleep 5
java -jar time-ui.jar