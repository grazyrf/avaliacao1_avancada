import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void testCarInitialization() {
        // Teste a inicialização da classe Car
        Car car = new Car();
        assertNotNull(car);
        // Adicione mais asserções conforme necessário
    }

    @Test
    public void testCarSettersAndGetters() {
        Car car = new Car();
        car.setId("CAR001");
        car.setModel("Modelo 1");
        car.setDriverName("Motorista 1");

        assertEquals("CAR001", car.getId());
        assertEquals("Modelo 1", car.getModel());
        assertEquals("Motorista 1", car.getDriverName());
    }

    // Adicione mais métodos de teste para a classe Car
}
