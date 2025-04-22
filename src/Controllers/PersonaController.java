package Controllers;
import Views.viewConsola;
import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] persona, viewConsola view, int edad) {
        int n = persona.length;
        Persona aux;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (persona[j].getEdad() > persona[j + 1].getEdad()) {
                    aux = persona[j];
                    persona[j] = persona[j + 1];
                    persona[j + 1] = aux;
                }
            }
        }

        buscarPorEdad(persona, edad);
        System.out.println("Lista de personas ordenadas por edad:");
        for (int i = 0; i < n; i++) {
            System.out.println(persona[i].toString());
        }
        view.mostrarMensaje("Persona con edad: "+edad);
        searchPersonByAge(persona, view, edad);
    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public int buscarPorEdad(Persona[] personas, int edad) {
        int inicio = 0;
        int fin =  personas.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (personas[medio].getEdad() == edad) {
                return medio; // Retorna la persona encontrada
            } else if (personas[medio].getEdad() < edad) {
                inicio = medio + 1; // Busca en la mitad derecha
            } else {
                fin = medio - 1; // Busca en la mitad izquierda
            }
        }   
        return -1;

    }

    public void searchPersonByAge(Persona[] personas, viewConsola show, int edad) {
        int clave = edad;
        int index = buscarPorEdad(personas, clave);
        if (index != -1){
            System.out.println("Persoan encontrada, indice: "+index);
            show.mostrarMensaje(personas[index].toString());
        }
        else{
            show.mostrarMensaje("No enocntrado");
        }
 
    }


    public void personaOrdenada(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].toString());
        }
    }
}

