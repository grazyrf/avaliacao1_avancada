import org.junit.Test;
import static org.junit.Assert.*;

public class AlphaBankTest {

    @Test
    public void testAlphaBankInitialization() {
        // Teste a inicialização da classe AlphaBank
        AlphaBank alphaBank = new AlphaBank();
        assertNotNull(alphaBank);
        // Adicione mais asserções conforme necessário
    }

    @Test
    public void testDepositAndWithdraw() {
        AlphaBank alphaBank = new AlphaBank();
        alphaBank.setAccountBalance(100.0);

        // Teste o depósito
        alphaBank.deposit(50.0);
        assertEquals(150.0, alphaBank.getAccountBalance(), 0.01);

        // Teste a retirada
        alphaBank.withdraw(30.0);
        assertEquals(120.0, alphaBank.getAccountBalance(), 0.01);
    }

    // Adicione mais métodos de teste para a classe AlphaBank
}
