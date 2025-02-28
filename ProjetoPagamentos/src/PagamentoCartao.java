/* Implementação para pagamento via Cartão de Crédito */
public class PagamentoCartao implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Cartão de Crédito.");
    }
}
