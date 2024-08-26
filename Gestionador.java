import java.util.ArrayList;

public class Gestionador {
    private ArrayList<Estudiante> estudiantes;

    public Gestionador(ArrayList<Estudiante> estudiante) {
        this.estudiantes = estudiante;
    }

    public ArrayList<Estudiante> getEstudiante() {
        return estudiantes;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }
    
}
