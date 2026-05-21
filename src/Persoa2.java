import java.io.Serializable;

// Debe ser abstracta para cumplir el enunciado y Serializable para el Paso 4
public abstract class Persoa2 implements Serializable {
    private String nome;
    private String dni;
    private int idade;

    public Persoa2(String nome, String dni, int idade) {
        this.nome = nome;
        this.dni = dni;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNombre() { return nome;}
    public String getDni() { return dni; }
    public int getIdade() { return idade; }

    @Override
    public String toString() {
        return "Nome: " + nome + " | DNI: " + dni + " | Idade: " + idade;
    }
}