FROM eclipse-temurin:17-jre

ARG TIMEZONE=America/New_York
ARG APP_NAME=spring-boot-template
ARG APP_FILE=target/${APP_NAME}.jar
ARG APP_DIR=/app

WORKDIR ${APP_DIR}

COPY docker/entrypoint.sh .
RUN chmod 777 ./entrypoint.sh
COPY ${APP_FILE} ./application.jar

ENTRYPOINT ["/app/entrypoint.sh"]