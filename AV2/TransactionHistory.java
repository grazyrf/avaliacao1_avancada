import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    private List<Transaction> transactions;

    public TransactionHistory() {
        transactions = new ArrayList<>();
    }

    public void adicionarTransacao(Transaction transacao) {
        transactions.add(transacao);
    }

    public List<Transaction> obterTransacoes() {
        return transactions;
    }
}
