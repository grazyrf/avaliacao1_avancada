import java.time.Instant;

public class Transaction {
    private Account origem;
    private Account destinatario;
    private double valor;
    private Instant timestamp;

    public Transaction(Account origem, Account destinatario, double valor) {
        this.origem = origem;
        this.destinatario = destinatario;
        this.valor = valor;
        this.timestamp = Instant.now();
    }

    // Adicione métodos para acessar informações sobre a transação, se necessário.
}
