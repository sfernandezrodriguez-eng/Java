public class Circulo extends Punto{
    private int radio;



    public Circulo(int x, int y, int r) {
        super(x,y);
        radio = r;

    }

    public int getRadio() {
        return this.radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

}
