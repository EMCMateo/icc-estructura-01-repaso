
import Controllers.PersonaController;
import Models.Persona;
import Views.viewConsola;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elene", 26),
        };

       

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

        viewConsola view = new viewConsola();
        view.mostrarMensaje("Lista de personas antes de ordenar:");
        view.mostrarPersona(personas);

        PersonaController controller = new PersonaController();

        controller.ordenarPorEdad(personas,view, 40);
        
        controller.ordenarPorEdad(personas,view, 99);
        
    }
}
