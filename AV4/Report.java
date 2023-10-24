import java.util.ArrayList;

public class Report {
    private ArrayList<Car> carros;
    private ArrayList<Transaction> transacoes;

    public Report() {
        carros = new ArrayList<>();
        transacoes = new ArrayList<>();
    }

    public void adicionarCarro(Car carro) {
        carros.add(carro);
    }

    public void adicionarTransacao(Transaction transacao) {
        transacoes.add(transacao);
    }

    public void gerarRelatorio() {
        // Implemente a lógica para gerar o relatório com base nos dados coletados.
        // Isso pode incluir estatísticas sobre quilômetros rodados, consumo de combustível, transações financeiras, etc.
    }
}
