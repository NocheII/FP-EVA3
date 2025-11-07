/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA3_1_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 5, num2 = 10;
        int resu = sumarNumeros(num1,num2);
        System.out.println ("la suma es: " + resu);
        // TODO code application logic here
    }
    public static int sumarNumeros (int num1, int num2){
        int suma;
        suma = num1 + num2;
        return
            suma;
    }
}
