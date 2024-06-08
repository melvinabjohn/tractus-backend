
# Tractus Backend

## Overview
The Tractus Backend project is a comprehensive backend API solution designed to manage various aspects of a system effectively. Developed using Java Spring Boot, this project emphasizes scalability, security, and efficiency in handling core backend functionalities.

## Features
- **User Authentication and Authorization**: Secure login and registration using Spring Security.
- **Data Management**: CRUD operations for various entities.
- **Role-Based Access Control**: Fine-grained permissions for different user roles.
- **Logging and Monitoring**: Integrated logging and monitoring for performance tracking.
- **API Documentation**: Swagger integration for easy API exploration and testing.

## Technologies Used
- **Java**: Core programming language.
- **Spring Boot**: Framework for building the backend API.
- **Spring Security**: For authentication and authorization.
- **Spring Data JPA**: For database interactions.
- **Hibernate**: ORM for managing database entities.
- **MySQL**: Database management system.
- **Docker**: Containerization for deployment.
- **JUnit & Mockito**: Testing frameworks.
- **Swagger**: API documentation.

## Installation
1. **Clone the repository**:
   ```bash
   git clone https://github.com/melvinabjohn/tractus-backend.git
   ```
2. **Navigate to the project directory**:
   ```bash
   cd tractus-backend
   ```
3. **Build the project**:
   ```bash
   mvn clean install
   ```
4. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

## Usage

### API Endpoints

#### ControlPlaneController
- **Discovery Endpoints**
  - `POST /discoveryEndpoint/Endpoints` : Retrieve discovery endpoints.
  - `POST /discoveryEndpoint/delete` : Delete discovery endpoints by resource ID.
  - `POST /discoveryEndpoint/add` : Add a new discovery endpoint.

- **Digital Twin KIT APIs**
  - `GET /discoveryEndpoint/lookup/shells/{AssetIds}` : Retrieve AAS IDs for given asset IDs.
  - `POST /discoveryEndpoint/Connectors/discovery` : Retrieve available company connectors.

- **Connector KIT APIs**
  - `POST /discoveryEndpoint/catalog/request` : Get catalog details.
  - `POST /discoveryEndpoint/policydefinitions` : Create policy definitions.
  - `POST /discoveryEndpoint/contractdefinitions` : Create contract definitions.
  - `POST /discoveryEndpoint/contractnegotiations` : Create contract negotiations.

#### DataPlaneController
- **Product Management**
  - `GET /pcf/{productId}` : Retrieve product information by product ID.
  - `PUT /pcf/{productId}` : Update product information by product ID.

## Contributing
1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/eclipse-new`).
3. Commit your changes (`git commit -m 'Add some eclipse-new'`).
4. Push to the branch (`git push origin feature/eclipse-new`).
5. Open a Pull Request.

## License


## Contact
**Melvin Abraham**  
- [LinkedIn](https://www.linkedin.com/in/melvinjohnabraham/)
- [Email](mailto:melvinabjohn@gmail.com)
