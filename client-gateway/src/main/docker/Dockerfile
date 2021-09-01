FROM openjdk:11.0.12-jdk
EXPOSE 8001
VOLUME /tmp
ADD gateway-2.5.4.jar gateway.jar
RUN sh -c 'touch /gateway.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=uat -jar /gateway.jar" ]