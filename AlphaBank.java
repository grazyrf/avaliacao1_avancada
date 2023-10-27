import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AlphaBank {
    private double companyAccountBalance;
    private Lock accountLock;

    public AlphaBank() {
        this.companyAccountBalance = 10000.0; // Saldo inicial da conta da empresa no AlphaBank.
        this.accountLock = new ReentrantLock();
    }

    public double getCompanyAccountBalance() {
        return companyAccountBalance;
    }

    public void depositToCompanyAccount(double amount) {
        accountLock.lock();
        try {
            companyAccountBalance += amount;
        } finally {
            accountLock.unlock();
        }
    }

    public boolean withdrawFromCompanyAccount(double amount) {
        accountLock.lock();
        try {
            if (companyAccountBalance >= amount) {
                companyAccountBalance -= amount;
                return true;
            }
            return false;
        } finally {
            accountLock.unlock();
        }
    }
    
    // Outros métodos e lógica necessários para a classe AlphaBank.
}
