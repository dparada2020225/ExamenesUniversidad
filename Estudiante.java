import java.util.ArrayList;


public class Estudiante {
    private String nombre;
    private String apellido;
    private int ID;
    private String cumple;
    private String correo;
    private ArrayList<NotaEx> grades;

    public Estudiante(String nombre, String apellido, int iD, String cumple, String correo, ArrayList<NotaEx> grades ) {
        this.nombre = nombre;
        this.apellido = apellido;
        ID = iD;
        this.cumple = cumple;
        this.correo = correo;
        this.grades = grades;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCumple() {
        return cumple;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<NotaEx> getGrades(){
        return grades;
    }

    public void agregarNota(NotaEx nota){
        this.grades.add(nota);
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}