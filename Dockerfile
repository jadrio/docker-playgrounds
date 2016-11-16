FROM frolvlad/alpine-oraclejdk8:slim
# adding volume for default working tomcat directories
VOLUME /tmp
ADD target /target
WORKDIR /target
RUN sh -c "ls -lah"
RUN sh -c 'touch docker-playgrounds-0.0.1-SNAPSHOT.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","docker-playgrounds-0.0.1-SNAPSHOT.jar"]