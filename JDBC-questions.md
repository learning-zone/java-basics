## JDBC Interview Questions


#### Q. What is DAO factory design pattern in Java?
Data Access Object Pattern or DAO pattern is used to separate low level data accessing API or operations from high level business services.

DAO pattern is based on abstraction and encapsulation design principles and shields rest of application from any change in the persistence layer e.g. change of database from Oracle to MySQL, change of persistence technology e.g. from File System to Database.

Step 1: Create Value Object [ Student.java ]
```java
public class Student {
   private String name;
   private int rollNo;

   Student(String name, int rollNo){
      this.name = name;
      this.rollNo = rollNo;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getRollNo() {
      return rollNo;
   }

   public void setRollNo(int rollNo) {
      this.rollNo = rollNo;
   }
}
```

Step 2: Create Data Access Object Interface [ StudentDao.java ]
```java
import java.util.List;

public interface StudentDao {
   public List<Student> getAllStudents();
   public Student getStudent(int rollNo);
   public void updateStudent(Student student);
   public void deleteStudent(Student student);
}
```

Step 3: Create concrete class implementing above interface [ StudentDaoImpl.java ] 
```java
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	
   // list is working as a database
   List<Student> students;

   public StudentDaoImpl(){
      students = new ArrayList<Student>();
      Student student1 = new Student("Robert",0);
      Student student2 = new Student("John",1);
      students.add(student1);
      students.add(student2);		
   }
   @Override
   public void deleteStudent(Student student) {
      students.remove(student.getRollNo());
      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
   }

   // retrive list of students from the database
   @Override
   public List<Student> getAllStudents() {
      return students;
   }

   @Override
   public Student getStudent(int rollNo) {
      return students.get(rollNo);
   }

   @Override
   public void updateStudent(Student student) {
      students.get(student.getRollNo()).setName(student.getName());
      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
   }
}
```
Step 4: Use the StudentDao to demonstrate Data Access Object pattern usage [ DaoPatternDemo.java ]
```java
public class DaoPatternDemo {
   public static void main(String[] args) {
      StudentDao studentDao = new StudentDaoImpl();

      // print all students
      for (Student student : studentDao.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
      }

      // update student
      Student student =studentDao.getAllStudents().get(0);
      student.setName("Michael");
      studentDao.updateStudent(student);

      // get the student
      studentDao.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
   }
}
```
Output:
```java
Student: [RollNo : 0, Name : Robert ]
Student: [RollNo : 1, Name : John ]
Student: Roll No 0, updated in the database
Student: [RollNo : 0, Name : Michael ]
```
#### Q. What are the differences between ResultSet and RowSet?
A **ResultSet** maintains a connection to a database and because of that it can’t be serialized and also we cant pass the Resultset object from one class to other class across the network.

**RowSet** is a disconnected, serializable version of a JDBC ResultSet and also the RowSet extends the ResultSet interface so it has all the methods of ResultSet. The RowSet can be serialized because it doesn’t have a connection to any database and also it can be sent from one class to another across the network.

|ResultSet	                           |RowSet                                                                        |
|--------------------------------------|------------------------------------------------------------------------------|
|A ResultSet always maintains connection with the database.|A RowSet can be connected, disconnected from the database.|
|It cannot be serialized.	            |A RowSet object can be serialized.|
|ResultSet object cannot be passed other over network.|You can pass a RowSet object over the network.|
|ResultSet object is not a JavaBean object You can create/get a result set using the executeQuery() method.|ResultSet Object is a JavaBean object. You can get a RowSet using the RowSetProvider.newFactory().createJdb cRowSet() method.|
|By default, ResultSet object is not scrollable or, updatable.|By default, RowSet object is scrollable and updatable.|

#### Q. How can we execute stored procedures using CallableStatement?
**CallableStatement** interface in java is used to call stored procedure from java program. **Stored Procedures** are group of statements that we compile in the database for some task. Stored procedures are beneficial when we are dealing with multiple tables with complex scenario and rather than sending multiple queries to the database, we can send required data to the stored procedure and have the logic executed in the database server itself.

A CallableStatement object provides a way to call stored procedures using JDBC. Connection.prepareCall() method provides you CallableStatement object.

```sql
create or replace procedure "INSERTUSERS"  
(id IN NUMBER,  
name IN VARCHAR2)  
is  
begin  
insert into users values(id,name);  
end;  
/    
```
```java
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * 
 * A Simple example to use CallableStatement in Java Program.
 */
public class Proc {  

   public static void main(String[] args) throws Exception{  
     try {
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
     } catch (Exception e) {
       e.printStackTrace();
     }
      
      String SQL = "{call INSERTUSERS(?,?)}";
      CallableStatement stmt = con.prepareCall(SQL);  
      stmt.setInt(1,1011);  
      stmt.setString(2,"Alex");  
      ResultSet rs = stmt.executeQuery();
    
      while(rs.next()){
        System.out.println(rs.getString(1));
      }
      
      rs.close();
   }  
}  
```
#### Q. What are the differences between Statement and PreparedStatement interface?
JDBC API provides 3 different interfaces to execute the different types of SQL queries. They are,

