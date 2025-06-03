package observer.ui;

import observer.model.Observer;

import javax.swing.*;
import java.awt.*;


public class MonitorDeCuenta implements Observer {
    private JLabel label;

    public MonitorDeCuenta() {
        JFrame frame = new JFrame("Monitor");
        frame.getRootPane().setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        label = new JLabel("...");
        label.setFont(new Font("Dialog", Font.PLAIN, 20));
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }

    @Override
    public void update(String data) {
        label.setText(data);
    }
}
