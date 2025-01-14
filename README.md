# Book Portal API
java spring boot api ~~ integration and unit tests

## Deployment
> mvn clean install

> mvn spring-boot:run

### or with Docker
> docker-compose up -d

## Tech Stack
- Spring Framework
- Java 8
- MySQL

## Tools
- Docker
- AWS S3
- Swagger
- Phpmyadmin

## Features
- Authentication with JWT
- Send account confirmation mail on sign-up
- Reset password link via e-mail
- Add, update, delete, list author
- Add, update, delete, list publisher
- Add, update, delete, list book
- Add, update, delete, list quote
- Add, list category
- Add, update, list comment
- Register with e-mail or social media
- Vote a book
- Add, delete quote to favourite list

## Pre-defined user accounts
<table>
<tr> <th>User</th> <th>Password</th> <th>Role</th></tr>
<tr> <td>admin@appmedia.com</td> <td>123</td> <td>ROLE_USER, ROLE_ADMIN</td> </tr>
<tr> <td>user@appmedia.com</td> <td>123</td> <td>ROLE_USER</td> </tr>
<tr> <td>guest@appmedia.com</td> <td>123</td> <td>ROLE_GUEST</td> </tr>
</table>
