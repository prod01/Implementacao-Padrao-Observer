public class Principal {
    public static void main(String[] args) {
        // Criação de instâncias de EstoqueProduto e observadores
        EstoqueProduto estoqueProduto = new EstoqueProduto();

        Observer vendas = new DepartamentoVendas();
        Observer marketing = new DepartamentoMarketing();
        Observer compras = new DepartamentoCompras();

        // Registro dos observadores no estoque
        estoqueProduto.registrarObservador(vendas);
        estoqueProduto.registrarObservador(marketing);
        estoqueProduto.registrarObservador(compras);

        // Simulação de reabastecimento de produto
        System.out.println("Produto esgotado...");
        System.out.println("Reabastecendo produto...");
        estoqueProduto.atualizarEstoque(true); // Notifica todos os observadores
    }
}