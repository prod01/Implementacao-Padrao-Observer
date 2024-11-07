class DepartamentoCompras implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println("Departamento de Compras: " + mensagem + " Monitorando estoque e planejando novos pedidos.");
    }
}