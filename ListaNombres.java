// Commit 3: Mostrar todos los nombres al final
import java.util.ArrayList;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String nombre;
        System.out.println("Escribe nombres (escribe 'salir' para terminar):");

        while (true) {
            nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("salir")) {
                break;
            }

            nombres.add(nombre);
        }

        sc.close();

        // Mostrar la lista completa de nombres
        System.out.println("\nLista de nombres ingresados:");
        for (String n : nombres) {
            System.out.println(n);
        }
    }
}
