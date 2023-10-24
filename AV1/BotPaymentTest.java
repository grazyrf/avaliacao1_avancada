import org.junit.Test;
import static org.junit.Assert.*;

public class BotPaymentTest {

    @Test
    public void testBotPaymentInitialization() {
        // Teste a inicialização da classe BotPayment
        BotPayment botPayment = new BotPayment();
        assertNotNull(botPayment);
        // Adicione mais asserções conforme necessário
    }

    @Test
    public void testCalculatePayment() {
        BotPayment botPayment = new BotPayment();

        // Simule o cálculo de pagamento com uma distância de 20 km
        double payment = botPayment.calculatePayment(20);
        assertEquals(65.0, payment, 0.
