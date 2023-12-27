package EjerciciosGuia;

/*
Ejercicio 5 -DETECCIÓN DE ERRORES-
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.

Arreglar la siguiente porción de codigo.
public static void main(String[] args) {
Scanner leer = new Scanner();
System.out.println("Ingresa tu edad");
String nombre = leer.nextInt();

System.out.println("Ingresa tu nombre");
int edad = leer.next();
}
}
*/
import java.util.Scanner;
        
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad = 0;
        double vida = edad - 2023;
        boolean bandera = edad < vida;
        char a;
        
        System.out.println("Con esta clase guardamos valores ingresados por consola");

        System.out.print("Ingresa tu nombre ");
        nombre = leer.nextLine();
        System.out.println("Su nombre es: " + nombre);

        System.out.print("Ingresa tu edad ");
        edad = leer.nextInt();
        System.out.println("Su edad es: " + edad);
        
        System.out.print("Ingresa el radio ");
        vida = leer.nextDouble();        
        System.out.println("Sus nacimiento es: " + vida);
        
        System.out.println("Ingrese su letra ");
        a = leer.next().charAt(0);
        System.out.println("Su letra es: " + a);
        
        System.out.println("Es verdadero o falso ? ");
        bandera = leer.nextBoolean();
        System.out.println("Su respuesta es: " + bandera);
    }
}

