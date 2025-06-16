package observer.ejercicio4.ui;

import observer.ejercicio4.model.EmailNotifier;
import observer.ejercicio4.model.ParticipanteServicio;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class MainView extends JFrame {
    private JTextField nombre;
    private JTextField telefono;
    private JTextField region;
    private JTextField email;
    private ParticipanteServicio participanteServicio;

    public MainView(ParticipanteServicio participanteServicio) {
        this.participanteServicio = participanteServicio;
        // Registrar el observador de email
        this.participanteServicio.agregarObserver(new EmailNotifier());
        setupUIComponents();
    }

    private void setupUIComponents() {
        setTitle("Add Participant");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.nombre = new JTextField(10);
        this.telefono = new JTextField(10);
        this.region = new JTextField(10);
        this.email = new JTextField(10);
        this.nombre.setText("");
        this.telefono.setText("");
        this.region.setText("China");
        this.email.setText("");
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JLabel("Nombre: "));
        contentPane.add(nombre);
        contentPane.add(new JLabel("Telefono: "));
        contentPane.add(telefono);
        contentPane.add(new JLabel("Region: "));
        contentPane.add(region);
        contentPane.add(new JLabel("Email: "));
        contentPane.add(email);
        JButton botonCargar = new JButton("Cargar");
        botonCargar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onBotonCargar();
            }
        });
        contentPane.add(botonCargar);
        setContentPane(contentPane);
        contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        pack();
        setVisible(true);
    }

    private void onBotonCargar(){
        try {
            participanteServicio.registrarParticipante(
                    nombre.getText(), telefono.getText(), region.getText(), email.getText()
            );
            JOptionPane.showMessageDialog(this, "Participante registrado con exito");
            dispose();
        } catch (IllegalArgumentException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(this, "Error al guardar en la base de datos");
        }
    }
}
