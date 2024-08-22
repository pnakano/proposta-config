FROM openjdk:17

COPY target/proposta-config-1.0.0-SNAPSHOT.jar proposta-config.jar

ENTRYPOINT ["java", "-jar", "proposta-config.jar"]