import java.util.LinkedList;
import java.util.Scanner;

public class ColaYDeque {
    private LinkedList<String> cola;
    private LinkedList<String> deque;

    public ColaYDeque() {
        cola = new LinkedList<>();
        deque = new LinkedList<>();
    }

    // --- Métodos para Cola FIFO ---
    public void enqueue(String elemento) {
        cola.addLast(elemento);
        System.out.println("Se agregó a la cola: " + elemento);
    }

    public void dequeue() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            String eliminado = cola.removeFirst();
            System.out.println("Se eliminó de la cola: " + eliminado);
        }
    }

    public void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Estado de la cola: " + cola);
        }
    }

    // --- Métodos para Deque (doble cola) ---
    public void insertarIzquierda(String elemento) {
        deque.addFirst(elemento);
        System.out.println("Se insertó por la izquierda: " + elemento);
    }

    public void insertarDerecha(String elemento) {
        deque.addLast(elemento);
        System.out.println("Se insertó por la derecha: " + elemento);
    }

    public void eliminarIzquierda() {
        if (deque.isEmpty()) {
            System.out.println("La deque está vacía.");
        } else {
            String eliminado = deque.removeFirst();
            System.out.println("Se eliminó por la izquierda: " + eliminado);
        }
    }

    public void eliminarDerecha() {
        if (deque.isEmpty()) {
            System.out.println("La deque está vacía.");
        } else {
            String eliminado = deque.removeLast();
            System.out.println("Se eliminó por la derecha: " + eliminado);
        }
    }

    public void mostrarDeque() {
        if (deque.isEmpty()) {
            System.out.println("La deque está vacía.");
        } else {
            System.out.println("Estado de la deque: " + deque);
        }
    }

    // --- Menú interactivo ---
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Cola FIFO: Enqueue");
            System.out.println("2. Cola FIFO: Dequeue");
            System.out.println("3. Cola FIFO: Mostrar");
            System.out.println("4. Deque: Insertar por izquierda");
            System.out.println("5. Deque: Insertar por derecha");
            System.out.println("6. Deque: Eliminar por izquierda");
            System.out.println("7. Deque: Eliminar por derecha");
            System.out.println("8. Deque: Mostrar");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el elemento a encolar: ");
                    String e1 = sc.nextLine();
                    enqueue(e1);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    mostrarCola();
                    break;
                case 4:
                    System.out.print("Ingresa el elemento a insertar por izquierda: ");
                    String e2 = sc.nextLine();
                    insertarIzquierda(e2);
                    mostrarDeque();
                    break;
                case 5:
                    System.out.print("Ingresa el elemento a insertar por derecha: ");
                    String e3 = sc.nextLine();
                    insertarDerecha(e3);
                    mostrarDeque();
                    break;
                case 6:
                    eliminarIzquierda();
                    mostrarDeque();
                    break;
                case 7:
                    eliminarDerecha();
                    mostrarDeque();
                    break;
                case 8:
                    mostrarDeque();
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 9);

        sc.close();
    }

    // --- Método principal ---
    public static void main(String[] args) {
        ColaYDeque app = new ColaYDeque();
        app.menu();
    }
}
