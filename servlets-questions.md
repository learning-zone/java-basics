## Servlets Interview Questions


#### Q. Explain Servlets Lifecycle?
The web container maintains the life cycle of a servlet instance. 

**Stages of the Servlet Life Cycle**: 
1. The servlet is initialized by calling the **init()** method.
1. The servlet calls **service()** method to process a client's request.
1. The servlet is terminated by calling the **destroy()** method.
1. Finally, servlet is garbage collected by the garbage collector of the JVM.

* **The init() Method**
The web container calls the init method only once after creating the servlet instance. The init method is used to initialize the servlet. It is the life cycle method of the javax.servlet.Servlet interface.

Syntax 
```java
public void init(ServletConfig config) throws ServletException {
    // Initialization code...
}
```

* **The service() Method**
The servlet container calls the service() method to handle requests coming from the client and to write the formatted response back to the client. The service() method checks the HTTP request type (GET, POST, PUT, DELETE, etc.) and calls doGet, doPost, doPut, doDelete, etc. 

Syntax
```java
public void service(ServletRequest request, ServletResponse response) 
   throws ServletException, IOException {
}
```

* **The doGet() Method**
A GET request results from a normal request for a URL or from an HTML form that has no METHOD specified and it should be handled by doGet() method.

Syntax
```java
public void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
   // Servlet code
}
```

* **The doPost() Method**
A POST request results from an HTML form that specifically lists POST as the METHOD and it should be handled by doPost() method.

Syntax
```java
public void doPost(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {
   // Servlet code
}
```

* **The destroy() Method**
The web container calls the destroy method before removing the servlet instance from the service. It gives the servlet an opportunity to clean up any resource for example memory, thread etc.

Syntax
```java
public void destroy() {
   // Finalization code...
}
```
#### Q. What is ServletContext Interface?
ServletContext is a configuration Object which is created when web application is started. It contains different initialization parameter that can be configured in web.xml.

* **ServletContext Interface Methods**

1. **public String getInitParameter(String name)**: Returns the parameter value for the specified parameter name.
2. **public Enumeration getInitParameterNames()**: Returns the names of the context's initialization parameters.
3. **public void setAttribute(String name,Object object)**: sets the given object in the application scope.
4. **public Object getAttribute(String name)**: Returns the attribute for the specified name.
5. **public Enumeration getInitParameterNames()**: Returns the names of the context's initialization parameters as an Enumeration of String objects.
6. **public void removeAttribute(String name)**: Removes the attribute with the given name from the servlet context.

Example: DemoServlet.java
```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DemoServlet extends HttpServlet{
   public void doGet(HttpServletRequest request,HttpServletResponse response)
   throws ServletException,IOException {

       response.setContentType("text/html");
       PrintWriter pwriter=response.getWriter();

       // ServletContext object creation
       ServletContext scontext=getServletContext();

       // fetching values of initialization parameters and printing it
       String userName=scontext.getInitParameter("uname");
       pwriter.println("User name is="+userName);
       String userEmail=scontext.getInitParameter("email");
       pwriter.println("Email Id is="+userEmail);
       pwriter.close();
   }
}
```
web.xml
```xml
<web-app>
    <servlet>
        <servlet-name>UserDetails</servlet-name>
        <servlet-class>DemoServlet</servlet-class>
    </servlet>
    <context-param>
        <param-name>uname</param-name>
        <param-value>Pradeep Kumar</param-value>
    </context-param>
    <context-param>
        <param-name>email</param-name>
        <param-value>pradeep.vwa@gmail.com</param-value>
    </context-param>
    <servlet-mapping>
        <servlet-name>UserDetails</servlet-name>
    <url-pattern>/context</url-pattern>
    </servlet-mapping>
</web-app>
```
#### Q. What is a servlet?
**A servlet** is an interface whose implementation extends the functionality of a server. A servlet interacts with clients through a request-response principle. Although servlets can handle any request, they are commonly used to expand web servers.

Most of the classes and interfaces required to create servlets are contained in `javax.servlet` and packages `javax.servlet.http`.

**Basic servlet methods**

* `public void init(ServletConfig config) throws ServletException` starts immediately after loading the servlet into memory;
* `public ServletConfig getServletConfig()` returns a reference to an object that provides access to servlet configuration information;
* `public String getServletInfo()` returns a string containing information about the servlet, for example: author and version of the servlet;
* `public void service(ServletRequest request, ServletResponse response) throws ServletException, java.io.IOException` called to process each request;
* `public void destroy()` performed before unloading the servlet from memory.

