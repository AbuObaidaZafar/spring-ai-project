Spring AI Backend Application
An AI-powered backend application built with Java, Spring Boot, and Spring AI — exposing RESTful endpoints for intelligent prompt handling and response generation.

Features

RESTful API endpoints for sending prompts and receiving AI-generated responses
Modular, loosely coupled backend architecture
Easy integration with multiple AI models via Spring AI
Clean separation of controller, service, and configuration layers
Dependency management via Maven


Tech Stack
LayerTechnologyLanguageJava 17FrameworkSpring Boot 3.xAI IntegrationSpring AIAPIREST APIBuild ToolMavenVersion ControlGit & GitHub

Project Structure
springAiProject/
├── src/
│   └── main/
│       └── java/
│           └── com/springai/
│               ├── controller/      # REST API controllers
│               ├── service/         # Business logic
│               └── config/          # Spring AI configuration
├── pom.xml
└── src/main/resources/
    └── application.properties       # API keys & config

Getting Started
Prerequisites

Java 17 or higher
Maven 3.8+
An OpenAI API key (or compatible AI provider key)

Installation
1. Clone the repository
bashgit clone https://github.com/AbuObaidaZafar/spring-ai-project.git
cd spring-ai-project/springAiProject
2. Add your API key
Open src/main/resources/application.properties and add:
propertiesspring.ai.openai.api-key=YOUR_API_KEY_HERE
spring.ai.openai.chat.model=gpt-3.5-turbo
3. Build the project
bashmvn clean install
4. Run the application
bashmvn spring-boot:run
The server starts at: http://localhost:8080

API Endpoints
Chat / Prompt
MethodEndpointDescriptionGET/api/chat?message={prompt}Send a prompt, get AI responsePOST/api/chatSend a prompt via request body
Example Request
bashGET http://localhost:8080/api/chat?message=What is Spring AI?
Example Response
json{
  "response": "Spring AI is a framework that brings AI capabilities to Spring applications, allowing developers to integrate AI models easily using familiar Spring patterns."
}

Testing with Postman

Open Postman
Create a new GET request
URL: http://localhost:8080/api/chat?message=Hello
Click Send
View the AI response in the response body


Key Concepts Used

Spring AI — framework for integrating AI models into Spring applications
REST API design — clean endpoint structure with proper HTTP methods
Modular architecture — loosely coupled layers for easy maintenance and scaling
Maven — dependency management and project build lifecycle


Author
Abu Obaida Zafar

GitHub: @AbuObaidaZafar
LinkedIn: linkedin.com/in/abuobaidazafar
Email: obaidajmi07@gmail.com


License
This project is open source and available under the MIT License.
