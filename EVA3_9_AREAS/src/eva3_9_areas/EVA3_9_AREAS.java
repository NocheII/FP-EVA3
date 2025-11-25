/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_areas;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA3_9_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        do {
            imprimirMenu();
            valor = captu.nextInt();
        switch(valor){
                case 1:
                    System.out.println("Calcular Area de un Circulo ");
                    calcularArea(0.0);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Calcular Area de un Traingulo");
                    calcularArea(1.0,1);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Calcular Area de Trapecio");
                    calcularArea(2.0,1.0);
                    System.out.println("");
                    break;
                    }
                  }while(valor != 4);
        }
        public static void calcularArea(double Area){
            Scanner captu = new Scanner (System.in);
            double area, radio;
            System.out.println("Introduce el Radio del circulo: ");
            radio= captu.nextDouble();
            area= (radio * radio) * Math.PI;
            System.out.println(area);
        }
        public static void calcularArea(double Area, int Base){
            Scanner captu = new Scanner (System.in);
            double base, altura,area;
            System.out.println("Introduce la base del Triangulo: ");
            base= captu.nextDouble();
            System.out.println("Introduce la alltura del Triangulo: ");
            altura= captu.nextDouble();
            area= (base * altura) / 2;
            System.out.println(area);
        }
        public static void calcularArea(double Area, double Basem){
            Scanner captu = new Scanner (System.in);
            double baseM, basem, altura, area, area1;
            System.out.println("Introduce la base menor del trapecio: ");
            baseM= captu.nextDouble();
            System.out.println("Introduce la base mayor del trapecio: ");
            basem= captu.nextDouble();
            System.out.println("Introduce la altura del trapecio ");
            altura= captu.nextDouble();
            area= ((basem + baseM) * altura)/2;
            System.out.println(area);
        }
        public static void imprimirMenu(){
            System.out.println("Calculadora de Areas:");
            System.out.println("Elige que quieres calcular");
            System.out.println("1. Calcular Area de un Circulo");
            System.out.println("2. Calcular Area de un Triangulo");
            System.out.println("3. Calcular Area de un Trapecio");
            System.out.println("4. Salir");
        }
}