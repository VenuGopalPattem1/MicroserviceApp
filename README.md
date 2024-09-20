# Microservice Application

## Overview

This microservice application consists of three main modules:

- **Product Service**: Manages product-related operations, including product creation, retrieval, updating, and deletion.
- **Inventory Service**: Handles inventory management, tracking product availability, and stock levels.
- **Order Service**: Manages order processing, including creating and managing customer orders and intercommunication with the Inventory Service to check stock levels.

## Architecture

- **Spring Cloud API Gateway**: Acts as a single entry point for clients, routing requests to the appropriate microservices and providing features such as load balancing and security.
- **External Config Server**: Centralizes configuration management by storing database properties and other configurations in a GitLab properties file, enabling dynamic configuration updates without restarting services.
- **Netflix Eureka Server**: Facilitates service registration and discovery, allowing microservices to find and communicate with each other easily.

## Features

- **Inter-Service Communication**: The Order Service communicates with the Inventory Service to ensure accurate stock availability before processing orders.
- **Centralized Configuration Management**: The Config Server allows you to manage application settings centrally, promoting consistency across services.
- **Load Balancing**: The API Gateway automatically distributes incoming requests to the available instances of services.
- **Service Discovery**: Netflix Eureka enables automatic registration and discovery of microservices, simplifying the management of service instances.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Installation

1. Clone the repository:
   git clone [<repository-url>](https://github.com/VenuGopalPattem1/MicroserviceApp.git)
