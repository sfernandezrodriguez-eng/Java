import java.util.Comparator;
import java.util.Objects;

// Implementa Comparable para a orde natural (DNI)
public class Futbolista extends Persoa implements Comparable<Futbolista> {
    private int numGoles;

    public Futbolista(String nome, String dni, int edade, int numGoles) {
        super(nome, dni, edade);
        this.numGoles = numGoles;
    }

    // Getters e Setters
    public int getNumGoles() { return numGoles; }

    public void setNumGoles(int numGoles) { this.numGoles = numGoles; }

    // 1. Orde natural por DNI (como pide o enunciado)
    @Override
    public int compareTo(Futbolista outro) {
        return this.dni.compareTo(outro.dni);
    }

    // 2. Equals baseado no DNI
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Futbolista outro = (Futbolista) obj;
        return Objects.equals(this.dni, outro.dni);
    }

    @Override
    public String toString() {
        // Aproveitamos o toString de Persoa se existe, ou montamos o noso
        return super.toString() + " | Goles: " + numGoles;
    }

    // --- COMPARADORES ADICIONAIS ---

    // Comparador por Nome
    public static class ComparadorNome implements Comparator<Futbolista> {
        @Override
        public int compare(Futbolista f1, Futbolista f2) {
            return f1.getNome().compareTo(f2.getNome());
        }
    }

    // Comparador por Número de Goles
    public static class ComparadorGoles implements Comparator<Futbolista> {
        @Override
        public int compare(Futbolista f1, Futbolista f2) {
            return Integer.compare(f1.getNumGoles(), f2.getNumGoles());
        }
    }
}