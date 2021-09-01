FROM openjdk:11.0.12-jdk
EXPOSE 8000
VOLUME /tmp
ADD eureka-2.5.4.jar eureka.jar
RUN sh -c 'touch /eureka.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=uat -jar /eureka.jar" ]