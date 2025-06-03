package observer.ui;

import observer.model.Observer;

public class Console implements Observer {
    @Override
    public void update(String data) {
        System.out.println("El monto ahora es "+data);
    }
}
