public class Account {
    private String login;
    private String senha;
    private double saldo;
    private TransactionHistory transactionHistory;

    public Account(String login, String senha) {
        this.login = login;
        this.senha = senha;
        this.saldo = 0.0;
        this.transactionHistory = new TransactionHistory();
    }

    public boolean realizarTransacao(Account destinatario, double valor) {
        // Implemente a lógica para realizar a transação, atualizando saldos e registrando transações.
        // Certifique-se de adicionar controle de acesso apropriado aqui.
        return false; // Retorne verdadeiro se a transação for bem-sucedida, falso caso contrário.
    }

    public double getSaldo() {
        return saldo;
    }
}
