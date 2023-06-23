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


```bash
$ git clone https://github.com/your-username/your-project.git
$ cd your-project
$ npm install
