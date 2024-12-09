# 📚 **Projeto Microsserviços com NoSQL**

Repositório principal: [Projeto Microsserviços com NoSQL](https://github.com/LucasJoseArantes/ProjetoMicrosservicesNoSQL)

---

## ✏️ **Descrição do Trabalho**

Este projeto foi desenvolvido como parte da disciplina, atendendo aos requisitos propostos para a criação de três microsserviços: **user-api**, **product-api** e **shopping-api**, utilizando **MongoDB** como banco de dados NoSQL. A implementação segue a estrutura de pastas e os endpoints definidos no guia do trabalho.

---

## 🛠️ **Repositórios de Microsserviços**

1. **user-api**  
   - Repositório específico: [user-api](https://github.com/LucasJoseArantes/ProjetoMicrosservicesNoSQL/tree/main/user-api)
   - Implementação dos endpoints relacionados à gestão de usuários.

2. **product-api**  
   - Repositório específico: [product-api](https://github.com/LucasJoseArantes/ProjetoMicrosservicesNoSQL/tree/main/product-api)
   - Implementação dos endpoints relacionados a produtos e categorias.

3. **shopping-api**  
   - Repositório específico: [shopping-api](https://github.com/LucasJoseArantes/ProjetoMicrosservicesNoSQL/tree/main/shopping-api)
   - Implementação dos endpoints relacionados ao registro e consulta de compras.

---

## 📂 **Estrutura de Pastas**

Os três microsserviços seguem a estrutura de pastas padrão, como definido no guia:

Cada microsserviço está configurado de forma independente, com seus respectivos controladores, modelos, serviços e repositórios.

 └── service_name
     ├── controller
     │   └── ServiceController.java
     ├── models
     │   ├── dto
     │   │   └── EntityDTO.java
     │   └── Entity.java
     ├── repositories
     │   └── ServiceRepository.java
     ├── services
     │   └── ServiceService.java
     └── ServiceApplication.java

---

## 🚀 **Implementação**

### 🧑‍💼 **1. user-api**

A **user-api** implementa endpoints para gerenciar usuários. A lógica inclui CRUD completo e consultas específicas, como busca por CPF ou nome.

#### **Endpoints implementados:**
- **`/user`**
  - **POST:** Criar usuário.
  - **GET:** Listar todos os usuários.
  - **GET /{id}:** Buscar usuário por ID.
  - **GET /cpf/{cpf}:** Buscar usuário por CPF.
  - **GET /search:** Buscar usuários por nome.
  - **GET /pageable:** Listar usuários com paginação.
  - **PUT /{id} / PATCH:** Atualizar informações do usuário.
  - **DELETE /{id}:** Remover usuário.

---

### 🛒 **2. product-api**

A **product-api** gerencia produtos e categorias. Implementa lógica de consulta, CRUD e paginação.

#### **Endpoints implementados:**

#### **/category**
  - **GET /category:** Listar todas as categorias.  
  - **POST /category:** Criar nova categoria.  
  - **PUT /category/{id}:** Atualizar uma categoria pelo ID.  
  - **DELETE /category/{id}:** Remover uma categoria pelo ID.  
  - **GET /category/pageable:** Listar categorias com paginação.  

---

#### **/product**
  - **GET /product:** Listar todos os produtos.  
  - **GET /product/{id}:** Buscar produto por ID.  
  - **POST /product:** Criar um novo produto.  
  - **PUT /product/{id}:** Atualizar um produto pelo ID.  
  - **DELETE /product/{id}:** Remover um produto pelo ID.  
  - **GET /product/pageable:** Listar produtos com paginação.  
  - **GET /product/category/{categoryId}:** Buscar produtos por ID da categoria.  
  - **GET /product/{productIdentifier}:** Buscar produtos por identificador único.

---

## 🏆 **3. shopping-api**

A **shopping-api** gerencia compras, permitindo registrar e consultar dados relacionados a transações.

#### **Endpoints implementados:**
- **GET /shopping:** Listar todas as compras.  
- **GET /shopping/{id}:** Buscar compra pelo ID.  
- **POST /shopping:** Criar uma nova compra.  
- **GET /shopping/shopByUser:** Listar compras por identificador de usuário.  
- **GET /shopping/shopByDate:** Buscar compras em intervalo de datas.  
- **GET /shopping/{productIdentifier}:** Buscar compras relacionadas a um produto específico.  
- **GET /shopping/search:** Buscar compras filtradas por intervalo de datas e valor mínimo.  
- **GET /shopping/report:** Gerar relatório de compras em um intervalo de datas.

---

## 📝 **Referências**

A implementação seguiu as orientações do PDF **"09 - Novos serviços_ product-api e shopping-api"**, com as seguintes práticas implementadas:

1. **DTOs:** Utilizados para desacoplar a lógica do banco de dados da lógica de negócio na camada de exposição da API.
2. **Repositórios:** Utilizando o Spring Data MongoDB para manipulação de dados no MongoDB.
3. **Serviços:** Implementação de lógica de negócios nos serviços para atender aos endpoints.
4. **Endpoints:** Todos os endpoints seguem a lógica definida no guia do trabalho e estão implementados usando o padrão RESTful.

---

## 📌 **Conclusão**

Os microsserviços implementados (`user-api`, `product-api`, `shopping-api`) estão funcionalmente separados e configurados com as operações necessárias para atender aos critérios definidos no guia do projeto.

Caso tenha dúvidas, comentários ou feedback, sinta-se à vontade para entrar em contato!

**Desenvolvedor:** Lucas José Arantes  
**Data da entrega:** 09/12/2024

--- 

✨ **Link para o repositório principal:** [Projeto Microsserviços com NoSQL](https://github.com/LucasJoseArantes/ProjetoMicrosservicesNoSQL)
🚀 **Links dos microsserviços:**  
- [user-api](https://github.com/LucasJoseArantes/ProjetoMicrosservicesNoSQL/tree/main/user_api)  
- [product-api](https://github.com/LucasJoseArantes/ProjetoMicrosservicesNoSQL/tree/main/product_api)  
- [shopping-api](https://github.com/LucasJoseArantes/ProjetoMicrosservicesNoSQL/tree/main/shopping_api)