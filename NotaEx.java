public class NotaEx {
    private String materia;
    private float nota;

    public NotaEx(String materia, float nota) {
        this.materia = materia;
        this.nota = nota;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "NotaEx [materia=" + materia + ", nota=" + nota + ", toString()=" + super.toString() + "]";
    }

}
