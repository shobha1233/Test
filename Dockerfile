FROM openjdk:17-jdk-slim
EXPOSE 9090
ADD target/shobha_github_actions.jar shobha_github_actions.jar
ENTRYPOINT ["java","-jar","/shobha_github_actions.jar"]
