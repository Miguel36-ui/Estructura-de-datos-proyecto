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

