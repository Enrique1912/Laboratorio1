import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CarroCorvetteTest {
    @Test
    public void testMuestraVelocidadMaxima() {
        Carro a1 = new CarroCorvette("Corvette","123ass","Azul",200000);
        a1.muestraVelocidadMaxima();

        assertEquals("Mostrando velocidad maxima del auto: ", a1.muestraVelocidadMaxima(), "La velocidad maxima del corvette es de 250 km/h");
    }

}
