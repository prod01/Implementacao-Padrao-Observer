class DepartamentoMarketing implements Observer {
    @Override
    public void update(String mensagem) {
        System.out.println("Departamento de Marketing: " + mensagem + " Promovendo o produto nas redes sociais.");
    }
}