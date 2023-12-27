package EjerciciosGuia;

import java.util.Scanner;

/* 
EJERCICIO 11
 Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
                    a e i o u
                    @ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
public class Ejercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase que termine en (.) ");
        String letra = sc.nextLine();
        
        String letraCodificada = reemplazar(letra);
        
        System.out.println("Su frase codificada es: " + letraCodificada);
    }
    
    public static String reemplazar(String letra){
        String letraCodificada = "";
        for (int i = 0; i < letra.length(); i++){
            char vocales = letra.charAt(i);
            
            if (vocales == '.'){
                break;
            }
            letraCodificada += palabra(vocales);
        } 
        return letraCodificada;
    }
    
    public static char palabra(char vocales){
        switch (vocales){
            case 'a':
                return '@';
            case 'e':
                return '#';
            case 'i':
                return '$';
            case 'o':
                return '%';
            case 'u':
                return '*';
            case 'A':
                return '@';
            case 'E':
                return '#';
            case 'I':
                return '$';
            case 'O':
                return '%';
            case 'U':
                return '*';
            default: 
                return vocales;
        }
    }
}

