# User Management System

 A Spring-based web application for managing user information.

 # Description: 
 A Spring-based web application for managing user information.</br>
 # Technologies Used: 
 Spring Boot, Spring Data JPA, H2 Database.


# Endpoints:
POST /addUser: Add a new user to the system.</br>
GET /getUser/{userId}: Get user details by their ID.</br>
GET /getAllUser: Get a list of all users in the system.</br>
PUT /updateUserInfo: Update user information.</br>
DELETE /deleteUser/{userId}: Delete a user from the system.</br>
# User Attributes:
userId: Unique identifier for the user.</br>
name: Name of the user.</br>
userName: Username of the user.</br>
address: Address of the user.</br>
phoneNumber: Phone number of the user.</br>



## Installation and Setup:

#### Clone the repository from GitHub.
Import the project into your preferred Java IDE.</br>
Build the project to resolve dependencies.</br>
Run the application using the main method in the @SpringBootApplication annotated class.</br>
## Dependencies:
Spring Web: For building RESTful endpoints.</br>
Spring Data JPA: For interacting with the database.</br>
H2 Database: In-memory database for testing and development purposes.</br>
DevTools (optional): For automatic restarts during development.</br>
### Database Configuration:
The application is configured to use the H2 in-memory database by default.</br>
You can modify the database configuration in the application.properties file if needed.</br>
# Usage:
Use the provided endpoints to perform CRUD operations on user data.</br>
Send HTTP requests to the appropriate endpoints using tools like Postman or cURL.</br>
### Examples:
Include example requests and responses for each endpoint to demonstrate their usage.</br>

# Project Summary:
The User Management System is a Spring-based web application that allows users to manage and store user information. It provides a set of RESTful endpoints for performing CRUD (Create, Read, Update, Delete) operations on user data.

The application is built using Spring Boot, which simplifies the setup and development process. It leverages Spring Data JPA for database interaction, allowing seamless integration with various databases. For simplicity, the project initially uses an H2 in-memory database, but you can easily switch to a different database system if needed.

The User Management System provides the following endpoints:

POST /addUser: Allows adding a new user to the system by providing user details such as name, username, address, and phone number. The endpoint returns the created user with a unique user ID.

GET /getUser/{userId}: Retrieves user details by their unique user ID. The endpoint accepts the user ID as a path variable and returns the corresponding user information.

GET /getAllUser: Retrieves a list of all users in the system. The endpoint returns an array of user objects containing their respective details.

PUT /updateUserInfo: Updates user information by providing a complete user object with modified details. The endpoint saves the updated user information and returns the updated user object.

DELETE /deleteUser/{userId}: Deletes a user from the system based on their user ID. The endpoint accepts the user ID as a path variable and removes the corresponding user from the database.

The User model contains attributes such as user ID, name, username, address, and phone number. These attributes define the structure and properties of a user object.

To use the User Management System, you can send HTTP requests to the appropriate endpoints using tools like Postman or cURL. The responses will include the requested user information or relevant success/failure messages.

The project provides a basic foundation for managing user data and can be extended and customized according to specific business requirements. It offers a scalable and efficient solution for handling user management operations in various applications.

```bash
$ git clone https://github.com/your-username/your-project.git
$ cd your-project
$ npm install
