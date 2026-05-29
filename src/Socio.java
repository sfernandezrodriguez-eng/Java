import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Socio extends Persoa implements Comparable<Socio>{
    public LocalDate dataAlta;




    public Socio(String nome, String dni, int edad, String dataAlta){
        super(nome,dni,edad);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataAlta = LocalDate.parse(dataAlta, formato);

    }

    public int antiguidade(){
        return (int)dataAlta.until(LocalDate.now(), ChronoUnit.YEARS);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Socio outro = (Socio) obj;
        return Objects.equals(this.dni, outro.dni);

    }

    /**@Override
    public boolean equals2(Object outro){
        Persoa outraPersoa = (Persoa) outro;
        if (this.dni.equals( outraPersoa.dni)) return true;
        return false;
    }**/

    @Override
    public int compareTo(Socio o) {
        return this.dni.compareTo(o.dni);
    }

    @Override
    public String toString(){
        return super.toString() + " antiguidade: " + this.antiguidade();

    }

    public static void main(String args[]){
        Socio s = new Socio("Sergio", "123D",18,"10/02/2020");
        System.out.println(s.toString());

    }
}
