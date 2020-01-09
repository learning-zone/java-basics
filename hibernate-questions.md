## Hibernate Interview Questions & Answers

#### Q. How to integrate hibernate with spring boot?

**Step 01: Maven Dependencies**
```xml
<!-- pom.xml -->
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
    http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.1.5.RELEASE</version>
        <relativePath /> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.javaexample.demo</groupId>
    <artifactId>SpringBoot2Demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>SpringBoot2Demo</name>
    <description>Demo project for Spring Boot</description>
 
    <properties>
        <java.version>1.8</java.version>
    </properties>
 
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
 
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
 
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <scope>runtime</scope>
        </dependency>
 
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
 
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
 
</project>
```
* **spring-boot-starter-data-jpa**(required): It includes spring data, hibernate, HikariCP, JPA API, JPA Implementation (default is hibernate), JDBC and other required libraries.

**Step 02: Create JPA entity classes**  

```java
/** EmployeeEntity.java **/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="TBL_EMPLOYEES")
public class EmployeeEntity {
 
    @Id
    @GeneratedValue
    private Long id;
     
    @Column(name="first_name")
    private String firstName;
     
    @Column(name="last_name")
    private String lastName;
     
    @Column(name="email", nullable=false, length=200)
    private String email;
     
    //Setters and getters left out for brevity.
 
    @Override
    public String toString() {
        return "EmployeeEntity [id=" + id + ", firstName=" + firstName + 
                ", lastName=" + lastName + ", email=" + email   + "]";
    }
}
```
**Step 03: Create JPA Repository**  

Extend `JpaRepository` interface to allows to create repository implementations automatically, at runtime, for any given entity class. The types of entity class and it’s ID field are specified in the generic parameters on JpaRepository.
```java
/** EmployeeRepository.java **/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.javaexample.demo.entity.EmployeeEntity;
 
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
 
}
```
By this simple extension, EmployeeRepository inherits several methods for working with Employee persistence, including methods for saving, deleting, and finding Employee entities.

**Step 04: Properties Configuration**  

**application.properties**  
```
spring.datasource.url=jdbc:h2:file:~/test
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
 
# Enabling H2 Console
spring.h2.console.enabled=true
 
# Custom H2 Console URL
spring.h2.console.path=/h2-console


#Turn Statistics on and log SQL stmts
 
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
 
#If want to see very extensive logging
spring.jpa.properties.hibernate.generate_statistics=true
logging.level.org.hibernate.type=trace
logging.level.org.hibernate.stat=debug

#Schema will be created using schema.sql and data.sql files
 
spring.jpa.hibernate.ddl-auto=none
```
```sql
## schama.sql
DROP TABLE IF EXISTS TBL_EMPLOYEES;
  
CREATE TABLE TBL_EMPLOYEES (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL,
    email VARCHAR(250) DEFAULT NULL
);

## data.sql
INSERT INTO TBL_EMPLOYEES 
    (first_name, last_name, email) 
VALUES
    ('Lokesh', 'Gupta', 'abc@gmail.com'),
    ('Deja', 'Vu', 'xyz@email.com'),
    ('Caption', 'America', 'cap@marvel.com');
```
**Step 05. Spring boot hibernate demo**  

To test hibernate configuration with Spring boot, we need to autowire the EmployeeRepository dependency in a class and use it’s method to save or fetch employee entities.

**SpringBoot2DemoApplication.java**  
```java
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.javaexample.demo.entity.EmployeeEntity;
import com.javaexample.demo.repository.EmployeeRepository;
 
@SpringBootApplication
public class SpringBoot2DemoApplication implements CommandLineRunner {
 
    private Logger logger = LoggerFactory.getLogger(this.getClass());
     
    @Autowired
    EmployeeRepository repository;
     
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot2DemoApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception 
    {       
        Optional<EmployeeEntity> emp = repository.findById(2L);
 
        logger.info("Employee id 2 -> {}", emp.get());
    }
}
```
Output
```
Tomcat initialized with port(s): 8080 (http)
Starting service [Tomcat]
Starting Servlet engine: [Apache Tomcat/9.0.19]
Initializing Spring embedded WebApplicationContext
Root WebApplicationContext: initialization completed in 5748 ms
 
HikariPool-1 - Starting...
HikariPool-1 - Start completed.
HHH000204: Processing PersistenceUnitInfo [
    name: default
    ...]
HHH000412: Hibernate Core {5.3.10.Final}
HHH000206: hibernate.properties not found
HCANN000001: Hibernate Commons Annotations {5.0.4.Final}
HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
 
Initialized JPA EntityManagerFactory for persistence unit 'default'
Initializing ExecutorService 'applicationTaskExecutor'
spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. 
Explicitly configure spring.jpa.open-in-view to disable this warning
Tomcat started on port(s): 8080 (http) with context path ''
Started SpringBoot2DemoApplication in 17.638 seconds (JVM running for 19.1)
 
Hibernate: 
    select
        employeeen0_.id as id1_0_0_,
        employeeen0_.email as email2_0_0_,
        employeeen0_.first_name as first_na3_0_0_,
        employeeen0_.last_name as last_nam4_0_0_ 
    from
        tbl_employees employeeen0_ 
    where
        employeeen0_.id=?
 
Employee id 2 -> EmployeeEntity [id=2, firstName=Deja, lastName=Vu, email=xyz@email.com]
```
#### Q. Mention the differences between JPA and Hibernate?
JPA is a specification for accessing, persisting and managing the data between Java objects and the relational database. 

