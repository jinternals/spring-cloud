FROM java:8
VOLUME /tmp
LABEL  application.name="${release.module.config.server.name}" application.version="${release.project.version}"
ENV TERM xterm
RUN apt-get update
RUN apt-get install -y nano
RUN apt-get install -y curl
ADD spring-cloud-config-server-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]