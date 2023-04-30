
<h1 align = "center"> JobSearchPortalWeeklyTest </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>
This project is of Searching Jobs using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The User data model is defined in the User class, which has the following attributes:
```
id : unique identifier for each job(primary Key).
title : title of the job.
description :description of the job.
location : location of the job
salary : Salary for that job.
companyName : Name of the company
employerName : Name of the employer
jobType : Type of job like IT,HR etc
appliedDate : Applydate of the jobs
```

---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---



## Project Summary

This project is a Job search portal implemented using the Spring framework. It provides endpoints for adding, retrieving, updating, and deleting user information. The Job model includes attributes such as id, title, description, salary , jobType , companyName, and applyDate etc. The project uses Spring Validation API to validate the fields in the Job model, including @NotNull, @NotEmpty annotations and Custom validations .

In summary, this project provides a simple and effective way to manage and search jobs information using the Spring framework. The code is well-documented, and the endpoints are implemented with validation to ensure data integrity. It can be a useful tool for anyone looking to build a  jobSearchPortal using Spring.

## Author

👤 **Ajinkya Padule**

* GitHub: [AjinkyaPersonal](https://github.com/AjinkyaPersonal)

* LinkedIn: [Ajinkya Padule](https://www.linkedin.com/in/ajinkya-padule-04b8541a6/)
    
---

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").
    
---
    
## Show your support

Give a ⭐️ if this project helped you!
    
---
    
## 📝 License

Copyright © 2023 [Ajinkya Padule](https://github.com/AjinkyaPersonal).<br />

This project is [MIT]("url") licensed.
    
---
