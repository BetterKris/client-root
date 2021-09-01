FROM openjdk:11.0.12-jdk
EXPOSE 8083
VOLUME /tmp
ADD common-0.0.1-SNAPSHOT.jar common.jar
RUN sh -c 'touch /common.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=uat -jar /common.jar" ]