# ExampleOfFormValidationSpringMVCWithDBAndRESTWebServices
IntelliJ IDEA Maven project (webapp archetype) showing a form validation done with Spring MVC. The servlet container is Apache Tomcat 8. The form is inserting the data (username, password, email and birthday) into a MySQL DB. Then, REST API are created with Apache CXF for continuing the demonstration.
First, create a MySQL db called formvalidation. Then create a table called USer having the fields: username, password, email and birthday.
In spring-mvc.xml modify the username and the password for the MySQL database according to your needs.

The registration page (the form) is shown in the following image:
![alternate text](https://github.com/OctavianIonel/ExampleOfFormValidationSpringMVCWithDBAndRESTWebServices/blob/master/register.png)


After submitting the form, the result is shown:
![alternate text](https://github.com/OctavianIonel/ExampleOfFormValidationSpringMVCWithDBAndRESTWebServices/blob/master/registrationSuccessful.png)




Related to REST web services:

GET /getAllUsersInJSON

![alternate text](https://github.com/OctavianIonel/ExampleOfFormValidationSpringMVCWithDBAndRESTWebServices/blob/master/getAllUsersInJSON.png)


POST /createUser

Header:

Content-Type: application/json

Request body:
  {
     "username":"Alex",
     "password":"1234",
     "email":"alex.brown@xxx.com",
     "birthday":"1986-06-20",
     "profession":"Java Developer"
  }
  
![alternate text](https://github.com/OctavianIonel/ExampleOfFormValidationSpringMVCWithDBAndRESTWebServices/blob/master/createUser_POST.png)


Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.