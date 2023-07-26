# AWS Estacionamento Deep
Um cliente nosso, dono do estacionamento deep está precisando de uma aplicação para gerenciar a entrada, permanência e saída dos carros.
Você precisará criar uma aplicação utilizando o banco de dados compartilhado com a sua equipe.


## Requisitos
- O cliente poderá visualizar os carros que estão no estacionamento, qual a sua permanência, valor a ser pago e o dono do carro.
  Cada permanência tem o seu valor:

| PERMANÊNCIA        | VALOR     |
|--------------------|-----------|
| Até 1h             | 10 reais  |
| Adicional 30min    | 2 reais   |
| Meio período (12h) | 90 reais  |

- O cliente poderá inserir a entrada de um novo carro, indicando o nome do carro, sua permanência, sua placa, o nome do dono do carro e o quanto deverá pagar.
- O cliente poderá atualizar um carro já estacionado, por exemplo, caso ele passe da permanência de 1h, deverá ser atualizado o valor a ser pago.
- O usuário deverá excluir da tabela os carros que estiverem saindo do estacionamento.
- Você junto ao seu grupo precisarão discutir como será a arquitetura do banco de vocês, documente essa discussão.
- Crie uma documentação explicando como funciona o seu projeto.


## Banco de Dados - Documentação
O projeto utiliza um banco de dados PostgreSQL hospedado no Amazon RDS para armazenar as informações dos carros estacionados.

Definição da estrutura pelo grupo: Carlos Laczynski, Athos Caetano, João Vitor e Francisco Silva.

A estrutura base da tabela de controle dos carros é a seguinte abaixo. Podendo que algumas propriedades, características das variáveis e tipos de dados sofram mudanças de acordo com o código de cada desenvolvedor.