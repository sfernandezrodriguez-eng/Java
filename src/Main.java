import java.io.*;
import java.util.*;

void main() {

    ArrayList<Futbolista> equipo = new ArrayList<>();
    Futbolista f1 = new Futbolista("Dalo GZ", "1553AA", 19, 2);
    Futbolista f2 = new Futbolista("Aaronux_025", "1023AA", 69, 0);
    Futbolista f3 = new Futbolista("Noel-Fr", "1123AA", 17, 3);
    equipo.add(f1);
    equipo.add(f2);
    equipo.add(f3);
    /*for (int i=0;i<equipo.size();i++) {
        System.out.println(equipo.get(i));
    }

    Iterator<Futbolista> it = equipo.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }*/

    ListIterator<Futbolista> litr = equipo.listIterator();
    while (litr.hasNext()) {
        System.out.println(litr.next());
    }
    while (litr.hasPrevious()) {
        System.out.println(litr.previous());
    }

    Alumno a = new Alumno("sergio", "123D", 13, 1234, "DCastelao", "Dam");
    System.out.println(a.getCurso());


    // ==========================================
    // PASO 2: O TRÁNSITO DE COLECCIÓNS
    // ==========================================
    ArrayList<Producto> almacen = new ArrayList<>();
    almacen.add(new Producto("P1", "Chaves Inglesas", 15));
    almacen.add(new Producto("P2", "Martelos", 0)); // Esgotado (para o Iterator)
    almacen.add(new Producto("P3", "Parafusos", 50));
    almacen.add(new Producto("P1", "Chaves Repetidas", 5)); // Duplicado a posta
    almacen.add(new Producto("P4", "Talocha", 8));
    almacen.add(new Producto("P5", "Brocas", 22));

    // 1. Limpeza de duplicados con HashSet
    HashSet<Producto> conxuntoLimpio = new HashSet<>(almacen);
    almacen.clear();
    almacen.addAll(conxuntoLimpio);

    // 2. Borrado seguro co Iterator (cantidade == 0)
    Iterator<Producto> it = almacen.iterator();
    while (it.hasNext()) {
        Producto p = it.next();
        if (p.getCantidad() == 0) {
            it.remove(); // Borrado sen ConcurrentModificationException
        }
    }

    // 3. A Ponte ao Mundo Estático (toArray co molde [0])
    Producto[] escaparate = almacen.toArray(new Producto[0]);

    // ==========================================
    // PASO 3: MATRIZ CONECTADA E XENÉRICOS
    // ==========================================
    String[][] estanterias = new String[3][3];
    // Inicializamos a matriz
    for (int f = 0; f < estanterias.length; f++) {
        Arrays.fill(estanterias[f], "Baleiro");
    }

}

            /**
            // Chamada ao método de conexión
            conectarEscaparateAEstanterias(escaparate, estanterias);

            // Imprimir matriz para comprobar visualmente
            System.out.println("\n--- ESTADO DAS ESTANTERÍAS ---");
            for (int f = 0; f < estanterias.length; f++) {
                System.out.println(Arrays.toString(estanterias[f]));
            }


            // Proba do método xenérico
            Producto buscar = new Producto("P3", "", 0); // Só importa o código polo equals
            int indice = buscarElemento(escaparate, buscar);
            System.out.println("\nProduto atopado no escaparate no índice: " + indice);

            // ==========================================
            // PASO 4: PERSISTENCIA CON EXCEPCIÓNS (TRY-WITH-RESOURCES)
            // ==========================================
            gardarDatosFicheiro(almacen);
        }

        // MÉTODO DE CONEXIÓN: Array -> Matriz 2D
        public static void conectarEscaparateAEstanterias(Producto[] escaparate, String[][] matriz) {
            for (int i = 0; i < escaparate.length; i++) {
                int fila = i; // A fila é o índice do array
                int columna = escaparate[i].getCantidad() % 3; // Lóxica matemática do stock

                // Controlamos que o índice do array non desborde a matriz por se hai moitos produtos
                if (fila < matriz.length) {
                    if (matriz[fila][columna].equals("Baleiro")) {
                        matriz[fila][columna] = escaparate[i].getDescripcion();
                    } else {
                        System.out.println("Colisión en [" + fila + "][" + columna + "] para: " + escaparate[i].getDescripcion());
                    }
                }
            }
        }

        // MÉTODO XENÉRICO ESTÁTICO (O do Boletín de Vectores)
        public static <T> int buscarElemento(T[] matriz, T elemento) {
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i].equals(elemento)) { // Usa o equals do obxecto
                    return i;
                }
            }
            return -1;
        }

        // XESTIÓN ESTRICTA DE EXCEPCIÓNS EN FICHEIROS
        public static void gardarDatosFicheiro(ArrayList<Producto> lista) {
            // O try-with-resources pecha os fluxos automaticamente sen o .close() no finally
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stock_peche.dat"))) {
                oos.writeObject(lista);
                System.out.println("\n💾 Ficheiro 'stock_peche.dat' gardado con éxito.");
            } catch (FileNotFoundException e) {
                System.err.println("Erro: Non se puido crear o ficheiro. Ruta non válida.");
            } catch (IOException e) {
                System.err.println("Erro crítico de entrada/saída (I/O) ao escribir.");
                e.printStackTrace();
            }
        }
**/


