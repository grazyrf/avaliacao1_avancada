import java.util.ArrayList;

public class Company extends Thread {
    private ArrayList<Route> routesToExecute;
    private ArrayList<Route> executingRoutes;
    private ArrayList<Route> executedRoutes;
    private AlphaBank alphaBank;
    private ArrayList<Car> cars;

    public Company() {
        // Inicialize as listas e outras variáveis necessárias.
    }

    @Override
    public void run() {
        // Implemente a lógica da Empresa como uma Thread aqui.
    }

    public synchronized void addRouteToExecute(Route route) {
        // Adicione uma rota à lista de rotas a serem executadas.
    }

    public synchronized void addExecutingRoute(Route route) {
        // Adicione uma rota à lista de rotas em execução.
    }

    public synchronized void addExecutedRoute(Route route) {
        // Adicione uma rota à lista de rotas executadas.
    }

    public synchronized void makePayment(Driver driver, double amount) {
        // Realize o pagamento ao motorista.
    }

    // Outros métodos e lógica necessários.

    public static void main(String[] args) {
        // Inicialize e inicie a instância da Empresa.
    }
}
