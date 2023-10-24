import org.junit.Test;
import static org.junit.Assert.*;

public class RouteTest {

    @Test
    public void testRouteInitialization() {
        // Teste a inicialização da classe Route
        Route route = new Route();
        assertNotNull(route);
        // Adicione mais asserções conforme necessário
    }

    @Test
    public void testRouteSettersAndGetters() {
        Route route = new Route();
        route.setRouteID("ROUTE001");
        route.setRouteName("Rota 1");
        route.setRouteDescription("Descrição da Rota 1");
        route.setDistanceInKilometers(10.5);

        assertEquals("ROUTE001", route.getRouteID());
        assertEquals("Rota 1", route.getRouteName());
        assertEquals("Descrição da Rota 1", route.getRouteDescription());
        assertEquals(10.5, route.getDistanceInKilometers(), 0.01);
    }

    // Adicione mais métodos de teste para a classe Route
}
