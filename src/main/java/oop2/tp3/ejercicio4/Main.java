package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;

public class Main {

    public static void main(String[] args) {

        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

        new SetUpDatabase(jdbi).setUp();

        var repo = new PersonaRepository(jdbi);
        var personas = repo.buscarPorNombre("555");

        /*if (personas != null) {
            for (Persona persona : personas) {
                System.out.println(persona.nombre() + " " + persona.apellido());
            }
        }*/

        for (Persona persona : personas) {
            System.out.println(persona.nombre() + " " + persona.apellido());
        }

        var optionalPersona = repo.buscarId(789L);
        /*if (persona != null) {
            System.out.println(persona.nombre() + " " + persona.apellido());
        }*/

        optionalPersona.ifPresent(persona -> System.out.println(persona.nombre()
                + " " + persona.apellido()));
    }
}
