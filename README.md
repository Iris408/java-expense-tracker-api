# Java Expense Tracker API

A Java expense tracker built progressively from a simple console app to a production-ready REST API with authentication, database persistence, and full CRUD operations.

## Current Version
**v1.0.0 - Console App** - Users can input and view expenses directly in the terminal.

## Roadmap
| Version | Description |
|---------|-------------|
| v1.0.0 ✅ | Console app — user inputs expenses via terminal |
| v2.0.0 | Spring Boot REST API — CRUD endpoints for expenses |
| v3.0.0 | Database — PostgreSQL integration with Spring Data JPA |
| v4.0.0 | Filtering & Totals — filter by category, date range, and spending summaries |
| v5.0.0 | Authentication & Users — JWT auth with Spring Security |
| v6.0.0 | Additional Features — recurring expenses, budget limits, CSV export |
| v7.0.0 | Production Ready — testing, Swagger docs, Docker, cloud deployment |

## Tech Stack

### Current

- Java 17
- Git/GitHub

### Planned

- Spring Boot
- PostgreSQL
- Spring Data JPA
- Spring Security / JWT
- Docker

## Getting Started

### Prerequisites

- Java 17+
- Git

### Installation
```bash
git clone https://github.com/Iris408/java-expense-tracker-api.git
cd java-expense-tracker-api
```
### Running the App

Compile the Java file:
```bash
javac ExpenseTracker.java
```

Run the program:
```bash
java ExpenseTracker
```
**Example Terminal Flow:**

| Enter expense name: | Coffee |
| Enter category: | Food |
| Enter price: | £4.50 |

| --- Expense Details --- |
|-------|-----------------|
| Name: | Coffee |
| Category: | Food |
| Price: | £4.50 |

## License
This project is license under the MIT License.