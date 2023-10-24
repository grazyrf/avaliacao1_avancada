public class Car extends Vehicle {
    private double fuelTank; // Representa a quantidade de combustível em litros.
    private double fuelConsumption; // Consumo de combustível em litros por quilômetro.
    private FuelStation fuelStation;
    private Driver driver;
    private double kmRodados;

    public Car(String id, Driver driver, FuelStation fuelStation, double fuelConsumption) {
        super(id);
        this.fuelTank = 10.0; // Inicializa o tanque com 10 litros.
        this.fuelConsumption = fuelConsumption;
        this.driver = driver;
        this.fuelStation = fuelStation;
        this.kmRodados = 0.0;
    }

    @Override
    public void run() {
        // Implemente a lógica da execução do carro aqui.
        // Isso pode incluir o controle da distância percorrida e o abastecimento quando o combustível estiver baixo.
    }

    public void dirigir(double distancia) {
        // Atualiza o atributo kmRodados e consome combustível.
        kmRodados += distancia;
        fuelTank -= distancia * fuelConsumption;
        if (fuelTank <= 3.0) {
            abastecer();
        }
    }

    public void abastecer() {
        // O Driver chama a Fuel Station para abastecer o carro.
        fuelStation.abastecerCarro(this);
        // Durante o abastecimento, o carro fica parado (velocidade igual a zero).
        setVelocidade(0);
        try {
            Thread.sleep(120000); // Aguarda 2 minutos (tempo de abastecimento).
        } catch (InterruptedException e) {
            // Lidar com exceções, se necessário.
        }
    }

    public double getKmRodados() {
        return kmRodados;
    }
}
