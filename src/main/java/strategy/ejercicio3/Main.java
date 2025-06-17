package strategy.ejercicio3;

public class Main {
    public static void main(String[] args) {
        var libro = new Libro(30);
        var medicina = new Medicina(330);
        var alimento = new Alimento(130);
        var otro = new OtroProducto(130);

        System.out.println("Precio final del libro ($30): $" + libro.precioFinal());
        System.out.println("Precio final de la medicina ($330): $" + medicina.precioFinal());
        System.out.println("Precio final del alimento ($130): $" + alimento.precioFinal());
        System.out.println("Precio final del otro producto ($130): $" + otro.precioFinal());
    }
}
