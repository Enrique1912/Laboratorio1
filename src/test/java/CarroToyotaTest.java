import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CarroToyotaTest {
    @Test
    public void testMuestraVelocidadMaxima() {
        Carro a2 = new CarroToyota("Toyota","999999","Rojo",1500000);
        a2.muestraVelocidadMaxima();

        assertEquals("Mostrando velocidad maxima del auto: ", a2.muestraVelocidadMaxima(), "La velocidad maxima del toyota es de  100 km/h");
    }

}
