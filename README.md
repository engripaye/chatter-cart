# ChatterCart – Chat-Based Online Ordering System

⸻

🔧 Tech Stack Overview ✅

LayerTechnology
BackendJava 21, Spring Boot 3.5, Spring WebSocket, Spring Data JPA
DatabaseMySQL or MongoDB
CacheRedis (for session, chat message queue, etc.)
FrontendHTML/Thymeleaf or React
Chatbot AIGPT (OpenAI) or Gemini (Google) [Bonus]

⸻

📦 Project Modules ✅

1. User Service
•Manages registration, login, JWT-based authentication, roles.

2. Product Service
•CRUD for products, categories, and availability.

3. Order Service
•Create, track, and manage orders.

4. Notification Service
•Sends real-time order updates using WebSocket/SSE.

5. Chatbot Integration (Optional Bonus)
•Accepts order requests in natural language and converts to order flows.

⸻

📁 Folder Structure (Monolith to Start) ✅

chattercart/
├── user-service/
├── product-service/
├── order-service/
├── notification-service/
├── shared/
│   └── common-dtos/
├── frontend/
│   └── index.html or React app
└── docker-compose.yml

⸻

🔐 Build ✅

⸻

Use Spring Initializr for each microservice or a combined monolith to start:

Dependencies:
•Spring Web
•Spring Data JPA
•MySQL Driver
•Spring Security
•Spring WebSocket
•Lombok
•Spring Boot DevTools
•Redis (Optional)
•Thymeleaf (if using server-rendered frontend)

⸻
