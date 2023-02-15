FROM openjdk:11

COPY target/agenda-0.0.1-SNAPSHOT.jar /agendaapp.jar

CMD ["java", "-jar", "/agendaapp.jar"]