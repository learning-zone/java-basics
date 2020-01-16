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
#### Q. What are the differences between Statement and PreparedStatement interface?
#### Q. What are CLOB and BLOB data types in JDBC?
#### Q. What are the different types of lockings in JDBC?
#### Q. How can we store and retrieve images from the database?
#### Q. How can we store and retrieve the file in the Oracle database?
#### Q. What are the differences between stored procedure and functions?
#### Q. What are stored procedures? How to call stored procedure using JDBC API?
#### Q. What are the JDBC statements?
#### Q. What is batch processing and how to perform batch processing in JDBC?
#### Q. What is database connection pooling? What are the advantages of using a connection pool?
#### Q. What is JDBC Driver?
#### Q. Name 5 JDBC best practices your follow?
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
#### Q. What are the ways to load or register driver ?
#### Q. How to get the Database server details in java program?
#### Q. What is the use of getGeneratedKeys() method in Statement?
#### Q. What is the use of setFetchSize() and setMaxRows() methods in Statement?
#### Q. What is JDBC Savepoint? How to use it?