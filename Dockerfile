FROM openjdk:8-jdk-alpine

COPY target/*.jar time-ui.jar
COPY src/main/resources/startup.sh /usr/local/bin
ENTRYPOINT ["/usr/local/bin/startup.sh"]