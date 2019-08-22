package ar.edu.unahur.obj2.ejercicio1;
import java.util.Scanner;

//Leer 10 datos numéricos y mostrarlos en orden inverso

public class Ejercicio1 {

    public static void main (String[]args) {
    int numeros[]  = new int [10];
    Scanner num = new Scanner(System.in);
    System.out.println("Ingrese 10 numeros: ");
    for(int i=0; i<numeros.length; i++) {
        numeros[i] = num.nextInt();
    }

    System.out.println("En orden inverso: ");
    for(int i=9; i>=0; i--){
        System.out.println(numeros[i]);
    }
    }
}
