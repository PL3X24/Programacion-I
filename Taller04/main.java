package Taller04;
import java.util.Scanner;

public class main {

    public static void main(String[] args){
        
        // Scanner y deficinion de i para el bucle
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        // Creacion de los objetos
        caida caida = new caida();
        interes interes = new interes();
        
        caida.titulos();

        // Menu interactivo
        while (i == 0) {

            System.out.println("Que desea hacer");
            System.out.println("[1] Calcular el tiempo de caida libre");
            System.out.println("[2] Calcular el monto final depositado en un banco");
            System.out.println("[3] Salir del programa");
            int j = scanner.nextInt();
        
            // Logica del menu
            switch (j) {

                // Caida libre
                case 1:
                    
                    caida.Calculos();
                    caida.Resultado();
                    System.out.println("");
                    break;
                
                // Interes
                case 2:

                    interes.LeerMonto();
                    interes.Calcular();
                    interes.Resultados();
                    break;

                // Bye bye
                case 3:
                    System.out.println("Saliendo...");
                    i = 1;
                    break;
                default:
                System.out.println("Opcion no valida");
                System.out.println("");
                    break;
            }
        }
    }
    
}
