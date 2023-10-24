import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Driver extends Thread {
    private ArrayList<Route> rotasAExecutar;
    private ArrayList<Route> rotasEmExecucao;
    private ArrayList<Route> rotasExecutadas;
    private AlphaBank alphaBank;
    private Car car;
    private LockingMechanism lockingMechanism;

    public Driver(ArrayList<Route> rotasAExecutar, AlphaBank alphaBank, Car car) {
        this.rotasAExecutar = rotasAExecutar;
        this.rotasEmExecucao = new ArrayList<>();
        this.rotasExecutadas = new ArrayList<>();
        this.alphaBank = alphaBank;
        this.car = car;
        this.lockingMechanism = new LockingMechanism();
    }

    @Override
    public void run() {
        while (!rotasAExecutar.isEmpty()) {
            Route rota = selecionarProximaRota();
            if (rota != null) {
                iniciarExecucaoDaRota(rota);
                // Realize a execução da rota
                finalizarExecucaoDaRota(rota);
            }
        }
    }

    private Route selecionarProximaRota() {
        Route rotaSelecionada = null;
        // Implemente a lógica para selecionar a próxima rota a ser executada.
        // Isso pode incluir critérios como distância, disponibilidade, etc.
        return rotaSelecionada;
    }

    private void iniciarExecucaoDaRota(Route rota) {
        lockingMechanism.adquirirBloqueio();
        rotasAExecutar.remove(rota);
        rotas
    }