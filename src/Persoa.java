// El nombre de la clase y del fichero tienen que ser el mismo
// Para poder acceder desde fuera a la clase tiene que ser public
// Puede haber una clase privada siempre que no sea la principal del fichero
// Las clases pueden ser public, private o protected que no se escribe nada igual que en python
// Public, cualquiera puede acceder, Private no se puede acceder, Protected solo se puede acceder si
// esta dentro de la misma carpeta

public class Persoa {
    //declaracion de propiedades primero
    public String nome;
    public String dni;
    public int edade;
    // constructor de la clase

    public Persoa() {
        nome = "";
        dni = "00000000T";
        edade = 0;
    }

    public Persoa(String n, String d, int e) {
        this.nome = n;
        this.dni = d;
        this.edade = e;

        /*
        this.nome = nome;
        this.dni = dni;
        this.edade = edade;
         */
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome() {
        this.nome = nome;
    }



    public static void main() {
        Persoa p1 = new Persoa();
        Persoa p2 = new Persoa("Sergio", "44556U", 45);
        System.out.println(p1.nome);
        System.out.println(p2.nome);
    }
}
