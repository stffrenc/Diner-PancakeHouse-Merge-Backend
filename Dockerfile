FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/Diner-PancakeHouse-Merge-0.0.1-SNAPSHOT.jar diner-pancakehouse-merge-backend.jar
ENTRYPOINT ["java", "-jar", "diner-pancakehouse-merge-backend.jar"]