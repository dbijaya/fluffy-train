# fluffy-train
a simple RESTful CRUD API using Spring-Boot, Hibernate and MySql.

I have made some advancements in this project than in my previous project [furry-train](https://github.com/dbijaya/furry-train).

**Advancements:** 
- MySQL Database: In previous project, I used integrated Apache Derby Database, but this project has MySQL database.
- also, I used Hibernate inplace of JPA. [Hibernate vs. JPA](https://dzone.com/articles/what-is-the-difference-between-hibernate-and-sprin-1#:~:text=Hibernate%20is%20a%20JPA%20implementation,solution%20to%20GenericDao%20custom%20implementations.&text=question%20at%20StackOverflow.-,Hibernate%20provides%20a%20reference%20implementation%20of%20the%20Java%20Persistence%20API,with%20benefits%20of%20loose%20coupling.) , more about [Hibernate](https://www.javaguides.net/p/hibernate-tutorial.html).

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/employee
    
    POST /api/employee
    
    GET /api/employee/{id}
    
    PUT /api/employee
    
    DELETE /api/employee/{id}

Test these requests using Postman or any other HTTP REST-client.

## Set-Up
**1. Clone project:**

    - First, locate to your local Directory.
```bash
git clone https://github.com/dbijaya/fluffy-train/
```

**2. MySQL database:**
```sql
CREATE DATABASE springbootapi;
```

```sql
CREATE TABLE tbl_employee
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    	name VARCHAR(255),
    	gender VARCHAR(255),
    	department VARCHAR(255),
    	dob DATE
)
```

**3. Update application.properties:**
+ change `spring.datasource.username` and `spring.datasource.password` per as your MySql installation set-up.

**4. Run API:**
```bash
mvn spring-boot:run
```

...more to go.

**Wish me Luck !!**
