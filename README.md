It basically contains the dynamic web application environment done with Eclipse, so that it can be quite handy to take this demo and just run it. :)

#### Dependencies Used

* **Hibernate**
* **Spring-framework**
* **Spring-security**
* **Spring-social**
* **JSP-Servlet API**
* **JSTL**
* **Log4J**
* **Junit**

#### Environment Used

* **Eclipse Mars**
* **Tomcat 7.0.45**

### Troubleshooting

If you get spring servlet not available error, then follow below steps to resolve it.

* right click on your project and choose properties.
* click on Deployement Assembly.
* click add
* click on "Java Build Path Entries"
* select Maven Dependencies"
* click Finish.
* That it!! rebuild and deploy again

