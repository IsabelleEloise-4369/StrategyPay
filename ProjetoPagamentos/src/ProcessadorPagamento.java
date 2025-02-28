/* Classe que processa o pagamento usando a estratégia escolhida */
public class ProcessadorPagamento {
    private PagamentoStrategy estrategia;
    
    /* Define qual estratégia de pagamento será usada */
    public void setEstrategia(PagamentoStrategy estrategia) {
        this.estrategia = estrategia;
    }
    
    /* Processa o pagamento usando a estratégia definida */
    public void processarPagamento(double valor) {
        if (estrategia == null) {
            System.out.println("Nenhuma estratégia de pagamento definida!");
        } else {
            estrategia.pagar(valor);
        }
    }
}