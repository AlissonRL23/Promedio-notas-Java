/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedionota;

/**
 *
 * @author Admin
 */
public class PromedioNota {
    
    /**
     * @param nota1
     * @param nota2
     * @return 
     */
    // Método que calcula el promedio
    public static double calcularPromedio(double nota1, double nota2) {
        double promedio = (nota1 + nota2) / 2;
        return promedio;
    }

    public static void main(String[] args) {

        double nota1 = 8.5;
        double nota2 = 9.0;

        double resultado = calcularPromedio(nota1, nota2);

        System.out.println("El promedio es: " + resultado);
    }
}

