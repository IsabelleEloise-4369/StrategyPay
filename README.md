# StrategyPay

## Projeto de Pagamento com Strategy
Este projeto implementa o padrão de design Strategy para gerenciar diferentes formas de pagamento, como PIX, Cartão de Crédito e Boleto Bancário, de maneira flexível e modular.

## Estrutura do Projeto
- PagamentoStrategy.java: Interface que define o contrato para as estratégias de pagamento.
- PagamentoPIX.java: Implementação do pagamento via PIX.
- PagamentoCartao.java: Implementação do pagamento via Cartão de Crédito.
- PagamentoBoleto.java: Implementação do pagamento via Boleto Bancário.
- ProcessadorPagamento.java: Classe responsável por gerenciar e processar os pagamentos com a estratégia definida.
- PagamentoMain.java: Classe principal para testar as diferentes formas de pagamento.

## Como Funciona
O padrão Strategy permite a troca dinâmica da estratégia de pagamento sem alterar o código principal. A classe ProcessadorPagamento define a estratégia de pagamento e a executa com o método processarPagamento.
