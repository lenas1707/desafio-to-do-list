# TodoList API

API REST para gerenciamento de tarefas (TodoList) desenvolvida com Spring Boot.

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.5.0
- Spring Data JPA
- MySQL
- H2 Database (para testes)
- Maven
- JUnit 5

## Funcionalidades

- Criar tarefa
- Listar tarefas
- Atualizar tarefa
- Deletar tarefa
- Ordenação por prioridade (decrescente) e nome (crescente)

## Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── br/com/leonardoornelas/desafiotodolist/
│   │       ├── controller/
│   │       │   └── TodoController.java
│   │       ├── entities/
│   │       │   └── Todo.java
│   │       ├── repository/
│   │       │   └── TodoRepository.java
│   │       ├── service/
│   │       │   └── TodoServices.java
│   │       └── DesafiotodolistApplication.java
│   └── resources/
│       └── application.properties
└── test/
    ├── java/
    │   └── br/com/leonardoornelas/desafiotodolist/
    │       └── DesafiotodolistApplicationTests.java
    └── resources/
        └── application.properties
```

## Modelo de Dados

### Todo
- id: Long (gerado automaticamente)
- nome: String
- descricao: String
- realizado: boolean
- prioridade: int

## Endpoints

- POST /todos - Criar nova tarefa
- GET /todos - Listar todas as tarefas
- PUT /todos - Atualizar tarefa
- DELETE /todos/{id} - Deletar tarefa


## Como Executar

1. Clone o repositório
2. Configure o banco de dados MySQL
3. Execute o projeto:
```bash
./mvnw spring-boot:run
```

## Testes

Para executar os testes:
```bash
./mvnw test
```

## Documentação da API

A documentação da API está disponível através do Swagger UI:
http://localhost:8080/swagger-ui.html 