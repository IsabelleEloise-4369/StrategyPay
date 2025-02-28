/* Classe principal para testar a estratégia de pagamento */
public class PagamentoMain {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();
        
        /* Escolhendo pagamento via PIX */
        processador.setEstrategia(new PagamentoPIX());
        processador.processarPagamento(100.0);
        
        /* Escolhendo pagamento via Cartão de Crédito */
        processador.setEstrategia(new PagamentoCartao());
        processador.processarPagamento(250.5);
        
        /* Escolhendo pagamento via Boleto */
        processador.setEstrategia(new PagamentoBoleto());
        processador.processarPagamento(500.0);
    }
}