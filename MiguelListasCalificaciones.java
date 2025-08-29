/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoconjunto;
import java.util.*;

/**
 *
 * @author migue
 */
public class MiguelListasCalificaciones {
    Scanner entrada = new Scanner(System.in);
    Alumno alumno = new Alumno(5); // arreglo de 5 elementos fijos

    public void ejecutar() {
        int opcion = 0;

        do {
            System.out.println("\n--- MENÚ Principal ---");
            System.out.println("1.- Agregar calificaciones");
            System.out.println("2.- Ver calificaciones");
            System.out.println("3.- Obtener promedio");
            System.out.println("4.- Salir");

            try {
                opcion = Integer.parseInt(entrada.nextLine()); 
                switch (opcion) {
                    case 1:
                        System.out.println("\nIngrese 5 calificaciones:");
                        for (int i = 0; i < 5; i++) {
                            System.out.print("Calificación " + (i+1) + ": ");
                            double valor = Double.parseDouble(entrada.nextLine());
                            alumno.setCalificacion(i, valor);
                        }
                        break;

                    case 2:
                        alumno.mostrarCalificaciones();
                        break;

                    case 3:
                        System.out.println("📊 Promedio: " + alumno.calcularPromedio());
                        break;

                    case 4:
                        System.out.println("Hasta luego.");
                        break;

                    default:
                        System.out.println("Valor no válido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada no válida, intente de nuevo.");
            }
        } while (opcion != 4);

    }

}