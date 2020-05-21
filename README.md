# Greeting Heroku Deploy

Greeting Heroku Deploy is a spring-boot project write in Java 8. 

It's created as a training to deploy an api in heroku platform.

### Installation

> git clone git@gitlab.com:Ara_Manjon/greeting-heroku-deploy.git
>
> visit [https://heroku-boot-deploy.herokuapp.com](https://heroku-boot-deploy.herokuapp.com)
> 
> start to use endpoints
--------------------------

### Endpoints

#### Hello World!

> GET /hello

#### Hello User!

> GET /hello?name=YourName

#### Add Greeting

> POST /greeting?message=YourMessage

#### Retrieve Greetings

> GET /greetings

### Implementation

1- Create a spring-boot project from [spring initializr](https://start.spring.io)

> Dependencies : JPA, DevTools, Spring Web, PostgreSQL

2- Create a GreetingController with endpoints

3- Create a Greeting entity

4- Create a GreetingRepository interface that extends from CrudRepository

### Heroku deployment

> heroku login
>
> heroku create
>
> visit heroku and change random name by project name and add-ons Heroku Postrges
>
> In the project directory
>
> git init
>
> git add .
>
> git commit -m "initial message"
>
> git remote add Heroku git URL
>
> git push heroku master
>
> heroku open