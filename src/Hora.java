public class Hora {
    private int hora;
    private int minutos;
    private int segundos;


    public Hora(int h, int m, int s) {
        this.hora = h;
        this.minutos = m;
        this.segundos = s;

    }

    /*Constructor en String*/
    public Hora(String h) {
        String[] cositas = h.split(":");
        this.hora =  Integer.parseInt(cositas[0]);
        this.minutos = Integer.parseInt(cositas[1]);
        this.segundos = Integer.parseInt(cositas[2]);
    }

    /*Constructor en double*/
    public Hora(double h) {
        this.hora = (int) h;
        double residuo1 = hora - h;
        this.minutos = (int) residuo1 * 60;
        this.segundos = minutos * 60;



    }


    /*Get y Set de Hora*/
    public int getHora() {
        return this.hora;
    }

    public void setHora() {
        if (hora<24 && hora>=0) {
            this.hora = hora;
        }
        else {
            System.out.println("error");
        }
    }


    /*Get y Set de Minutos*/
    public int getMinutos() {
        return this.minutos;
    }

    public void setMinutos() {
        if (minutos < 60 && minutos >= 0) {
            this.minutos = minutos;
        }
        else {
            System.out.println("error");
        }
    }


    /*Get y Set de segundos*/
    public int getSegundos() {
        return this.segundos;
    }

    public void setSegundos() {
        if (segundos<60 && segundos>=0) {
            this.segundos = segundos;
        }
        else {
            System.out.println("error");
        }
    }
    public static void main() {
        Hora h1 =  new Hora("12:73:04");
        Hora h2 =  new Hora(12,73,04);
        System.out.println(h1.minutos);

    }
}
