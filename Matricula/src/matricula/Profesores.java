
package matricula;

import java.util.Objects;


public class Profesores {
    
    private String nombre;
    private String apellido;
    private String facultad;
    private String materiaP;

    public Profesores(String nombre, String apellido, String facultad, String materiaP) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.facultad = facultad;
        this.materiaP = materiaP;
    }

    public String getMateriaP() {
        return materiaP;
    }

    public void setMateriaP(String materia) {
        this.materiaP = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return materiaP ;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesores other = (Profesores) obj;
        if (!Objects.equals(this.materiaP, other.materiaP)) {
            return false;
        }
        return true;
    }

    
    
}
