### Description
Weather Sensor Rest API service from Alishev's Spring framework course on Java Spring framework 3.
### Implemented features
+ Register sensors

  ```http://yourhost:7379/sensors/registration```
+ Addition measurement to sensor

  ```http://yourhost:7379/measurements/add```
+ Getting all measurement

  ```http://yourhost:7379/measurements```
+ Counting the number of rainy days

  ```http://yourhost:7379/measurements/rainyDaysCount```
### Technologies
+ Java
+ Spring 3
+ Hibernate
+ PostgreSQL
### How to start
 + Clone repository from Github:
 
    ```https://github.com/Art3m1y/WeatherSensorRestAPI.git```
 + Setup Java Development Kit
 + Compile and package the application to an executable JAR
     
    ```mvn package```
 + Run backend part of project (executable JAR)
     
    ```java -jar scooters-shop-project.jar```

 _If you have followed all the steps, the application will be on http://__yourhost__:7379_
