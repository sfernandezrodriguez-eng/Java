// bucles en java
import java.util.Scanner;

public class Bucles {
    public static void main (String[] args){
        int contador=0;
        while (contador <= 5){
            System.out.println(contador);
            contador++;
        }
        // scanner se utiliza como el input en python
        Scanner teclado =new Scanner (System.in);
        int opcion=0;
        while (opcion != 3) {
            System.out.println("Elixa unha opcion");
            System.out.println("1.Saudar");
            System.out.println("2.Despedirse");
            System.out.println("3.Sair");
            // este metodo recoge la respuesta del input
            String op = teclado.nextLine();
            // asi se convierte un string a un integer en vez de esto puedo usar antes el metodo .nextInt
            opcion =  Integer.parseInt(op);
            switch(opcion) {
                case 1:
                    System.out.println("Bienvenido");
                    break;
                case 2:
                    System.out.println("Hasta luego");
                    break;
                case 3:
                    System.out.println("Programa cerrado");
                    break;
                default:
                    System.out.println("Error de opcion");
                    break;
            }
        }
        // bucle do while
        //como minimo se ejecuta una vez, primera ejecuta y despues evalua. Al reves que while

        int contador1= 0;
        do{
            System.out.println("Bucle do while "+contador1);
            contador1++;
        }while (contador1 <=5);
        //bucle for

        //for(inicializacion ; expresion condicional; incremento ){}
        for (int i=5; i<20 ;i+=3){
            System.out.println("Indice: " + i);
        }
        // bucle infinito con codicion de salida y break
        int i=5;
                for(;;) {
                    System.out.println("Indice: " + i);
                    i += 3;
                    if (i > 19) break;
                }


    }

}

