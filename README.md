# MakiHub API 🍣

A RESTful API for sushi delivery management built with Spring Boot, JPA/Hibernate, and PostgreSQL.

## 📋 About The Project

MakiHub API is a complete backend solution for sushi delivery restaurants. It provides endpoints for managing customers, products, orders, payments, and the entire ordering workflow.

### Built With

* ![Java](https://img.shields.io/badge/Java-17-orange)
* ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
* ![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-3.x-green)
* ![Hibernate](https://img.shields.io/badge/Hibernate-6.x-yellow)
* ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue)
* ![H2 Database](https://img.shields.io/badge/H2-2.x-lightblue)
* ![Maven](https://img.shields.io/badge/Maven-3.x-red)

## 🚀 Features

- ✅ Complete CRUD operations for Users, Products, Categories, and Orders
- ✅ Order management with multiple items
- ✅ Payment processing integration
- ✅ Product categorization (Combos, Temaki, Hot Rolls, etc.)
- ✅ Order status tracking
- ✅ Exception handling with custom error responses
- ✅ H2 in-memory database for testing
- ✅ PostgreSQL support for production
- ✅ RESTful API design
- ✅ Layered architecture (Resource, Service, Repository)

## 📊 Domain Model

```
User ----------< Order >---------- OrderItem >---------- Product
                  |                                         |
              Payment                                   Category
```

### Entities

- **User**: Customer information (name, email, phone, password)
- **Order**: Order details with timestamp and status
- **Product**: Sushi menu items (name, description, price, image)
- **Category**: Product categories (Combos, Temaki, Sashimi, etc.)
- **OrderItem**: Association between Order and Product with quantity
- **Payment**: Payment information linked to orders

## 🛠️ Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.x
- PostgreSQL 15+ (for production)

### Installation

1. Clone the repository
```bash
git clone https://github.com/yourusername/makihub-api.git
cd makihub-api
```

2. Configure the database (application-dev.properties)
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/makihub_db
spring.datasource.username=postgres
spring.datasource.password=yourpassword
```

3. Build the project
```bash
mvn clean install
```

4. Run the application
```bash
mvn spring-boot:run
```

The API will be available at `http://localhost:8080`

## 🧪 Testing

The project includes H2 in-memory database for testing purposes.

To run with test profile:
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=test
```

Access H2 Console: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (leave empty)

## 📡 API Endpoints

### Users
- `GET /users` - List all users
- `GET /users/{id}` - Get user by ID
- `POST /users` - Create new user
- `PUT /users/{id}` - Update user
- `DELETE /users/{id}` - Delete user

### Products
- `GET /products` - List all products
- `GET /products/{id}` - Get product by ID

### Categories
- `GET /categories` - List all categories
- `GET /categories/{id}` - Get category by ID

### Orders
- `GET /orders` - List all orders
- `GET /orders/{id}` - Get order by ID
- `POST /orders` - Create new order

## 📦 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/yourpackage/makihub/
│   │       ├── entities/          # Domain entities
│   │       ├── repositories/      # Data access layer
│   │       ├── services/          # Business logic layer
│   │       ├── resources/         # REST controllers
│   │       └── config/            # Configuration classes
│   └── resources/
│       ├── application.properties
│       ├── application-test.properties
│       ├── application-dev.properties
│       └── application-prod.properties
```

## 🏗️ Architecture

The project follows a layered architecture pattern:

- **Resource Layer**: REST controllers handling HTTP requests
- **Service Layer**: Business logic and transaction management
- **Repository Layer**: Data persistence using Spring Data JPA
- **Entity Layer**: Domain model with JPA annotations

## 🐳 Database Seeding

The application includes sample data for testing:

**Categories:**
- Combinados (Combos)
- Temaki
- Hossomaki
- Uramaki
- Sashimi
- Hot Roll
- Bebidas (Drinks)
- Sobremesas (Desserts)

**Sample Products:**
- Combinado Executivo
- Temaki Salmão
- Hot Philadelphia
- Sashimi Salmão
- And more...

## 🔒 Exception Handling

The API includes custom exception handling for:
- Resource not found (404)
- Database integrity violations (400)
- General server errors (500)

## 🚢 Deployment

### Heroku (Optional)

The project includes Heroku deployment configuration:

1. Create Heroku app
2. Provision PostgreSQL addon
3. Set environment variables
4. Deploy using Git

```bash
heroku create your-app-name
heroku addons:create heroku-postgresql
git push heroku main
```

## 📝 License

This project is licensed under the MIT License.

## 👨‍💻 Author

Your Name - Josevan Oliveira

Project Link: https://github.com/josivantarcio/MakiHub/

## 🙏 Acknowledgments

* [Spring Boot Documentation](https://spring.io/projects/spring-boot)
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
* [Hibernate ORM](https://hibernate.org/)
* Based on course material by Dr. Nelio Alves - [DevSuperior](https://devsuperior.com.br)

---

Made with ❤️ and ☕
