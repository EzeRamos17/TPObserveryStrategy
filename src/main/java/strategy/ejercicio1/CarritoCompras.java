package strategy.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private List<Producto> productos;
    private EnvioStrategy envioStrategy;
    private String destino;

    public CarritoCompras(String destino) {
        this.productos = new ArrayList<>();
        this.destino = destino;
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    public void setEnvioStrategy(EnvioStrategy strategy) {
        this.envioStrategy = strategy;
    }

    public double calcularPrecioTotal() {
        double productosTotal = 0.0;
        for (Producto producto1 : productos) {
            double precio = producto1.Precio();
            productosTotal += precio;
        }

        double pesoTotal = 0.0;
        for (Producto producto : productos) {
            double peso = producto.Peso();
            pesoTotal += peso;
        }

        double costoDeEnvio = envioStrategy.calcularCostoEnvio(destino, pesoTotal);

        return productosTotal + costoDeEnvio;
    }
} 