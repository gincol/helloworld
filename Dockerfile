FROM armv7/armhf-java8

# copy el jar 
COPY target/helloworld.jar /app.jar

# comando a ejecutar
CMD ["java", "-jar", "/app.jar"]
