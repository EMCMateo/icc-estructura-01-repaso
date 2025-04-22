package Views;
import Models.Persona;
public class viewConsola {
    public viewConsola(){

    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);

    }
    public void mostrarPersona(Persona [] personas){
        for (int i=0; i<personas.length; i ++){
            System.out.println(personas[i].toString());
        }

    }

    
    public void mostrarPersonaOrdenada(Persona persona, int edad){
        
    }
}
