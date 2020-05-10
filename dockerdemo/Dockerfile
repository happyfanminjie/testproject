FROM registry.cn-hangzhou.aliyuncs.com/springcloud-cn/java:8u172-jre-alpine
VOLUME /tmp
ADD dockerdemo-1.0.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080