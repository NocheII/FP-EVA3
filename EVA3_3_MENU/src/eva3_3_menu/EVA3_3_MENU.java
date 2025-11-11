/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_menu;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA3_3_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        do{
            imprimirMenu();
            opcion = input.nextInt();
            if (opcion == 1){
                calcularPotencia();
            }else if(opcion == 2){
                calcularSuma();
            }
        }while(opcion != 3);
        
        // TODO code application logic here
    }
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("1. Calcular una potencia");
        System.out.println("2. Sumar dos numeros");
        System.out.println("3. Salir del sistema");
        System.out.println("Selecciona una opcion");
    }
    
    public static void calcularPotencia(){
        Scanner input = new Scanner(System.in);
        int base, exponente;
        System.out.println("CALCULO DE UNA POTENCIA");
        System.out.println("Captura la base: ");
        base = input.nextInt();
        System.out.println("Captura el exponente: ");
        exponente = input.nextInt();
        System.out.println("La potencia de " + base + " al " + exponente + " es: " + calcularPot(base, exponente));
        
        
    }
    public static int calcularPot(int base, int exp){
        int resu = 1;
        for(int i = 1; i <= exp; i++){
            resu = resu* base;
        }
        
        return resu;
    }
    
    public static void calcularSuma(){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("SUMA");
        System.out.println("Captura el num 1: ");
        num1 = input.nextInt();
        System.out.println("Captura el num 2: ");
        num2 = input.nextInt();
        System.out.println("La suma de el numero : " + num1 + " + " + num2 + " es: " + calcularSum(num1, num2));
        
        
    }
    public static int calcularSum(int num1, int num2){
        int resu = 0;
        resu = num1 + num2;
        
        return resu;
    }
}
