/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoconjunto;

/**
 *
 * @author migue
 */
class Alumno {
    private double[] calificaciones;
    private int cantidad;

    public Alumno(int cantidad) {
        this.cantidad = cantidad;
        this.calificaciones = new double[cantidad];
    }

    public void setCalificacion(int index, double valor) {
        if (index >= 0 && index < cantidad) {
            calificaciones[index] = valor;
        }
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double cal : calificaciones) {
            suma += cal;
        }
        return suma / cantidad;
    }

    public void mostrarCalificaciones() {
        System.out.println("\n📌 Calificaciones ingresadas:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Calificación " + (i+1) + ": " + calificaciones[i]);
        }
    }
}