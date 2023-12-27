
package EjerciciosGuia;

/*
EJERCICIO 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
*/

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        esMultiplo(num1, num2);
    }

    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    }
}
