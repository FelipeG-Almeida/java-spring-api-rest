## API REST com Java Spring

### Introdução
Esta é uma API REST desenvolvida com o framework Java Spring, projetada para simular o sistema de uma clínica médica. Ela permite a interação entre médicos e pacientes, facilitando o gerenciamento das operações da clínica.

### Índice
- [Instalação](#instalação)
- [Uso](#uso)
- [Funcionalidades](#funcionalidades)
- [Dependências](#dependências)
- [Configuração](#configuração)
- [Contribuidores](#contribuidores)
- [Licença](#licença)

### Instalação
1. Clone o repositório:
    ```sh
    git clone https://github.com/FelipeG-Almeida/java-spring-api-rest.git
    ```
2. Navegue até o diretório do projeto:
    ```sh
    cd java-spring-api-rest
    ```
3. Execute o Maven para instalar as dependências:
    ```sh
    mvn install
    ```

### Uso
1. Inicie a aplicação:
    ```sh
    mvn spring-boot:run
    ```
2. A API estará disponível em `http://localhost:8080`.

### Funcionalidades
- **Gerenciamento de Médicos**: Cadastro, atualização e remoção de médicos.
- **Gerenciamento de Pacientes**: Cadastro, atualização e remoção de pacientes.
- **Agendamentos**: Criação, visualização e cancelamento de agendamentos.

### Dependências
- Java 11+
- Spring Boot
- Maven

### Configuração
As configurações específicas do projeto podem ser ajustadas no arquivo `application.properties` localizado em `src/main/resources`.