#### Q. What is a Server Side Include (SSI)?
#### Q. What is the difference between doGet() and doPost()?
#### Q. What is a servlet? What is the life-cycle of a servlet?
#### Q. What are the differences between Get and Post methods?
#### Q. What is Request Dispatcher?
#### Q. What are the differences between forward() method and sendRedirect() methods?
#### Q. How does cookies work in Servlets?
#### Q. What are the differences between ServletContext vs ServletConfig?
#### Q. What are the different methods of session management in servlets?
#### Q. What is MIME Type?
#### Q. What is the use of servlet wrapper classes?
#### Q. What is difference between ServletResponse sendRedirect() and RequestDispatcher forward() method?
#### Q. Why HttpServlet class is declared abstract?
#### Q. What is difference between GenericServlet and HttpServlet?
#### Q. How to notify an object in session when session is invalidated or timed-out?
#### Q. What is servlet attributes and their scope?
#### Q. How can we achieve transport layer security for our web application?
#### Q. What is a deployment descriptor?
#### Q. How to make sure a servlet is loaded at the application startup?
#### Q. Write a servlet to upload file on server.
#### Q. How do we go with database connection and log4j integration in servlet?
#### Q. What is the effective way to make sure all the servlets are accessible only when user has a valid session?
#### Q. Why do we have servlet listeners?
#### Q. What are Scriptlets ?
#### Q. What is different between web server and application server?
#### Q. Which HTTP method is non-idempotent?
#### Q. What are the advantages of Servlet over CGI?
#### Q. What are common tasks performed by Servlet Container?
#### Q. What is difference between PrintWriter and ServletOutputStream?
#### Q. How can we create deadlock situation in servlet?
#### Q. What is SingleThreadModel interface?
#### Q. Do we need to override service() method?
#### Q. Is it good idea to create servlet constructor?
#### Q. What is the inter-servlet communication?
#### Q. Are Servlets Thread Safe? How to achieve thread safety in servlets?
#### Q. How do we call one servlet from another servlet?
#### Q. why we should override only no-airs init() method.
#### Q. What is the difference between encodeRedirectUrl and encodeURL?
#### Q. Why do we have servlet filters?
#### Q. How to handle exceptions thrown by application with another servlet?
#### Q. What are different ways for servlet authentication?
#### Q. What is Servlet Chaining?
#### Q. How do you find out what client machine is making a request to your servlet?
#### Q. What is difference between sendRedirect() and forward() in Servlet?

* **SendRedirect()**: This method is declared in **HttpServletResponse** Interface. It is used to redirect client request to some other location for further processing, the new location is available on different server or different context.our web container handle this and transfer the request using  browser, and this request is visible in browser as a new request. 

Signature: 
```java
void sendRedirect(String url)
```

* **Forward()**: This method is declared in **RequestDispatcher** Interface. It is used to pass the request to another resource for further processing within the same server, another resource could be any servlet, jsp page any kind of file.

Signature:
```java
forward(ServletRequest request, ServletResponse response)
```

|Forward()	                                          |SendRediret()                                           |
|-----------------------------------------------------|--------------------------------------------------------
|The forward() method is executed in the server side. |	The sendRedirect() method is executed in the client side.
|The request is transfer to other resource within same server.|	The request is transfer to other resource to different server.|
|It does not depend on the client’s request protocol since the forward ( ) method is provided by the servlet container.|	The sendRedirect() method is provided under HTTP so it can be used only with HTTP clients.|
|The request is shared by the target resource. | New request is created for the destination resource.|
|Only one call is consumed in this method. |Two request and response calls are consumed.
|It can be used within server. | It can be used within and outside the server.|
|The forward() method is faster than sendRedirect() method.	|The sendRedirect() method is slower because when new request is created old request object is lost.|
|It is declared in RequestDispatcher interface. |It is declared in HttpServletResponse.
|Signature: _forward(ServletRequest request, ServletResponse response)_ |Signature: _void sendRedirect(String url)_ |

Example: sendRedirect() method
```java
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
        throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		res.sendRedirect("https://www.java.com/en/");
		out.close();
	}
}
```

Example: forward() method
```html
//index.html

<!DOCTYPE html>
<html>
 <head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
 </head>
<body>
    <form action="Simple" method="get">
        Name: <input type="text" name="username">
        password: <input type="password" name="password"><br />
    <input type="submit" value="Submit" />
    </form>
</body>
</html>
```
SimpleServlet.java
```java
package javaexample.net.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String str = request.getParameter("username");
		String st = request.getParameter("password");
		
		if (st.equals("javaexample")) {
			RequestDispatcher rd = request.getRequestDispatcher("Welcome");
			rd.forward(request, response);
		} else {
			out.print("Sorry username or password incorrect!");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}
}
```
