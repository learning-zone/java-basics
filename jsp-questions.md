## JSP Interview Questions

#### Q. What is JSP Implicit Object? 

* **request**: This is the HttpServletRequest object associated with the request.

Example: index.jsp

```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Implicit Objects</title>
</head>
<body>
  <form action="request.jsp">
    <input type="text" name="username">
    <input type="submit" value="submit">
  </form>
</body>
</html>
```
request.jsp
```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Implicit Objects</title>
</head>
<body>
  <%  String username = request.getParameter("username");
      out.println("Welcome "+ username);
   %>
</body>
</html>
```

* **response**: This is the HttpServletResponse object associated with the response to the client.

Example:
```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Implicit Objects</title>
  </head>
<body>
    <%response.setContentType("text/html"); %>
</body>
</html>
```

* **session**: This is the HttpSession object associated with the request.

Example: index.jsp
```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Implicit Objects</title>
    </head>
<body>
    <% session.setAttribute("user","Pradeep"); %>
    <a href="session.jsp">Click here to get user name</a>
</body>
</html>
```
session.jsp
```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Implicit Objects</title>
    </head>
<body>
    <% String name = (String)session.getAttribute("user");
        out.println("User Name is " +name);
    %>
</body>
</html>
```

* **out**: This is the PrintWriter object used to send output to the client.

Example:
```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Implicit Objects</title>
    </head>
<body>
    <% int num1=10;int num2=20;
        out.println("num1 is " +num1);
        out.println("num2 is "+num2);
    %>
</body>
</html>
```

* **application**: This is the ServletContext object associated with the application context.

Example:
```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Implicit Objects</title>
    </head>
<body>
    <% application.getContextPath(); %>
</body>
</html>
```
* **config**: This is the ServletConfig object associated with the page.

Example: web.xml
```xml
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
         http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
         version="3.1">
    <servlet>
        <servlet-name>comingsoon</servlet-name>
        <servlet-class>mysite.server.ComingSoonServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>comingsoon</servlet-name>
        <url-pattern>/*</url-pattern>
    </servlet-mapping>
</web-app>
```
index.jsp
```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Implicit Objects</title>
    </head>
<body>
    <% String servletName = config.getServletName();
        out.println("Servlet Name is " +servletName);%>
</body>
</html>
```

* **pageContext**: It is used to get, set and remove the attributes from a particular scope.

* **page**: Page implicit variable holds the currently executed servlet object for the corresponding jsp. Acts as this object for current jsp page.

Example:
```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Implicit Objects</title>
    </head>
<body>
    <% String pageName = page.toString();
        out.println("Page Name is " +pageName);
    %>
</body>
</html>
```

* **Exception**: It is used for exception handling in JSP.

Example:
```jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Implicit Objects</title>
    </head>
<body>
    <%  int[] num1={1,2,3,4};
        out.println(num1[5]);
    %>
    <%= exception %>
</body>
</html>
```
#### Q. What are the life-cycle methods for a jsp?
#### Q. How to disable caching on back button of the browser?
#### Q. What are the different tags provided in JSTL?
#### Q. How to disable session in JSP?
#### Q. How to delete a Cookie in a JSP?
#### Q. How is JSP better than Servlet technology?
#### Q. What are the JSP implicit objects?
#### Q. What are the differences between include directive and include action?
#### Q. Explain the jspDestroy() method.
#### Q. Why should we not configure JSP standard tags in web.xml?
#### Q. What is busy spin? Why should you use it?
#### Q. How do you take thread dump in Java?
#### Q. is Swing thread-safe?
#### Q. What is a thread local variable in Java?
#### Q. Can we create an Immutable object, which contains a mutable object?
#### Q. How do you convert bytes to long in Java?
#### Q. Can we cast an int value into byte variable? what will happen if the value of int is larger than byte?
#### Q. There are two classes B extends A and C extends B, Can we cast B into C e.g. C = (C) B;
#### Q. Which class contains clone method? Cloneable or Object?
#### Q. Is ++ operator is thread-safe in Java?
#### Q. Difference between a = a + b and a += b ?
#### Q. Can I store a double value in a long variable without casting?
#### Q. What will this return 3*0.1 == 0.3? true or false?
#### Q. Which one will take more memory, an int or Integer?
#### Q. Explain Expression Language in JSP?
#### Q. Which containers use a border layout as their default layout?
#### Q. Which containers use a FlowLayout as their default layout?
#### Q. What are peerless components?
#### Q. is there is any difference between a Scrollbar and a ScrollPane?
#### Q. What is a lightweight component?
#### Q. What is a heavyweight component?