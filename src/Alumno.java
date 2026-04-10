
public class Alumno extends MembroComunidadeEscolar {
    private String curso;


    public Alumno(String nom, String dni, int edade, int codCentro, String nomCentro, String curso) {
        super(nom, dni, edade, codCentro, nomCentro);
        setCurso(curso);

    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
