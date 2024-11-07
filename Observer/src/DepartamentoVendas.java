class DepartamentoVendas implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println("Departamento de Vendas: " + mensagem + " Atualizando disponibilidade no site e informando clientes.");
    }
}