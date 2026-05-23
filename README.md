# Importação CNAB
Este projeto é uma implementação técnica para o processamento de arquivos CNAB, comum em instituições financeiras para conciliação eletrônica.

## 🚀 Funcionalidades
- Upload de arquivos: Endpoint para envio de arquivos de texto (.txt) no padrão CNAB.
- Processamento: Extração e normalização dos dados (parsing).
- Persistência: Armazenamento dos dados em um banco de dados relacional (PostgreSQL).
- Visualização: Endpoint para listar todas as transações importadas.
## 🛠️ Tecnologias Utilizadas
- Java 17+
- Spring Boot (Web, Data JPA)
- PostgreSQL
- Maven
## 🔗 Endpoints
- POST /knab/upload: Realize o upload do arquivo para processamento.
- GET /knab/transacoes: Lista as transações salvas no banco de dados.
