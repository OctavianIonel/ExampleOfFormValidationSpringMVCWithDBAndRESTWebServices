# ExampleOfFormValidationSpringMVCWithDBAndRESTWebServices
IntelliJ IDEA Maven project (webapp archetype) showing a form validation done with Spring MVC. The form is inserting the data (username, password, email and birthday) into a MySQL DB. Then, REST API are created for continuing the demonstration.
First, create a MySQL db called formvalidation. Then create a table called USer having the fields: username, password, email and birthday.
In spring-mvc.xml modify the username and the password for the MySQL database.
The registration page (the form) is shown in the following image:
![alternate text](https://github.com/OctavianIonel/ExampleOfFormValidationSpringMVCWithDBAndRESTWebServices/blob/master/register.png)

After submitting the form, the result is shown:
![alternate text](https://github.com/OctavianIonel/ExampleOfFormValidationSpringMVCWithDBAndRESTWebServices/blob/master/registrationSuccessful.png)

Related to REST web services:
![alternate text](https://github.com/OctavianIonel/ExampleOfFormValidationSpringMVCWithDBAndRESTWebServices/blob/master/getAllUsersInJSON.png)

