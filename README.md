It basically contains the dynamic web application environment done with Eclipse, so that it can be quite handy to take this demo and just run it. :)

#### Dependencies Used

* Hibernate
* Spring-framework
* Spring-security
* Spring-social
* JSP-Servlet API
* JSTL
* Log4J
* Junit

#### Environment Used

* Eclipse Mars
* Tomcat 7.0.45

### Troubleshooting

* How to replicate this repository?

1. Make sure that you have installed GIT on your machine. If not, please download it from [here](https://git-scm.com/downloads)
2. Confirm correct installation. Open your command line tool and type : `**git --version**`
3. Make new repository on GitHub.com, Let's say newRepo
4. Go to any temp localtion in your machine. 
    * `cd this/is/any/temp/folder`
5. `git clone --bare https://github.com/exampleuser/oldRepo.git`
6. `cd oldRepo.git`
7. `git push --mirror https://github.com/exampleuser/newRepo.git`
8. `cd ..`
9. `rm -rf oldRepo.git`

* If you get spring servlet not available error, then follow below steps to resolve it.

1. right click on your project and choose properties.
2. click on **Deployement Assembly**.
3. click add
4. click on "Java Build Path Entries"
5. select Maven Dependencies"
6. click Finish.
7. That it!! rebuild and deploy again

