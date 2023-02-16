FROM openjdk:19

COPY target/agendaapp-0.0.1-SNAPSHOT.jar /agendaapp.jar

CMD ["java", "-jar", "/agendaapp.jar"]