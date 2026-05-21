import java.util.Objects;

public class Academico extends Persoa2 implements Comparable<Academico> {
    private int anoIngreso;

    public Academico(String nome, String dni, int idade, int anoIngreso) {
        super(nome, dni, idade); // Llamada obligatoria al constructor del padre
        this.anoIngreso = anoIngreso;
    }

    public int getAnoIngreso() { return anoIngreso; }

    // ORDE NATURAL CON DESEMPATE: Cronológico por año, desempate alfabético por nombre
    @Override
    public int compareTo(Academico o) {
        if (this.anoIngreso != o.anoIngreso) {
            return Integer.compare(this.anoIngreso, o.anoIngreso); // Orden ascendente de años
        } else {
            // Si entraron el mismo año, desempatamos usando el compareTo de String sobre el nombre
            return this.getNombre().compareTo(o.getNombre());
        }
    }

    // EQUALS E HASHCODE: Basados en Nombre e Edad (atributos heredados)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Academico other = (Academico) obj;
        return this.getIdade() == other.getIdade() &&
                Objects.equals(this.getNombre(), other.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getNombre(), this.getIdade());
    }

    @Override
    public String toString() {
        return super.toString() + " | Ano Ingreso: " + anoIngreso;
    }
}