/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author sandr
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numero");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
 
        do { 
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("Ingrese una opcion");
            int opciones = leer.nextInt();
            String siono;
            switch (opciones) {
                case 1:
                    System.out.println("El resultado es: " + (num1+num2));
                 
                case 2:
                    System.out.println("El resultado es: " + (num1-num2));
                
                case 3: 
                    System.out.println("El resultado es: " + (num1*num2));
                   
                case 4:
                    System.out.println("El resultado es: " + (num1/num2));
                   
                case 5:
                    System.out.println("Esta seguro que desea salir del programa? Y/N");
                    Scanner read = new Scanner(System.in);
                    siono = read.nextLine();
                    if (siono.equalsIgnoreCase("Y"));
                    break;        
        }
      } while (opciones>0 && opciones<=5)
        }
     