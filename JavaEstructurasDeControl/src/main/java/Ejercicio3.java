/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       
   
        Scanner teclado = new Scanner( System.in );
        String palabra;
        System.out.printf( "Introduzca na palabra de 8 letras: " );
        palabra=teclado.nextLine();
         int n = palabra.length();
        if ( n == 8 ){
            System.out.printf( "CORRECTO!  :-) " );
        }else {
            System.out.printf( " INCORRECTO  >:(  " );
        }
    }
}
