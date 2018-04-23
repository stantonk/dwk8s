FROM openjdk:8-jdk

ENV APPROOT "/srv/dwk8s"

RUN mkdir -p ${APPROOT}
COPY target/dwk8s.jar ${APPROOT}/dwk8s.jar
COPY ./config.yml ${APPROOT}/config.yml
WORKDIR ${APPROOT}

EXPOSE 8080

CMD java -jar dwk8s.jar server config.yml