Where as, Hibernate is the actual implementation of JPA guidelines. When hibernate implements the JPA specification, this will be certified by the JPA group upon following all the standards mentioned in the specification. For example, JPA guidelines would provide information of mandatory and optional features to be implemented as part of the JPA implementation.

|Hibernate                                  |JPA                                                  |
|-------------------------------------------|-----------------------------------------------------|
|Hibernate is the object-relational mapping framework which helps to deal with the data persistence.|It is the Java specification to manage the java application with relational data.|
|It’s is one of the best JPA providers.	    |It is the only specification which doesn’t deal with any implementation.|
|In this, we use Session for handling the persistence in an application.|In this, we use the Entity manager.         |
|It is used to map Java data types with database tables and SQL data types.|It is the standard API which allows developers to perform database operations smoothly.|
|The Query language in this is Hibernate Query Language.|The query language of JPA is JPQL (Java Persistence Query Language)|

#### Q. What is HQL and what are its benefits?
Hibernate Query Language (HQL) is an object-oriented query language, similar to SQL, but instead of operating on tables and columns, HQL works with persistent objects and their properties. HQL queries are translated by Hibernate into conventional SQL queries, which in turns perform action on database.

**Advantages Of HQL:**  

* HQL is database independent, means if we write any program using HQL commands then our program will be able to execute in all the databases with out doing any further changes to it
* HQL supports object oriented features like Inheritance, polymorphism,Associations(Relation ships)
* HQL is initially given for selecting object from database and in hibernate 3.x we can doDML operations ( insert, update…) too

**Different Ways Of Construction HQL Select**  

**FROM Clause**
```sql
/** In SQL **/
sql> select * from Employee

/** In HQL **/
String hql = "FROM Employee";
Query query = session.createQuery(hql);
List results = query.list();
```
**AS Clause**
```sql
String hql = "FROM Employee AS E";
Query query = session.createQuery(hql);
List results = query.list();
```
**SELECT Clause**
```sql
String hql = "SELECT E.firstName FROM Employee E";
Query query = session.createQuery(hql);
List results = query.list();
```
**WHERE Clause**  
```sql
String hql = "FROM Employee E WHERE E.id = 10";
Query query = session.createQuery(hql);
List results = query.list();
```
**ORDER BY Clause**
```sql
String hql = "FROM Employee E WHERE E.id > 10 ORDER BY E.salary DESC";
Query query = session.createQuery(hql);
List results = query.list();
```
**GROUP BY Clause**
```sql
String hql = "SELECT SUM(E.salary), E.firtName FROM Employee E " +
             "GROUP BY E.firstName";
Query query = session.createQuery(hql);
List results = query.list();
```
**Using Named Parameters**  
Hibernate supports named parameters in its HQL queries. This makes writing HQL queries that accept input from the user easy and you do not have to defend against SQL injection attacks. Following is the simple syntax of using named parameters −

