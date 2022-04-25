# Simple eCommerce Application with SpringBoot and React

This example app shows a simple eCommerce Application with Spring Boot API and CRUD (create, read, update, and delete) its data with a React app.

**Tools:** For this project it was necessary to use tools such as those shown below.

- **Language:** Java
- **Framework backend:** SpringBoot with Maven
- **Framework frontend:** React with Semantic UI

**Objective:** Make an application for a product catalog with the front end separated from the backend applying micro service patterns.

**Prerequisites:** [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html), [Node.js 8+](https://nodejs.org/) and [Mysql Server 5.7](https://dev.mysql.com/downloads/windows/installer/5.7.html).

- [Getting Started](#getting-started)
- [Links](#links)
- [License](#license)

## Getting Started

To install this application, run the following commands:

```bash
git clone https://github.com/devRobots/spring-boot-ecommerce.git spring-boot-ecommerce
cd spring-boot-ecommerce
```

This will get a copy of the project installed locally. To configure all of its dependencies and start each app, follow the instructions below.

### Configure Database

Once MySQL is installed you must configure a username and password. By default the user and password should be `root` . If not, you must configure in the file `application.configure` located in the path `src/main/resources/`.

In the file `application.configure` you must edit the parameters `spring.datasource.username` and `spring.datasource.password` with the values you defined.

### Create Database & Tables

Now you just need to create the database where the project will store the information. To create it, just follow the steps below.

```bash
mysql -u {username} -p
```

This command will ask for your MySQL password. Once inside the MySQL monitor you can create the database with the following command.

```SQL
CREATE DATABASE ecommerce;
```

Now you can run the server which generates the database tables. To run the server, run:

```bash
./mvnw spring-boot:run
```

### Create admin user

Before continuing you must create the user `admin`, in order to perform administrator operations in the application. For this you must create a user on the MySQL monitor with the following command.

```SQL
USE ecommerce;
INSERT INTO user (username, email, is_admin, password) values ('{admin.username}', '{admin.email}', true, '{admin.password}');
```

### Run Frontend Client

Now you can run the frondent client to use the web application. To run the client, run:

```bash
cd ecommerce-frontend
npm start
```


## Import .csv file into a MySQL table
- Check  https://stackoverflow.com/questions/59993844/error-loading-local-data-is-disabled-this-must-be-enabled-on-both-the-client
- Create a table by
``` SQL 
CREATE TABLE ecommerce.options (
    id INT AUTO_INCREMENT PRIMARY KEY,
    symb VARCHAR(255),
    date DATE,
    callVol INT(255),
    longCVol INT(255),
    putVol INT(255),
    longPVol INT(255),
    pcVolR FLOAT(32),
    ttlVol INT(255),
    callOpen INT(255),
    longCOpen INT(255),
    putOpen INT(255),
    longPOpen INT(255),
    pcOpenR FLOAT(32),
    ttlOpen INT(255),
    volOverOpen FLOAT(32),
    volOverShare FLOAT(32),
    openOverShare FLOAT(32),
    changePct FLOAT(32),
    volMulti FLOAT(32)
);
```
- Copy data file into the docker container
```bash
docker cp data/historical_option_daily/all.csv spring-boot-ecommerce-mysql_db_container-1:/data_upload
```
- Enter command line of docker container
```bash
sudo docker exec -it spring-boot-ecommerce-mysql_db_container-1 bash
```
- Insert data into mysql table
```bash
mysql --local-infile=1 --password
```
```SQL
LOAD DATA LOCAL INFILE '/data_upload/all.csv' 
INTO TABLE ecommerce.options 
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;
```




## Links

This example uses the following open source libraries:

- [React](https://reactjs.org/)
- [Semantic UI](https://react.semantic-ui.com/)
- [Spring Boot](https://spring.io/projects/spring-boot)

## License

Apache 2.0, see [LICENSE](LICENSE).