public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(){
        this.hora=0;
        this.minutos=0;
        this.segundos=0;
    }

    public Hora(int h, int m, int s) {
        setHora(h);
        setMinutos(m);
        setSegundos(s);
    }

    /*Constructor en String*/
    public Hora(String h) {
        String[] cositas = h.split(":");
        setHora(Integer.parseInt(cositas[0]));
        setMinutos(Integer.parseInt(cositas[1]));
        setSegundos(Integer.parseInt(cositas[2]));
    }

    /*Constructor en double*/
    public Hora(double h) {
        int hEntera = (int) h;
        double parteDecimal = h - hEntera;
        int m = (int) (parteDecimal * 60);
        int s = (int) (((parteDecimal * 60) - m) * 60);

        setHora(hEntera);
        setMinutos(m);
        setSegundos(s);
    }


    /*Get y Set de Hora*/
    public int getHora() {
        return this.hora;
    }

    public void setHora(int h) {
        if (h<24 && h>=0) {
            this.hora = h;
        }
        else {
            System.out.println("Error: El valor " + h + " no es válido para las horas.");
        }
    }


    /*Get y Set de Minutos*/
    public int getMinutos() {
        return this.minutos;
    }

    public void setMinutos(int min) {
        if (min < 60 && min >= 0) {
            this.minutos = min;
        }
        else {
            System.out.println("Error: El valor " + min + " no es válido para los minutos.");
        }
    }


    /*Get y Set de segundos*/
    public int getSegundos() {
        return this.segundos;
    }

    public void setSegundos(int seg) {
        if (seg<60 && seg>=0) {
            this.segundos = seg;
        }
        else {
            System.out.println("Error: El valor " + seg + " no es válido para los segundos.");
        }
    }

    private void iniciaACero( ){
        hora = 0;
        minutos = 0;
        segundos = 0;

    }
    public String toString() {
        return "Hora: "+hora+" minutos: "+minutos+" segundos: "+segundos;
    }

    public static void main(String[] args) {
        Hora h =  new Hora();
        System.out.println(h);
    }
}
