

public class MembroComunidadeEscolar extends Persoa {
    private int codigoCentro;
    private String nomeCentro;

    public MembroComunidadeEscolar (String nom, String dni, int edade, int codCentro, String nomCentro){
        super(nom, dni, edade);
        this.codigoCentro = codCentro;
        this.nomeCentro = nomCentro;


    }

    public String getNomeCentro() {
        return nomeCentro;
    }

    public void setNomeCentro(String nomeCentro) {
        this.nomeCentro = nomeCentro;
    }

    public int getCodigoCentro(){
        return this.codigoCentro;


    }
    public void setCodigoCentro(int novoCodcentro){
        if (novoCodcentro>0) codigoCentro = novoCodcentro;
        else codigoCentro = 0;
    }
}