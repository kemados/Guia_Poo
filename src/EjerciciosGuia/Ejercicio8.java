package EjerciciosGuia;

import java.util.Scanner;

/*
EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
*/

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nota;

        do {
            System.out.println("Ingrese una nota valida entre 0 y 10:");
            nota = scanner.nextInt();
        } while (nota < 0 || nota > 10);

        System.out.println("La nota ingresada es: " + nota);
    }
}
