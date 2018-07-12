
package matricula;


public class Estudiantes extends Persona {    
   
    private int edad;

    public Estudiantes(String nombre, String apellido, int edad) {

        super(nombre,apellido);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        
}
