public class Estudiante {
    private String nombre;
    private String apellido;
    private int ID;
    private String cumple;
    private String correo;

    public Estudiante(String nombre, String apellido, int iD, String cumple, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        ID = iD;
        this.cumple = cumple;
        this.correo = correo;
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