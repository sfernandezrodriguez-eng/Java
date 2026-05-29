public class Persoa3 implements Comparable<Persoa3> {
    //declaración de propiedades
    public String nome;
    public String dni;
    public int edade;

    public Persoa3 (String nome, String dni, int edade){
        this.nome = nome;
        this.dni = dni;
        this.edade = edade;
    }

    public String getDni() {
        return dni;
    }

    public int getEdade() {
        return edade;
    }

    public String getNome () { return this.nome; }

    public void setNome (String nome) { this.nome = nome; }

    public void mostrarDatos() {
        System.out.println("Nome: " + nome + "\nDni: " + dni + "\nEdade: " + edade);
    }

    @Override
    public boolean equals(Object outro){
        Persoa3 outraPersoa = (Persoa3) outro;
        if (this.dni.equals(outraPersoa.dni)) return true;
        return false;
    }

    @Override
    public int compareTo(Persoa3 outro) {
        return this.dni.compareTo(outro.dni);
    }
}