/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
Crear un programa que pida una frase y si esa frase es igual a “eureka” 
* el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
* Nota: investigar la función equals() en Java.

 */
import java.util.Scanner;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String frase, correcta="eureka"; 
       Scanner read=new Scanner(System.in);
       
        System.out.println("adivina la frase secreta:");
        frase= read.nextLine();
        
        if (frase.equals(correcta)){
            System.out.println("Adivinaste!!!");
        } else{
            System.out.println("ERRRORRRR!");
        }
       
    }
    
}
