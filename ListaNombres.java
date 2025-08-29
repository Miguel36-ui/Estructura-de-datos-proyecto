// Commit 2: Leer nombres y agregarlos mientras no sea 'salir'
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
    }
}
