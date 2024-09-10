package Taller04;
import java.util.Scanner;

public class interes{

    // Declaracion de variables
    private double montoF;
    private double montoU;
    private double interesU;
    
    // Funcion para leer el monto y la tasa de interes
    public void LeerMonto(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre el monto inicial $");
        montoU = scanner.nextDouble();
        System.out.println("Entre la tasa interes");
        interesU = scanner.nextDouble();
    }

    // Funcion para calcular el monto
    public void Calcular(){
        montoF = (montoU + (interesU/100) * montoU);
    }
    
    // Imprimir los resultados
    public void Resultados(){
        System.out.println("Monto al inicio: " + montoU);
        System.out.println("Tasa de interes: " + interesU);
        System.out.println("Monto mas interes: " + montoF);
        System.out.println("");
    }
}
