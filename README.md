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

This project is a job search portal that allows CRUD operations on a Job entity with added validation on the entity class. The project is built using Spring Boot and H2 Database.

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Language Used
* Java

---
<br>

## Data Model

The Job data model is defined in the Job class, which has the following attributes:
```
id (Long): unique identifier for the job
title (String): title of the job
description (String): description of the job
location (String): location of the job
salary (Double): salary offered by the job
companyName (String): name of the company offering the job
employerName (String): name of the employer who posted the job
jobType (Some-Enum): type of job offered (IT, HR, Sales, Marketing, etc.)
appliedDate (LocalDate): optional date when the job was applied for
```

### Validation

To validate the input we get from client, we've used validation annotations that are used to enforce specific constraints on the values of the variables. These constraints ensure that the data input by the user is of the correct format and meets certain criteria.

* @Valid - In Spring Framework, the @Valid annotation is used in conjunction with @PostMapping and @PutMapping annotations, which are used to handle POST and PUT requests, respectively. When used with @PostMapping or @PutMapping, the @Valid annotation is typically applied to a method parameter annotated with @RequestBody.

* @NotEmpty: This annotation is used to validate that the annotated field is not null or empty. 

* @NotNull: This annotation is used to validate that the annotated field is not null.

* @Length: It is a validation annotation that can be used to ensure that a string value meets certain length requirements (Between 4 to 255 here). It is used to validate input data in web applications.
---
<br>

## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>


## API End Points 

</br>

### Inbuilt @CrudRepo methods
- We're extending CRUDRepository into repository interface.

* PostMapping: "/jobs"
```
This endpoint makes a call to method in jobService class where we implement method "saveAll()" in CRUD Repository.
```

* GetMapping: "/jobs"
```
This endpoint makes a call to method in jobService class which retrieves data of all jobs from database by implementing method "findAll()" present in CRUD repository. This data is sent to controller which is then sent through the API to client.
```

* PutMapping : "/jobs/{jobId}"
```
This endpoint makes a call to method in jobService class which is connected to database. In database we update a job by jobId given through API.
```

* DeleteMapping : "/jobs/{jobId}"
```
This endpoint makes a call to method in jobService class which is connected to database. In database we delete a user by jobId given through API.
```


</br>

### Custom get methods using custom finders (based on method names)
- Custom finder methods are defined in a library to get the data so we don't have to write sql queries to get the data.

* GetMapping : "/jobs/jobType"
```
The user is requesting data to be filtered by job type. We've used custom method findByJobType to get the data from database.
```

* GetMapping : "/jobs/title/location"  
```
The user is requesting data to be filtered by title and location of the job. We've used custom method findByTitleAndLocation to get the data from database.
```


* GetMapping : "/jobs/salary"  
```
The user is requesting data to be filtered by salary of the job. We've used custom method findBySalaryGreaterThan to get the data from database.
```

* GetMapping : "/jobs/description/location" 
```
The user is requesting data to be filtered by description or location of the job. We've used custom method findByDescriptionOrLocation to get the data from database.
```

</br>

### Operations using custom queries (using @Query)

* DeleteMapping : "/job/{companyName}"
```
We're using this mapping to delete jobs by company name. Here we've used custom SQL query to delete data from database
```


* PutMapping : "jobs/{id}/{salary}"
```
We're using this mapping to get jobs by id and update salary for that particular job. Here we've used custom SQL query to update data in our database
```

* GetMapping : "jobs/JobType/{jobType}"
```
The user is requesting data to be filtered by job type. We've used custom SQL query to get the data from database.
```

* GetMapping : ""jobs/{salary}""
```
The user is requesting data to be filtered by salary. We've used custom SQL query to get the data from database.
```
---
<br>


## DataBase Used
* H2 database
```
We have used InMemory database H2 to implement CRUD Operations.
```
---
<br>

## Project Summary

The project is a job search portal built using Spring Boot and H2 Database. It allows CRUD operations on a Job entity with added validation using Spring Boot validation. The Job entity class has fields for job details like title, description, location, salary, company name, employer name, job type, and applied date. The project supports various endpoints for CRUD operations and searching for jobs based on title and description. Custom finders and custom queries are also available for advanced querying.

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
