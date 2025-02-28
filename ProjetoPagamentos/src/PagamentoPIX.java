/* Implementação para pagamento via PIX */
public class PagamentoPIX implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }
}

