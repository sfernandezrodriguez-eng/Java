import java.util.ArrayList;
import java.util.Iterator;

public class XestorSocios {
    ArrayList<Socio> socios = new ArrayList<>();


    public boolean engadirAlta(Socio s) {
        return socios.add(s);
    }

    public boolean quitarAlta(String dni) {
        //sin iterator
        for (int i = 0; i < this.socios.size(); i++) {
            if (socios.get(i).dni.equals(dni)) {
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
        //Este funciona porque hicimos antes equal, si no tuvieramos equasl cogeria el de object y ese mira la direccion de memoria por lo que no daria nunca.
        Socio outro = new Socio("", dni, 0, "01/01/0001");
        return socios.remove(outro);
    }

    public void amosarSocios() {
        if (socios.isEmpty()) {
            System.out.println("O xestor está baleiro. Non hai socios de alta.");
        } else {
            System.out.println("--- LISTADO DE SOCIOS ACTIVOS ---");
            // Usamos un for-each, que para LEER (no borrar) es el más limpio
            for (Socio s : this.socios) {
                System.out.println(s.toString());
            }
        }
    }


}

