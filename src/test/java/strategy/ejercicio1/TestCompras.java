package strategy.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCompras {

    @Test
    public void testEnvioColectivosSur(){
        CarritoCompras carrito = new CarritoCompras("Capital Federal");

        carrito.añadirProducto(new Producto("Teclado", 150, 0.5));
        carrito.añadirProducto(new Producto("Mouse", 50, 0.3));
        carrito.añadirProducto(new Producto("Pad", 80, 0.5));

        carrito.setEnvioStrategy(new ColectivosSurStrategy());
        assertEquals(1280.0, carrito.calcularPrecioTotal());
    }

    @Test
    public void testEnvioCorreoArgentino(){
        CarritoCompras carritoPesado = new CarritoCompras("Córdoba");
        carritoPesado.añadirProducto(new Producto("Computadora", 200000, 15.0));
        carritoPesado.añadirProducto(new Producto("Monitor", 80000, 8.0));
        carritoPesado.añadirProducto(new Producto("Impresora", 30000, 10.0));

        carritoPesado.setEnvioStrategy(new CorreoArgentinoStrategy());
        assertEquals(311300.0, carritoPesado.calcularPrecioTotal());
    }
}
