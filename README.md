# 💰 Financial Manager API

Uma API RESTful desenvolvida em **Java** com **Spring Boot** para gerenciamento financeiro pessoal. O sistema permite o controle detalhado de transações bancárias, gestão de cartões de crédito (compras à vista e parceladas), categorização de gastos e definição de metas mensais.

## 🚀 Tecnologias Utilizadas

* **Java** (Linguagem principal)
* **Spring Boot** (Framework base)
* **Spring Data JPA / Hibernate** (Mapeamento Objeto-Relacional)
* **Lombok** (Redução de boilerplate de código)
* **Banco de Dados Relacional** (PostgreSQL / MySQL / H2)
* **UUID** (Identificadores únicos globais para maior segurança)

## 🧠 Arquitetura e Modelagem de Dados



O domínio da aplicação foi cuidadosamente modelado para separar transações de conta corrente das faturas de cartão de crédito, refletindo cenários financeiros reais:

* **User (`users`):** Gerencia os usuários do sistema com perfis de acesso (`CLIENT`, `ADMIN`).
* **Category (`category`):** Sistema híbrido de categorias. Suporta categorias globais (nativas do sistema) e categorias personalizadas (vinculadas a um usuário específico através de chave estrangeira opcional).
* **Bank & Transactions (`bank`, `transactions`):** * `Bank`: Representa as contas bancárias do usuário.
  * `Transactions`: Registra entradas (receitas) e saídas (despesas/PIX/débito) diretas na conta bancária.
* **Credit Card & Installment (`credit_card`, `installment`):**
  * `Credit Card`: Gerencia os cartões do usuário, limites de crédito, dia de fechamento e dia de vencimento.
  * `Installment`: Registra compras feitas no cartão. Suporta compras à vista ou parceladas, armazenando o valor da parcela, quantidade e a qual cartão/categoria pertencem.
* **Monthly Goal (`monthly_goal`):** Define metas de gastos/orçamento para meses específicos do ano.

## ⚙️ Funcionalidades e Regras de Negócio

- [x] Modelagem robusta de entidades financeiras.
- [x] Prevenção de perda de precisão financeira (utilizando as melhores práticas tipográficas para dinheiro).
- [x] Separação lógica entre gastos de débito (Transactions) e crédito (Installments).
- [x] Implementação da camada de Repositórios (Spring Data).
- [ ] Implementação da camada de Serviços (Regras de negócio).
- [ ] Criação dos Endpoints (REST Controllers).
- [ ] Segurança e Autenticação (Spring Security + JWT).

## 🛠️ Como executar o projeto localmente

1. Clone este repositório:
   ```bash
   git clone [https://github.com/SEU-USUARIO/financial-manager-demo.git](https://github.com/SEU-USUARIO/financial-manager-demo.git)