* **Statement**  –  Used to execute normal SQL queries.
* **PreparedStatement**  –  Used to execute dynamic or parameterized SQL queries.
* **CallableStatement**  –  Used to execute the stored procedures.

**1. Statement**  

Statement interface is used to execute normal SQL queries. We can’t pass the parameters to SQL query at run time using this interface. This interface is preferred over other two interfaces if we are executing a particular SQL query only once. The performance of this interface is also very less compared to other two interfaces. In most of time, Statement interface is used for DDL statements like **CREATE, ALTER, DROP** etc.
```sql
/** Creating The Statement Object **/
Statement stmt = con.createStatement();
  
/** Executing The Statement **/
stmt.executeUpdate("CREATE TABLE STUDENT(ID NUMBER NOT NULL, NAME VARCHAR)");
```
**2. PreparedStatement**  

PreparedStatement is used to execute dynamic or parameterized SQL queries. PreparedStatement extends Statement interface. We can pass the parameters to SQL query at run time using this interface. It is recommended to use PreparedStatement if we are executing a particular SQL query multiple times. It gives better performance than Statement interface. Because, PreparedStatement are precompiled and the query plan is created only once irrespective of how many times we are executing that query. 
```sql
/** Creating PreparedStatement object **/
PreparedStatement pstmt = con.prepareStatement("update STUDENT set NAME = ? where ID = ?");
  
/** Setting values to place holders using setter methods of PreparedStatement object **/
pstmt.setString(1, "MyName");   /** Assigns "MyName" to first place holder **/
          
pstmt.setInt(2, 111);     /** Assigns "111" to second place holder **/
 
/** Executing PreparedStatement **/
pstmt.executeUpdate();
```
**3. CallableStatement**  

CallableStatement is used to execute the stored procedures. CallableStatement extends PreparedStatement. Usng CallableStatement, we can pass 3 types of parameters to stored procedures. They are : **IN** – used to pass the values to stored procedure, **OUT** – used to hold the result returned by the stored procedure and **IN OUT** – acts as both IN and OUT parameter. Before calling the stored procedure, we must register OUT parameters using **registerOutParameter()** method of CallableStatement. The performance of this interface is higher than the other two interfaces. Because, it calls the stored procedures which are already compiled and stored in the database server.
```sql
/** Creating CallableStatement object **/
CallableStatement cstmt = con.prepareCall("{call anyProcedure(?, ?, ?)}");
 
/** Use cstmt.setter() methods to pass IN parameters **/
 
/** Use cstmt.registerOutParameter() method to register OUT parameters **/
 
/** Executing the CallableStatement **/
 
cstmt.execute();
 
/** Use cstmt.getter() methods to retrieve the result returned by the stored procedure **/
```
#### Q. What are the different types of locking in JDBC?
The types of locks in JDBC:

**1. Row and Key Locks**: Useful when updating the rows (update, insert or delete operations), as they increase concurrency.

**2. Page Locks**: Locks the page when the transaction updates or inserts or deletes rows or keys. The database server locks the entire page that contains the row. The lock is made only once by database server, even more rows are updated. This lock is suggested in the situation where large number of rows is to be changed at once.

**3. Table Locks**: Utilizing table locks is efficient when a query accesses most of the tables of a table. These are of two types:
**a) Shared lock**: One shared lock is placed by the database server, which prevents other to perform any update operations.

**b) Exclusive lock**: One exclusive lock is placed by the database server, irrespective of the number of the rows that are updated.

**4. Database Lock**: In order to prevent the read or update access from other transactions when the database is open, the database lock is used.

#### Q. What are the differences between Stored Procedure and functions?
|Functions	               |Procedures                                       |
|--------------------------|-------------------------------------------------|
|A function has a return type and returns a value.|A procedure does not have a return type. But it returns values using the OUT parameters.|
|You cannot use a function with Data Manipulation queries. Only Select queries are allowed in functions.|You can use DML queries such as insert, update, select etc… with procedures.|
|A function does not allow output parameters	|A procedure allows both input and output parameters.|
|You cannot manage transactions inside a function.|You can manage transactions inside a function.|
|You cannot call stored procedures from a function|You can call a function from a stored procedure.|
|You can call a function using a select statement.|You cannot call a procedure using select statements.|

