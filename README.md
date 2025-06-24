# API-Tarefas

# 📋 API de Tarefas - Java com Spring Boot

Esta é uma API RESTful desenvolvida com **Java e Spring Boot** para gerenciamento de tarefas. Ela permite criar, visualizar, atualizar e excluir tarefas por meio de endpoints HTTP padronizados.

---

## 🔗 URL Base

A URL base da API segue o padrão:

http://localhost:8080/api/tarefas


---

## 📌 Endpoints

### 1. Criar Tarefa

**Método:** `POST`  
**Rota:** `/api/tarefas`

Este endpoint é utilizado para registrar uma nova tarefa no sistema. A tarefa deve conter informações como título, descrição e status de conclusão.

---

### 2. Listar Todas as Tarefas

**Método:** `GET`  
**Rota:** `/api/tarefas`

Retorna uma lista com todas as tarefas existentes na base de dados. Essa rota é utilizada para exibir o conjunto completo de tarefas cadastradas.

---

### 3. Buscar Tarefa por ID

**Método:** `GET`  
**Rota:** `/api/tarefas/{id}`

Permite recuperar uma tarefa específica com base em seu identificador único. É usada para consultar os detalhes de uma única tarefa.

---

### 4. Atualizar Tarefa

**Método:** `PUT`  
**Rota:** `/api/tarefas/{id}`

Atualiza os dados de uma tarefa já existente, identificada pelo seu ID. Pode ser utilizada para modificar o título, descrição ou o status de conclusão da tarefa.

---

### 5. Deletar Tarefa

**Método:** `DELETE`  
**Rota:** `/api/tarefas/{id}`

Remove uma tarefa do sistema com base no ID fornecido. Após a exclusão, a tarefa deixa de estar disponível na base de dados.

---

## 🧱 Estrutura da Entidade Tarefa

Cada tarefa nesta API possui os seguintes atributos:

- `id`: Identificador único da tarefa (gerado automaticamente).
- `titulo`: Texto curto que representa o nome da tarefa.
- `Nome de quem fará a tarefa`: Campo para indicar quem irá realizar esta tarefa.
- `Descrição` Uma breve descrição do que será a tarefa
- `Prioridade da Tarefa`: Indica a prioridade da tarefa (`Crítica` ou `Média`).

---

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Banco de Dados (ORACLE)**
- **Maven**
- **JSON** como formato de comunicação

---

