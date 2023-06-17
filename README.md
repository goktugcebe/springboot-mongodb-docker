<h1>springboot-mongodb-docker</h1>
 Deploying Spring Boot and MongoDB as Containers Using Docker and Docker Compose
  
<h3>Technologies Used:</h3>

<b>Java:</b> The project is developed using the Java programming language, known for its versatility and robustness.<br>
<b>Spring Framework:</b> The application leverages the power of the Spring Framework, enabling efficient dependency injection, handling transactions, and managing the web layer.<br>
<b>Docker:</b> The project utilizes Docker containers to provide an isolated and portable environment for the application components.<br>
<b>MongoDB:</b> The NoSQL database MongoDB is employed to store and manage data efficiently.<br>
<b>RESTful API:</b> The application exposes a RESTful API to enable seamless interaction with the system.<br>
  
<h3> Steps & Commands</h3>
<li> pull mongo image from docker hub  <code><strong>docker pull mongo:latest</strong></code> <br>
<li>run mongo image <code><strong>docker run -d -p 27017:27017 --name some-mongo mongo:latest</strong></code><br>
<li>dockerize spring boot application <code><strong>docker build -t springboot-mongodb:1.0 .</strong></code><br>
  
  ![image](https://github.com/goktugcebe/springboot-mongodb-docker/assets/114263311/62c0085f-bfda-44af-b80f-1cbc6bab3c3b)

 <li>check docker images<br>
   
  ![image](https://github.com/goktugcebe/springboot-mongodb-docker/assets/114263311/c4fe1876-86f1-48c6-b58d-351d8fe989ab)
<li>run spring boot docker image and link that container to mongo container <code><strong>docker run -p 8080:8080 --name springboot-mongodb --link some-mongo:mongo -d springboot-mongodb:1.0</strong></code><br>
<li> check docker running containers docker ps it should display two container ids<br>
  <li>check docker containers<br>
    
  ![image](https://github.com/goktugcebe/springboot-mongodb-docker/assets/114263311/133192e2-9a76-4d55-9570-fd02a1ee5bb4)
<li> check logs of spring boot image <code><strong>docker logs springboot-mongodb</strong></code><br>
  
  ![image](https://github.com/goktugcebe/springboot-mongodb-docker/assets/114263311/28ee8a95-09f0-43be-8e28-2831cc237e93)

<li> if all good access your api <br>
<li>login to mongo terminal to verify records <code><strong>docker exec -it some-mongo bash</strong></code><br>
    <code><strong>mongosh<br>
    show dbs<br>
    use Book<br>
    show collections<br>
    db.book.find().pretty()</strong></code><br>
  
  ![image](https://github.com/goktugcebe/springboot-mongodb-docker/assets/114263311/270dd93a-35f4-41a9-ad70-c9ea73367927)
  
  <b>application.yml</b>
    
   ![image](https://github.com/goktugcebe/springboot-mongodb-docker/assets/114263311/b7849dd5-04c0-43cf-8c42-af08b8a7f549)

  <b>DockerFile</b>
  
 ![image](https://github.com/goktugcebe/springboot-mongodb-docker/assets/114263311/5a002a23-f875-40a5-8863-395b6aa36bc2)


  <b>docker-compose.yml</b>

  ![image](https://github.com/goktugcebe/springboot-mongodb-docker/assets/114263311/10b3e0fc-75e0-45f8-a124-17383372a673)
  
  
