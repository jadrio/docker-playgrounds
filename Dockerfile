FROM frolvlad/alpine-oraclejdk8:slim
# adding volume for default working tomcat directories
VOLUME /tmp
ADD target /target
#ADD target/docker-playgrounds-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /target/docker-playgrounds-0.0.1-SNAPSHOT.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/target/docker-playgrounds-0.0.1-SNAPSHOT.jar"]