# Random User List Backend

This project is a Spring Boot backend application for managing random user data. It provides RESTful API endpoints for creating, reading, updating, and deleting user information.

## Table of Contents
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Configuration](#configuration)

## Technologies Used

- Java 17
- Spring Boot 2.7.0
- Spring Data JPA
- Hibernate
- Gradle
- H2 Database (for development and testing)
- PostgreSQL (for production)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or later
- Gradle 8.3 or later

### Installation

1. Clone the repository:
   ```
   git clone https://github.com/chakravartyharish/Random-User-List-Back-End.git
   ```
2. Navigate to the project directory:
   ```
   cd Random-User-List-Back-End
   ```
3. Build the project:
   ```
   ./gradlew build
   ```

## Running the Application

To run the application in development mode:

```
./gradlew bootRun
```

The application will start on `http://localhost:8080`.

## API Endpoints

- `GET /api/users`: Retrieve all users
- `GET /api/users/search?name={name}`: Search users by name
- `GET /api/users/{id}`: Retrieve a specific user by ID
- `POST /api/users`: Create a new user
- `PUT /api/users/{id}`: Update an existing user
- `DELETE /api/users/{id}`: Delete a user

## Testing

To run the tests:

```
./gradlew test
```

## Configuration

The application uses different configuration profiles:

- `application-dev.properties`: Development configuration (uses H2 in-memory database)
- `application-prod.properties`: Production configuration (uses PostgreSQL)

To switch between profiles, set the `spring.profiles.active` property in `application.properties` or use the command line argument:

```
java -jar your-application.jar --spring.profiles.active=prod
```

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is open source and available under the [MIT License](LICENSE).
