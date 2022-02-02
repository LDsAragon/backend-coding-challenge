# backend-coding-challenge

The goal of this challenge is to implement a REST API for Property entities, while improving the existing base code.
Don't just focus on `.java` files, there could be things to improve or fix anywhere in the project.

Please start by initializing a local Git repository and making an initial commit.
Then take the time to skim through the code and add comments as you see fit before getting too deep into coding, this is
a timed exercise, you may not be able to implement and/or fix everything, so a comment is better than nothing.

Commit as often as possible. Don't worry about the commit messages, we mostly care about the time progression.

Spin up MySQL 8.0:
```commandline
docker run -e "TZ=UTC" -e "MYSQL_ROOT_PASSWORD=secret" --name mysql -p 3306:3306 mysql:8.0.22
```

Initilize the database:
```commandline
mvn flyway:migrate
```

If you are not familiar with Flyway migrations, the database seed is `src/main/resources/db/migration/V1__baseline.sql`.



```commandline
MyNotes Maty

add messajes to the validations constraints
Add lombok,  does it work with ibastis? seems like there is a plugin for that  
Add swagger, 
add and fix checkstyle with google.xml
add and fix sonarLint smells
add tests and jacoco
create/add custom exceptions

lean better docker i used some microsoft tutorial to download install and enable virtualization
learn ibastis  i was reading in here https://www.tutorialspoint.com/mybatis/mybatis_annotations.htm
```