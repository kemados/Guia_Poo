package EjerciciosGuia;

import java.util.Scanner;

/*
EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.

*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();
        
        if (num1>25){
            System.out.println("Su primer numero es mayor que 25");
        }
        
        if(num2>25){
            System.out.println("Su segundo numero es mayor que 25");
        }
        
        if(num1 <= 25 && num2 <= 25){
            System.out.println("Ninguno de los numeros es mayor que 25");
        }
    }
}
