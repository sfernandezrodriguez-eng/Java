package animal;

interface Son {
    void vox();
}

interface Viviparo {
    static final boolean viviparo = true;
}

public class Animal implements Comparable <Animal>{
    int numPatas;


    public Animal (int patas) {
        numPatas = patas;
    }

    @Override
    public int compareTo(Animal outro) {
        if (this.numPatas == outro.numPatas) return 0;
        else return this.numPatas - outro.numPatas;

    }

    public static void rascarConPata() {
        System.out.println("Rascando con la pata");
    }

    public static void main() {
        Animal p1 = new Animal(5);
        Animal p2 = new Animal(0);
        System.out.println(p1.compareTo(p2));
    }
}
