FROM openjdk:11.0.12-jdk
EXPOSE 8003
VOLUME /tmp
ADD config-2.5.4.jar config.jar
RUN sh -c 'touch /config.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=uat -jar /config.jar" ]