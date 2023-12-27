
package EjerciciosGuia;

import java.util.Scanner;
/*
EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
*/        
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Ingrese el numero " + i + ": ");
            int num = sc.nextInt();
        
            if (num == 0) {
                System.out.println("Se capturo el numero cero");
                break;
            }
            
            if (num > 0) {
                suma += num;
            }
        }
        System.out.println("La suma de los numeros ingresados es: "+ suma);
    }
}