```sql
String hql = "FROM Employee E WHERE E.id = :employee_id";
Query query = session.createQuery(hql);
query.setParameter("employee_id",10);
List results = query.list();
```
**UPDATE Clause**  
```sql
String hql = "UPDATE Employee set salary = :salary "  + 
             "WHERE id = :employee_id";
Query query = session.createQuery(hql);
query.setParameter("salary", 1000);
query.setParameter("employee_id", 10);
int result = query.executeUpdate();
System.out.println("Rows affected: " + result);
```
**DELETE Clause**  
```sql
String hql = "DELETE FROM Employee "  + 
             "WHERE id = :employee_id";
Query query = session.createQuery(hql);
query.setParameter("employee_id", 10);
int result = query.executeUpdate();
System.out.println("Rows affected: " + result);
```
**INSERT Clause**
```sql
String hql = "INSERT INTO Employee(firstName, lastName, salary)"  + 
             "SELECT firstName, lastName, salary FROM old_employee";
Query query = session.createQuery(hql);
int result = query.executeUpdate();
System.out.println("Rows affected: " + result);
```
**Pagination using Query**
```sql
String hql = "FROM Employee";
Query query = session.createQuery(hql);
query.setFirstResult(1);
query.setMaxResults(10);
List results = query.list();
```
#### Q. Mention the Key components of Hibernate?
#### Q. Explain Session object in Hibernate?
#### Q. How transaction management works in Hibernate?
#### Q. Explain the Criteria object in Hibernate?
#### Q. Explain the Query object in Hibernate?
#### Q. Mention some of the databases that Hibernate supports?
#### Q. What is a One-to-One association in Hibernate?
#### Q. What is One-to-Many association in Hibernate?
#### Q. What is a Many-to-One association in Hibernate?
#### Q. What is Many-to-Many association in Hibernate?
#### Q. What is hibernate caching? Explain Hibernate first level cache?
#### Q. What is second level cache in Hibernate?
#### Q. What is Query level cache in Hibernate?
#### Q. Explain Hibernate configuration file and Hibernate mapping file?
#### Q. What are concurrency strategies?
#### Q. What is Lazy loading in hibernate?
#### Q. Explain the persistent classes in Hibernate?
#### Q. Explain some of the elements of hbm.xml?
#### Q. Describe the method used to create an HQL Query and SQL Query?
#### Q. What is Java Persistence API (JPA)?
#### Q. Name some important interfaces of Hibernate framework?
#### Q. Name some important annotations used for Hibernate mapping?
#### Q. What is Hibernate SessionFactory and how to configure it?
#### Q. What is difference between openSession and getCurrentSession?
#### Q. What is difference between Hibernate Session get() and load() method?
#### Q. How to configure Hibernate Second Level Cache using EHCache?
#### Q. What are different states of an entity bean?
#### Q. What is use of Hibernate Session merge() call?
#### Q. What is difference between Hibernate save(), saveOrUpdate() and persist() methods?
#### Q. What will happen if we don’t have no-args constructor in Entity bean?
#### Q. What is difference between sorted collection and ordered collection, which one is better?
#### Q. What are the collection types in Hibernate?
#### Q. How to implement Joins in Hibernate?
#### Q. Why we should not make Entity Class final?
#### Q. Can we execute native sql query in hibernate?
#### Q. What is the benefit of native sql query support in hibernate?
#### Q. What is Named SQL Query? What are the benefits of Named SQL Query?
#### Q. What is the benefit of Hibernate Criteria API?
#### Q. How to log hibernate generated sql queries in log files?
#### Q. What is cascading and what are different types of cascading?
#### Q. How to integrate log4j logging in hibernate application?
#### Q. What is HibernateTemplate class?
#### Q. How to integrate Hibernate with Servlet or Struts2 web applications?
#### Q. Which design patterns are used in Hibernate framework?
#### Q. What is Hibernate Validator Framework?
#### Q. What is the benefit of Hibernate Tools Eclipse plugin?
#### Q. What are the technologies that are supported by Hibernate?
#### Q. What is your understanding of Hibernate proxy?
#### Q. Can you explain Hibernate callback interfaces?
#### Q. What is your idea regarding session interface?
#### Q. How to create database applications in Java with the use of Hibernate?
#### Q. Can you share your views on mapping description files?
#### Q. What are your thoughts on file mapping in Hibernate?
#### Q. Can you explain version field?
#### Q. What are your views on the function addClass?
#### Q. Can you explain the role of addDirectory() and addjar() methods?
#### Q. What do you understand by Hibernate tuning?
#### Q. Can you explain what is Hibernate Query Language?
#### Q. What is your understanding of Light Object Mapping?
#### Q. What is a dialect?
#### Q. What are HQL queries?
#### Q. What are the possible ways to configure Hibernate framework?
#### Q. What is a connection pool?
#### Q. What is JPA?
#### Q. How does JPA help in Hibernate framework?
#### Q. What are the advantages of using Hibernate over JDBC?
#### Q. What are the configurations involved in Hibernate framework?
#### Q. What is Hibernate configuration file?
#### Q. How does Hibernate create the database connection?
#### Q. What are possible ways to configure object-table mapping?
#### Q. Which annotation is used to declare a class as a hibernate bean?
#### Q. How do I specify table name linked to an entity using annotation?
#### Q. How does a variable in an entity connect to the database column?
#### Q. How do we specify a different column name for the variables mapping?
#### Q. How do we specify a variable to be primary key for the table?
#### Q. How do you configure the dialect in hibernate.cfg.xml?
#### Q. How to configure the database URL and credentials in hibernate.cfg.xml?
#### Q. How to configure the connection pool size?
#### Q. How do you configure folder scan for Hibernate beans?
#### Q. How to configure hibernate beans without Spring framework?
#### Q. What is the purpose of Session.beginTransaction()?
#### Q. Which are the different types of relationships available in Hibernate mapping?
#### Q. Which annotation is used to define the mapping in Java files?
#### Q. Is it possible to connect multiple database in a single Java application using Hibernate?
#### Q. What is a Criteria query in Hibernate?
#### Q. What is load() method of session Object?
#### Q. Does Hibernate support polymorphism?
#### Q. How many Hibernate sessions exist at any point of time in an application?
#### Q. What is N+1 SELECT problem in Hibernate? What are some strategies to solve the N+1 SELECT problem in Hibernate? 
#### Q. What is the requirement for a Java object to become a Hibernate entity object? 
#### Q. What are different types of caches available in Hibernate? 
#### Q. What is different between Session and SessionFactory in Hibernate? 
#### Q. What are other ORM frameworks? Any alternative of Hibernate?
#### Q. What is difference between getCurrentSession() and openSession() in Hibernate? 
#### Q. When do you use merge() and update() in Hibernate? 
#### Q. How do you log SQL queries issued by the Hibernate framework in Java application?
#### Q. What are the three states of a Hibernate Persistence object can be? 
#### Q. What is the difference between the transient, persistent and detached state in Hibernate? 
#### Q. How properties of a class are mapped to the columns of a database table in Hibernate?
#### Q. What is the usage of Configuration Interface in hibernate?
#### Q. How can we use new custom interfaces to enhance functionality of built-in interfaces of hibernate?
#### Q. Should all the mapping files of hibernate have .hbm.xml extension to work properly?
#### Q. How do we create session factory in hibernate?
#### Q. What are POJOs and what is their significance?
#### Q. How can we invoke stored procedures in hibernate?
#### Q. What are the benefits of using Hibernate template?
#### Q. What are the two types of collections in hibernate?
#### Q. What is the difference between session.save() and session.saveOrUpdate() methods in hibernate?
#### Q. How can we get hibernate statistics?
#### Q. How can we reduce database write action times in Hibernate?
#### Q. When an instance goes in detached state in hibernate?
#### Q. What the four ORM levels are in hibernate?
#### Q. What is the default cache service of hibernate?
#### Q. What are the two mapping associations used in hibernate?
#### Q. What is the usage of Hibernate QBC API?
#### Q. In how many ways, objects can be fetched from database in hibernate?
#### Q. How primary key is created by using hibernate?
#### Q. How can we reattach any detached objects in Hibernate?
#### Q. What are different ways to disable hibernate second level cache?
#### Q. What is ORM metadata?
#### Q. Which one is the default transaction factory in hibernate?
#### Q. What is the role of JMX in hibernate?
#### Q. In how many ways objects can be identified in Hibernate?
#### Q. What different fetching strategies are of hibernate?
#### Q. How mapping of java objects is done with database tables?
#### Q. What are derived properties in hibernate?
#### Q. What is meant by a Named SQL Query in hibernate and how its used?
#### Q. What is the difference between load() and get() method in hibernate?
#### Q. What is the use of version property in hibernate?
#### Q. What is attribute oriented programming?
#### Q. What is the use of session.lock() in hibernate?
#### Q. What the three inheritance models are of hibernate?
#### Q. How can we map the classes as immutable?
#### Q. What is general hibernate flow using RDBMS?
#### Q. What is Light Object Mapping?
#### Q. What is difference between managed associations and hibernate associations?
#### Q. Explain hibernate architecture?
#### Q. Mention two components of Hibernate configuration object.
#### Q. How is SQL query created in Hibernate?
#### Q. How can we add criteria to a SQL query?
#### Q. What are the inheritance mapping strategies?
#### Q. What is automatic dirty checking in hibernate?
#### Q. Is it possible to perform collection mapping with One-to-One and Many-to-One?