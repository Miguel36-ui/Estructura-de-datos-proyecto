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

