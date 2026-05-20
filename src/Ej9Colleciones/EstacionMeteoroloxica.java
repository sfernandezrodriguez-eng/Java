package Ej9Colleciones;

import java.util.ArrayList;
import java.util.Scanner;

public class EstacionMeteoroloxica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> temperaturas = new ArrayList<>();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n--- ESTACIÓN METEOROLÓXICA ---");
            System.out.println("1. Nueva temperatura");
            System.out.println("2. Listar temperaturas");
            System.out.println("3. Mostrar estatística");
            System.out.println("4. Salir");
            System.out.print("Selecciona unha opción: ");

            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Introduce a temperatura (°C): ");
                double temp = sc.nextDouble();
                temperaturas.add(temp);
                System.out.println("Registro guardado.");

            } else if (opcion == 2) {
                if (temperaturas.isEmpty()) {
                    System.out.println("No hay registros.");
                } else {
                    System.out.println("\n--- LISTA DE TEMPERATURAS ---");
                    for (int i = 0; i < temperaturas.size(); i++) {
                        System.out.println("Registro " + (i + 1) + ": " + temperaturas.get(i) + "°C");
                    }
                }

            } else if (opcion == 3) {
                if (temperaturas.isEmpty()) {
                    System.out.println("No hay datos para calcular estatísticas.");
                } else {
                    double max = temperaturas.get(0);
                    double min = temperaturas.get(0);
                    double suma = 0;

                    for (double t : temperaturas) {
                        if (t > max) {
                            max = t;
                        }
                        if (t < min) {
                            min = t;
                        }
                        suma += t;
                    }

                    double promedio = suma / temperaturas.size();

                    System.out.println("\n--- ESTATÍSTICAS ---");
                    System.out.println("Máxima registrada: " + max + "°C");
                    System.out.println("Mínima registrada: " + min + "°C");
                    System.out.println("Media del dia: "  + promedio);
                    System.out.println("Total de lecturas: " + temperaturas.size());
                }

            } else if (opcion == 4) {
                System.out.println("Saliendo del sistema, hasta la proxima...");
            } else {
                System.out.println("Opción incorrecta.");
            }
        }
        sc.close();
    }
}