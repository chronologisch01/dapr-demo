FROM openjdk:11

RUN wget -q https://raw.githubusercontent.com/dapr/cli/master/install/install.sh -O - | /bin/bash

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ARG DAPR_BUILD_DIR
COPY $DAPR_BUILD_DIR /opt/dapr
ENV PATH="/opt/dapr/:${PATH}"
RUN dapr init --slim


#ENTRYPOINT ["java", "-jar", "app.jar"]
ENTRYPOINT ["dapr"]
CMD ["run", "--app-id", "spring-client", "--app-port", "8080","--" ,"java", "-jar", "app.jar"]