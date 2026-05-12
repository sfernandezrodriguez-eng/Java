import java.util.Comparator;
import java.util.Objects;

public class Futbolista extends Persoa implements Comparable<Futbolista> {
    private int numGoles;

    public Futbolista(String nom, String dni, int edade, int numGoles) {
        super(nom, dni, edade);
        this.numGoles = numGoles;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        super.nome = nome;
    }

    public int getGoles() {
        return numGoles;
    }

    public void setGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " DNI: " + dni + " Edade: " + edade + " NumGoles: " + numGoles;
    }

    // Orden natural: Por goles (de menor a mayor)
    @Override
    public int compareTo(Futbolista outro) {
        return Integer.compare(this.numGoles, outro.numGoles);
    }

    // Implementación completa del equals con Cast
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // ¿Son el mismo objeto?
        if (obj == null || getClass() != obj.getClass()) return false; // ¿Es nulo o de otra clase?
        // Aquí hacemos el CAST que faltaba
        Futbolista outro = (Futbolista) obj;
        // Comparamos el DNI (que viene de Persoa) para saber si es el mismo humano
        return Objects.equals(this.dni, outro.dni);
    }


    // Método estático para el comparador de Nombre + Goles
    // Esto es mucho más limpio que implementar Comparator en la cabecera
    public static Comparator<Futbolista> getComparadorNomeGoles() {
        return (f1, f2) -> {
            int resNombre = f1.getNome().compareTo(f2.getNome());
            if (resNombre != 0) {
                return resNombre;
            }
            return Integer.compare(f1.getGoles(), f2.getGoles());
        };
    }
}