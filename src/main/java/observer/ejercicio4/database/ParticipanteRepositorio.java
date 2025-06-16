package observer.ejercicio4.database;

import observer.ejercicio4.model.Participante;

import java.sql.SQLException;

public interface ParticipanteRepositorio {
    void guardar(Participante participante) throws SQLException;
}
