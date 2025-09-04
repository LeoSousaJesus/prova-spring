-----

# 🚀 API RESTful para Cadastro de Leads - Semana Nacional de Ciência e Tecnologia

Bem-vindo ao repositório da API de Cadastro de Leads, desenvolvida para gerenciar inscrições na Semana Nacional de Ciência e Tecnologia\! Este projeto foi criado com foco em padrões **RESTful**, implementando boas práticas de desenvolvimento, testes e modelagem de sistemas, sob a orientação do professor Rômulo C. Silvestre nas disciplinas de Teste de Software, Implementação de Sistemas e Modelagem de Sistemas no SENAI.

Esta API foi construída com tecnologias modernas e robustas, garantindo escalabilidade, manutenibilidade e conformidade com os princípios REST.

-----

## 📋 Sobre o Projeto

Esta API foi projetada para atender ao cadastro de leads para a Semana Nacional de Ciência e Tecnologia, permitindo operações **CRUD** (Create, Read, Update, Delete) de forma eficiente e segura. O projeto segue os princípios RESTful, com endpoints claros, respostas padronizadas e documentação acessível.

O desenvolvimento da API foi baseado nos conceitos práticos de:

  * **Modelagem de Sistemas**: Entidades bem definidas, como **Lead**, mapeadas com JPA/Hibernate.
  * **Implementação de Sistemas**: Código modular e organizado, utilizando o padrão **MVC** do Spring Boot.
  * **Testes de Software**: Testes unitários e de integração para garantir robustez e confiabilidade.

Este projeto é um reflexo do aprendizado prático no SENAI, com foco em soluções reais para desafios do mercado.

-----

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Descrição | Badge |
|------------|-----------|-------|
| ☕ **Java** | Linguagem principal para lógica de negócios | ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) |
| 🌱 **Spring Boot** | Framework para construção da API REST | ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white) |
| 🗃️ **JPA** | Especificação para mapeamento objeto-relacional | ![JPA](https://img.shields.io/badge/JPA-59666C?style=for-the-badge&logo=databricks&logoColor=white) |
| ⚙️ **Hibernate** | Implementação do JPA para persistência de dados | ![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white) |
| 🐬 **MySQL** | Banco de dados relacional | ![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white) |
| 🐦 **Flyway** | Gerenciamento de migrações de banco de dados | ![Flyway](https://img.shields.io/badge/Flyway-CC0200?style=for-the-badge&logo=flyway&logoColor=white) |

-----

## 📦 Pré-requisitos

Antes de executar a API, certifique-se de ter as seguintes ferramentas instaladas:

  * **Java 17+ (JDK)**
  * **MySQL (versão 8.0+)**
  * **Maven** (para gerenciamento de dependências)
  * Um editor de código como **IntelliJ IDEA** ou **VS Code**
  * **Postman** ou **Insomnia** (opcional, para testar os endpoints)

-----

## ⚙️ Como Baixar e Executar a API

Siga os passos abaixo para clonar, configurar e executar o projeto localmente:

### 1\. Clone o Repositório

```bash
git clone https://github.com/LeoSousaJesus/prova-spring.git
cd prova-spring
```

### 2\. Configure o Banco de Dados

Crie um banco de dados MySQL chamado `snct`:

```sql
CREATE DATABASE snct;
```

Atualize as configurações do banco no arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/snct?useSSL=false&serverTimezone=UTC
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=none
spring.flyway.enabled=true
```

### 3\. Execute as Migrações do Flyway

O Flyway gerencia as migrações do banco de dados automaticamente ao iniciar a aplicação. A tabela `tblead` será criada com base nos scripts de migração localizados em `src/main/resources/db/migration`.

### 4\. Compile e Execute a Aplicação

Use o Maven para compilar e executar o projeto via terminal:

```bash
mvn clean install
mvn spring-boot:run
```

A API estará disponível em `http://localhost:8080`.

-----

## 🧪 Teste os Endpoints

Use ferramentas como **Postman** ou **Insomnia** para testar os endpoints. Todos estão disponíveis no caminho `/lead`.

### Endpoints Principais:

  * `GET /lead`: Lista todos os leads.
  * `POST /lead`: Cria um novo lead (envie um JSON no corpo da requisição).
  * `PUT /lead/{id}`: Atualiza um lead existente.
  * `DELETE /lead/{id}`: Remove um lead.

### Exemplo de corpo para o `POST`:

```json
{
  "nome": "João Silva",
  "email": "joao.silva@email.com",
  "telefone": "(11) 99999-9999",
  "cpf": "123.456.789-00"
}
```

-----

## 🔬 Testes de Software

O projeto inclui:

  * **Testes Unitários**: Para validar a lógica de negócios.
  * **Testes de Integração**: Para garantir a comunicação entre as camadas (controladores, serviços e repositórios).

Execute os testes com o comando:

```bash
mvn test
```

-----

## 🌟 Por que este Projeto é Especial?

Este projeto demonstra minha capacidade de:

  * Desenvolver APIs RESTful com Spring Boot e boas práticas.
  * Modelar sistemas com JPA/Hibernate e gerenciar banco de dados com Flyway.
  * Aplicar testes automatizados para garantir a qualidade do software.
  * Trabalhar em equipe, sob orientação de especialistas, para resolver desafios reais do mercado.

Estou entusiasmado para contribuir com soluções robustas e escaláveis em projetos futuros\! 🚀

-----

## 📬 Contato

Se você gostou do projeto ou quer conversar sobre oportunidades, entre em contato comigo:

  * 📧 **Email**: seu.email@example.com
  * 💼 **LinkedIn**: [Seu LinkedIn](https://www.google.com/search?q=https://www.linkedin.com/in/seulinkedin)
  * 🐙 **GitHub**: [LeoSousaJesus](https://www.google.com/search?q=https://github.com/LeoSousaJesus)

-----

Desenvolvido com 💻 e ☕ por Leandro Sousa para o desafio do SENAI.