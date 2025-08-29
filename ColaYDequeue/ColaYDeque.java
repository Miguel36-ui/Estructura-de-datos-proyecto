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

    
    



