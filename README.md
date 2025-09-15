## Estrutura Principal

- **controller**: classes que recebem as requisições HTTP
- **service**: regras de negócio e lógica da aplicação
- **repository**: interfaces que fazem a persistência de dados (Geralmente com o Spring DATA JPA)
- **model** ou **domain**: classes de domínio
- **config**: classes de configuração (ex.: CORS, sergurança...)
- **dto**: objeto simples (POJO) criado para transportar dados.


## Comandos importantes

### Executar a aplicação

```bash

./mvnw spring-boot:run

```

#### Executar a aplicação
```bash

.mvnw/ test

```bash