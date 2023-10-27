public class FuelStation {
    private String nome;
    private Account contaCorrente;

    public FuelStation(String nome, Account contaCorrente) {
        this.nome = nome;
        this.contaCorrente = contaCorrente;
    }

    public void abastecerCarro(Car carro, double litrosAbastecidos) {
        // Implemente a lógica para abastecer o carro e calcular o custo do abastecimento.
        // Registre a transação financeira com o motorista e atualize a conta corrente da Fuel Station.
    }

    public Account getAccount() {
        return contaCorrente;
    }
}
