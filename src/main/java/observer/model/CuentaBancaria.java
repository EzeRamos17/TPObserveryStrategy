package observer.model;

public class CuentaBancaria extends Sujeto{

    private double monto;

    public CuentaBancaria(double monto) {
        this.monto = monto;
    }

    public void depositar(double monto) {
        this.monto += monto;
        this.notificar(String.valueOf(this.monto));
    }

    public String saldo() {
        return "$" + monto;
    }
}
