import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class XestorSocios {
    ArrayList<Socio> socios = new ArrayList<>();


    public boolean engadirAlta(Socio s) {
        return socios.add(s);
    }

    public boolean quitarAlta(String dni) {
        //sin iterator
       for (int i=0;i< this.socios.size();i++) {
           if (socios.get(i).dni.equals(dni)){
                socios.remove(i);
                return true;
           }
       }
      return false;
    }

    public boolean quitarAlta2(String dni) {
        Iterator<Socio> it = socios.iterator();
        while (it.hasNext()) {
            Socio s = it.next();
            if (s.dni.equals(dni)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public boolean quitarAlta3(String dni) {
        Iterator<Socio> it = socios.iterator();
        while (it.hasNext()) {
            Socio s = it.next();
            if (s.dni.equals(dni)) {
                it.remove();
                return true;
            }
        }
        return false;
    }


    public static void main(String args[]) {
        int opcion = 0;

        do {
            System.out.println("\n--- XESTOR SOCIOS ---");
            System.out.println("1. Alta(añadir socios)");
            System.out.println("2. Baixa(borrar socios)");
            System.out.println("3. Salir");
            System.out.print("Selecciona unha opción: ");

            opcion = new Scanner(System.in).nextInt();
            switch (opcion) {
                case 1 -> {


                }

                case 2 -> {

                }
                case 3->{
                    System.out.println("Chao hasta luego....");
                }
            }
        } while (opcion!=3);

        }

    }

