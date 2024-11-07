import java.util.ArrayList;
import java.util.List;

public class EstoqueProduto implements Estoque {
    private List<Observer> observadores;
    private boolean emEstoque;

    public EstoqueProduto() {
        this.observadores = new ArrayList<>();
        this.emEstoque = false;
    }

    // Método para registrar um novo observador
    @Override
    public void registrarObservador(Observer observador) {
        observadores.add(observador);
    }

    // Método para remover um observador
    @Override
    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    // Método para notificar todos os observadores
    @Override
    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.update("O produto voltou ao estoque!");
        }
    }

    // Método para atualizar o status do estoque
    public void atualizarEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
        if (emEstoque) {
            notificarObservadores();
        }
    }
}