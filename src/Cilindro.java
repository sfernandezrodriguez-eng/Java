public class Cilindro extends Circulo2 implements Volume{
    public int altura;

    public Cilindro( int x, int y, int radio, int altura ){
        super(x,y,radio);
        this.altura = altura;

    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return pi*getRadio()*getRadio()*altura;
    }

    public static void main(String args[]) {
        Cilindro c2 = new Cilindro(2,3,4,5);
        System.out.println(c2.calcularVolume());

    }
}
