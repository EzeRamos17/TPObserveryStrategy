package observer.ejercicio4.main;

import observer.ejercicio4.ui.MainView;
import observer.ejercicio4.database.ParticipanteRepositorioJdbc;
import observer.ejercicio4.model.ParticipanteServicio;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection dbConn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/participantes_db", "root", "hernan123"
        );
        ParticipanteRepositorioJdbc repo = new ParticipanteRepositorioJdbc(dbConn);
        ParticipanteServicio servicio = new ParticipanteServicio(repo);
        EventQueue.invokeLater(() -> {
            try {
                new MainView(servicio);
            } catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}
