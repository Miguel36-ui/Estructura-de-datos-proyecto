/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoconjunto;
import java.util.*;
/**
 *
 * @author migue
 */
public class Proyectoconjunto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n--- MENÚ Principal ---");
            System.out.println("1.- Listas de calificaciones y promedio (5)");
            System.out.println("2.- Lista de tareas");
            System.out.println("3.- Linked list (lista de tareas)");
            System.out.println("4.- Pilas y operaciones básicas");
            System.out.println("5.- Colas FIFO y operaciones básicas");
            System.out.println("6.- Hashmap y diccionario");
            System.out.println("7.- Salir");

            try {
                opcion = Integer.parseInt(entrada.nextLine()); 
                switch (opcion) {
                    case 1:
                        MiguelListasCalificaciones miguel = new MiguelListasCalificaciones();
                        miguel.ejecutar();
                        break;
                      
                    case 2:
                        ArturoListaNombres arturo = new ArturoListaNombres();
                        arturo.ejecutar();
                        break;

                    case 3:
                        EduardoLinkedList eduardo = new EduardoLinkedList();
                        eduardo.ejecutar();
                        break;

                    case 4:
                        IsraArmandoPila israelyarmando = new IsraArmandoPila();
                        israelyarmando.ejecutar();
                        break;
                        
                    case 5:
                        MigueltressyAxelQueue miguelyaxel = new MigueltressyAxelQueue();
                        miguelyaxel.ejecutar();
                        
                        break;
                        
                    case 6:
                        KevinHashMap kevin = new KevinHashMap();
                        kevin.ejecutar();
                        break;
                        
                    default:
                        System.out.println("Valor no válido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida, intente de nuevo.");
            }
        } while (opcion != 7);

        entrada.close();        
    }
}
