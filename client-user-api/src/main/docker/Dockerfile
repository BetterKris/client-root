FROM openjdk:11.0.12-jdk
EXPOSE 8081
VOLUME /tmp
ADD user-0.0.1-SNAPSHOT.jar user.jar
RUN sh -c 'touch /user.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=uat -jar /user.jar" ]