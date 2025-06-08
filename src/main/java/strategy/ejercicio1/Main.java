package strategy.ejercicio1;

public class Main {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras("Capital Federal");

        carrito.añadirProducto(new Producto("Teclado", 150, 0.5));
        carrito.añadirProducto(new Producto("Mouse", 50, 0.3));
        carrito.añadirProducto(new Producto("Pad", 80, 0.5));

        carrito.setEnvioStrategy(new ColectivosSurStrategy());
        System.out.println("Costo total enviando con Colectivos Sur: $" + carrito.calcularPrecioTotal());

        carrito.setEnvioStrategy(new CorreoArgentinoStrategy());
        System.out.println("Costo total enviando con Correo Argentino: $" + carrito.calcularPrecioTotal());


        CarritoCompras carritoPesado = new CarritoCompras("Córdoba");
        carritoPesado.añadirProducto(new Producto("Computadora", 200000, 15.0));
        carritoPesado.añadirProducto(new Producto("Monitor", 80000, 8.0));
        carritoPesado.añadirProducto(new Producto("Impresora", 30000, 10.0));

        carritoPesado.setEnvioStrategy(new ColectivosSurStrategy());
        System.out.println("\nCosto total del carrito pesado con Colectivos Sur: $" + carritoPesado.calcularPrecioTotal());

        carritoPesado.setEnvioStrategy(new CorreoArgentinoStrategy());
        System.out.println("Costo total del carrito pesado con Correo Argentino: $" + carritoPesado.calcularPrecioTotal());
    }
} 