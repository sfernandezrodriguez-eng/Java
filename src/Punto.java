public class Punto implements Area{
    private int x;
    private int y;

    public Punto() {
        this.x=0;
        this.y=0;
    }

    public Punto(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
            this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
            this.y = y;
    }

    @Override
    public String toString() {
        return "X: "+x+" Y: "+y;
    }
    public static void main(String args[]) {
        Punto p = new Punto(2,3);
        System.out.println(p.calcularArea());
    }
}
