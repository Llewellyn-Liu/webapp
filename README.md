# webapp
Web project for personal page, course, and other practice

First Issue 2023/2/3

Environments:
  Java Version 17
  Maven
    - SpringBoot 
    - MySQL
    - JUnit
    - MyBatis
    These packages are constructed using Maven pom.xml
    
   Database settings:
    See mybatis-configuration.xml
    
   Test Cases:
     Requirement 1: √
     Requirement 2： Just removed
     Requirement 3： Checked, but I don't know how to deal with a 203 status
     Requirement 4: Yes, even though I don't know how to process a integration test
     Requirement 5: Yes
     Requirement 6: Yes, tested in browser and Postman client
     Requirement 7：Quite struggled, but I made it
     Requirement 8：not so sure for 8.2
     Requirement 9: Approved
     
     case 1: GET Get User Account Information:
      data:{
          No need to use data, only check the Authorization header value
      }
      url: "/data/user/{id}"
      
     case 2: PUT Update User's Account Information
        data:{
          {
           "firstname": "Jane",
           "lastname": "Doe",
           "password": "somepassword",
           "username": "jane.doe@example.com"
        }
        url: "/data/user/{id}"
      //Tips: Create user and then run case 2
      
     Case 3: GET /healthz
      Just Run it
      
     Case 4: POST Create a user
      data:{
          "firstname": "Jane",
          "lastname": "Doe",
          "password": "somepassword",
          "username": "jane.doe@example.com"
      }
      url:"/UserRegister"
      
      
Please contact me when there is a bug!
