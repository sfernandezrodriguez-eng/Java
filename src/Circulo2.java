public class Circulo2 extends Punto implements Area,Perimetro{
    private int radio;



    public Circulo2(int x, int y, int r) {
        super(x,y);
        radio = r;

    }

    public int getRadio() {
        return this.radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

   public static void main(String args[]) {
        Circulo2 c = new Circulo2(1,2,3);
       System.out.println(c.calcularArea());
       System.out.println(c.calcularPerimetro());

   }

    @Override
    public double calcularArea() {
        return pi*radio*radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
}
