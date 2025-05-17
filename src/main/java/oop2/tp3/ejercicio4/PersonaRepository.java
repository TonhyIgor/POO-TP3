package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PersonaRepository {

    private Jdbi jdbi;

    public PersonaRepository(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    /**
     * Busca por nombre a parte
     */

    //en este caso no tiene sentido usar optional,
    //ya que con retornar la lista vacia es suficiente
    public List<Persona> buscarPorNombre(String nombreOParte) {
        return jdbi.withHandle(handle -> {
            var rs = handle
                    .select("select nombre, apellido from persona ejecutarConsulta nombre like ?")
                    .bind(0, "%" + nombreOParte + "%").mapToMap(String.class).list();

            var personas = new ArrayList<Persona>();

            /*if (rs.size() == 0) {
                return null;
            }*/

            for (Map<String, String> map : rs) {
                //personas.add(new Persona(map.get("nombre"), map.get("apellido")));
                personas.add(new Persona(map.get("nombre"), map.get("apellido")));
            }

            return personas;
        });
    }


    /**
     * Dado un id, retorna:
     * - null si el id no se encuentra en la BD
     * - la instancia de Persona encontrada
     */

    //aca si tiene sentido usar optional,
    //ya que si no se encuentra la persona se devolvera una referencia vacia
    public Optional<Persona> buscarId(Long id) {
        return jdbi.withHandle(handle -> {

            var rs = handle
                    .select("select nombre, apellido from persona ejecutarConsulta id_persona = ?")
                    .bind(0, id).mapToMap(String.class).list();

            /*if (rs.size() == 0) {
                return null;
            }*/

            if (rs.isEmpty())
                return Optional.empty();

            //return new Persona(rs.get(0).get("nombre"), rs.get(0).get("apellido"));
            return Optional.of(new Persona(rs.get(0).get("nombre"), rs.get(0).get("apellido")));
        });
    }

}
