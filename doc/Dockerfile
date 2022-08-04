FROM openjdk:8
ADD /target/k8s-demo-0.0.1-SNAPSHOT.jar k8s-demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","-Xms1g","-Xmx1g","/k8s-demo-0.0.1-SNAPSHOT.jar"]