#### Q. What is batch processing and how to perform batch processing in JDBC?
Batch Processing allows to group related SQL statements into a batch and submit them with one call to the database. The `java.sql.Statement` and `java.sql.PreparedStatement` interfaces provide methods for batch processing.

* **addBatch()**: The addBatch() method of Statement, PreparedStatement, and CallableStatement is used to add individual statements to the batch.

* **executeBatch()**: The executeBatch() is used to start the execution of all the statements grouped together. The executeBatch() returns an array of integers, and each element of the array represents the update count for the respective update statement.

* **clearBatch()**: This method removes all the statements added with the addBatch() method. 

**Batching with Statement Object**  
```sql
// Create statement object
Statement stmt = conn.createStatement();

// Set auto-commit to false
conn.setAutoCommit(false);

// Create SQL statement
String SQL = "INSERT INTO Employees (id, first, last, age) " +
             "VALUES(200,'Zia', 'Ali', 30)";
// Add above SQL statement in the batch.
stmt.addBatch(SQL);

// Create one more SQL statement
String SQL = "INSERT INTO Employees (id, first, last, age) " +
             "VALUES(201,'Raj', 'Kumar', 35)";
// Add above SQL statement in the batch.
stmt.addBatch(SQL);

// Create one more SQL statement
String SQL = "UPDATE Employees SET age = 35 " +
             "WHERE id = 100";
// Add above SQL statement in the batch.
stmt.addBatch(SQL);

// Create an int[] to hold returned values
int[] count = stmt.executeBatch();

//Explicitly commit statements to apply changes
conn.commit();
```
**Batching with PrepareStatement Object**   
```sql
// Create SQL statement
String SQL = "INSERT INTO Employees (id, first, last, age) " +
             "VALUES(?, ?, ?, ?)";

// Create PrepareStatement object
PreparedStatemen pstmt = conn.prepareStatement(SQL);

//Set auto-commit to false
conn.setAutoCommit(false);

// Set the variables
pstmt.setInt( 1, 400 );
pstmt.setString( 2, "Pappu" );
pstmt.setString( 3, "Singh" );
pstmt.setInt( 4, 33 );
// Add it to the batch
pstmt.addBatch();

// Set the variables
pstmt.setInt( 1, 401 );
pstmt.setString( 2, "Pawan" );
pstmt.setString( 3, "Singh" );
pstmt.setInt( 4, 31 );
// Add it to the batch
pstmt.addBatch();

//add more batches
.
.
.
.
// Create an int[] to hold returned values
int[] count = stmt.executeBatch();

// Explicitly commit statements to apply changes
conn.commit();
```
#### Q. What is database connection pooling? What are the advantages of using a connection pool?
**Connection pooling** means that connections are reused rather than created each time a connection is requested. To facilitate connection reuse, a memory cache of database connections, called a connection pool, is maintained by a connection pooling module as a layer on top of any standard JDBC driver product.

Connection pooling is performed in the background and does not affect how an application is coded; however, the application must use a DataSource object (an object implementing the DataSource interface) to obtain a connection instead of using the DriverManager class. 


**JDBC 3.0 API Framework**  

The JDBC 3.0 API specifies a ConnectionEvent class and the following interfaces as the hooks for any connection pooling implementation:

* ConnectionPoolDataSource
* PooledConnection
* ConnectionEventListener

#### Q. What is JDBC Driver?
#### Q. What are the JDBC API components?
#### Q. What is the role of JDBC DriverManager class?
#### Q. What is JDBC Connection interface?
#### Q. What is the purpose of JDBC ResultSet interface?
#### Q. What is JDBC ResultSetMetaData interface?
#### Q. What is JDBC DatabaseMetaData interface?
#### Q. What is the return type of Class.forName() method?
#### Q. How can we set null value in JDBC PreparedStatement?
#### Q. What are the differences between execute, executeQuery, and executeUpdate?
#### Q. Which interface is responsible for transaction management in JDBC?
#### Q. How can we maintain the integrity of a database by using JDBC?
#### Q. What is the major difference between java.util.Date and java.sql.Date data type?
#### Q. How do you handle error condition while writing stored procedure or accessing stored procedure from java?
#### Q. How do you iterate ResultSet in the reverse order?
#### Q. What is the use of setAutoCommit() method?
#### Q. What is a “dirty read”?
#### Q. What are the ways to load or register driver?
#### Q. How to get the Database server details in java program?
#### Q. What is the use of getGeneratedKeys() method in Statement?
#### Q. What is the use of setFetchSize() and setMaxRows() methods in Statement?
#### Q. What is JDBC Savepoint? How to use it?
#### Q. What are CLOB and BLOB data types in JDBC?
#### Q. Explain optimistic and pessimistic locking in JDBC?
#### Q. How can we store and retrieve images from the database?
#### Q. How can we store and retrieve the file in the Oracle database?

