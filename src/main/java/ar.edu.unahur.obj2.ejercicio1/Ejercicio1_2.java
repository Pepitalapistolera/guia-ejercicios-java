package ar.edu.unahur.obj2.ejercicio1;
import java.sql.SQLOutput;
import java.util.Scanner;

//Leer un entero y luego una lista de 20 enteros. Guardar los mayores al número inicial y mostrarlos al final

public class Ejercicio1_2 {
    public static void main(String[] args) {
        int numeros[] = new int[20];
        int mayores[] = new int[20];
        int puntero;
        int k = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("ingrese el numero puntero: ");
        puntero = num.nextInt();
        System.out.println("ingrese 20 numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = num.nextInt();
        }
        System.out.println("Los mayores son: ");
        for (int j = 0; j < numeros.length; j++) {
            if (numeros[j] > puntero) {
                mayores[k] = numeros[j];
                k++;
            }
        }
        for (int i=0; i<k; i++){
            System.out.println(mayores[i]);
        }

    }
}

