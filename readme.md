# 🚀 Customer Management with Redis

This project is a **Spring Boot** application that leverages **Redis**, **MapStruct**, and **Spring Data JPA** to store customer data in a Redis cache. You can register customers and retrieve them by ID from Redis. 🛠️

## 🏠 Project Structure

```
com.test.redisTest
🔘 api
    🔧 CustomerController        # REST Controller
    🔧 CustomerControllerApi     # API Interface

🔘 config
    🔧 RedisConfig               # Redis Configuration

🔘 consts
    🔧 UrlConstants              # URL Constants

🔘 dto
    🔧 CustomerRequest           # Customer Registration DTO
    🔧 CustomerResponse          # Customer Response DTO

🔘 entity
    🔧 CustomerEntity            # Customer Entity

🔘 mapper
    🔧 CustomerMapper            # DTO ↔ Entity Conversion with MapStruct

🔘 repository
    🔧 CustomerRepository        # Repository layer

🔘 service
    🔧 RedisTestApplication      # Application Entry Point

🔘 resources
    🔧 application.properties    # Redis Configuration
```

---

## ⚙️ Setup and Run

### 1️⃣ **Requirements**

- 🖥️ **Java 17+**
- 🟢 **Redis (Local or via Docker)**
- 🌐 **Spring Boot 3+**

### 2️⃣ **Running Redis**

You can run Redis locally or using Docker:

```sh
docker run --name redis-container -d -p 6379:6379 redis
```

For local Redis (WSL):

```sh
wsl
redis-cli
```

To test the connection:

```sh
ping
# Output: PONG
```

### 3️⃣ **Run the Project**

```sh
git clone https://github.com/username/redis-customer.git
cd redisTest
mvn clean install
```

---

## 🔥 **Features**

✅ **Customer Registration** 📝
✅ **Redis Cache Usage** 🚀
✅ **DTO - Entity Mapping with MapStruct** 🔄
✅ **Spring Boot REST API** 🛠️

---

## 📌 **API Usage**

### ➕ **Register a Customer**

```http
POST /customer/save
```

👥 **Request Body**

```json
{
  "name": "Fatih",
  "surname": "Özkurt"
}
```

🔄 **Response**

```json
{
  "id": "123e4567-e89b-12d3-a456-426614174000", (random ID)
  "name": "Fatih",
  "surname": "Özkurt"
}
```

---

### 🔍 **Retrieve a Customer**

```http
GET /customer/id
```

🔄 **Response**

```json
{
  "id": "123e4567-e89b-12d3-a456-426614174000", (random ID)
  "name": "Fatih",
  "surname": "Özkurt"
}
```

---

## 🎮 **Checking Redis with CLI**

To see stored keys in Redis:

```sh
SCAN 0 (it's better than scanning with "KEYS *" because SCAB 0 returns values as clusters with the help of a pointer and it does not block the other threads)
```

To retrieve a specific customer record from Redis:

```sh
HGETALL customer:123e4567-e89b-12d3-a456-426614174000
```

---

## 🤝 **Contributing**

If you want to contribute, feel free to **fork** and submit a PR! 🚀

---

## 📝 **License**

This project is licensed under the **MIT License**.

📌 Developed by **@fatihhozkurt**. 😊

