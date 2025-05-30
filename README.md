# Sistema de Gerenciamento de Carros

## Sobre o Projeto
Este é um sistema de gerenciamento de carros desenvolvido com Spring Boot, que permite o CRUD completo de veículos, incluindo relacionamentos com marcas e proprietários. O projeto foi desenvolvido como uma API RESTful para demonstrar conceitos avançados de Spring Data JPA, relações entre entidades e operações de banco de dados.

## Funcionalidades Principais
- **CRUD completo de carros** (Create, Read, Update, Delete)
- **Gestão de relacionamentos** entre Carros, Marcas e Proprietários
- **Consultas personalizadas**:
  - Busca por nome do carro
  - Filtragem por marca
  - Carros acima de determinado ano
- Validações e tratamento de erros nas requisições

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- Lombok
- PostgresSQL
- Maven

## Estrutura do Projeto
```plaintext
src/
├── main/
│   ├── java/app/
│   │   ├── controller/    # Camada de controle (endpoints REST)
│   │   ├── entity/        # Entidades JPA (Carro, Marca, Proprietario)
│   │   ├── repository/    # Interfaces de repositório (Spring Data JPA)
│   │   ├── service/       # Lógica de negócio
│   │   └── AppApplication.java # Classe principal
│   └── resources/         # Configurações (application.properties)
```

## Principais Entidades
- Carro: Representa um veículo com nome, ano, marca e lista de proprietários
- Marca: Fabricante do veículo
- Proprietario: Dono(s) do veículo

## Relacionamentos
- **Marca → Carro**: One-to-Many (uma marca pode ter vários carros)
- **Carro → Proprietario**: Many-to-Many (um carro pode ter vários proprietários e vice-versa)

## Como Executar
1. Clone o repositório
2. Configure o banco de dados no arquivo `application.properties`
3. Execute a classe `AppApplication`
4. Acesse os endpoints através de `http://localhost:8080/api/carro`

## Documentação da API
- `POST /api/carro/save` - Cadastra um novo carro
- `GET /api/carro/findAll` - Lista todos os carros
- `GET /api/carro/findByMarca?idMarca={id}` - Busca carros por marca
- `GET /api/carro/findAcimaAno?anoCarro={ano}` - Filtra carros acima de determinado ano
