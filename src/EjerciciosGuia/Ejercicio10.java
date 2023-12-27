package EjerciciosGuia;

import java.util.Scanner;

/*
EJERCICIO 10
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        for(int i = 1; i <=4; i++) {
            System.out.println("Ingrese el numero " + i + ": ");
            int num = sc.nextInt();
            
            if (num <1 || num > 20){
                System.out.println("Ingrese 4 numeros comprendidos entre 1 y 20");
                i--;
                continue;
            }
        
        System.out.print(num + " ");
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
        
        System.out.println();
        
        }
    }
}
