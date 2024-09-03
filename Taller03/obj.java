import java.util.Scanner;
public class obj {
    //Metodos que preguntaran y calcularan
    
    public static void Usuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa para calcular la formula general");
        System.out.println("Ingrese la variable A:");
        int A = scanner.nextInt();
        System.out.println("Ingrese la variable B:");
        int B = scanner.nextInt();
        System.out.println("Ingrese la variable C:");
        int C = scanner.nextInt();
        Procedimiento(A, B, C);
    }
        public static void Procedimiento ( int A, int B, int C){
        
        //discriminante
        float discr = B * B -4 * A * C;
            if (discr < 0){
                System.out.println("Las raices son imaginarias ya que la discriminante es negativa");
        } else {
            //raices
            float x1 = (-B + (float) Math.sqrt(discr)) / (2 * A);
            float x2 = (-B + (float) Math.sqrt(discr)) / (2 * A);
        }
    }
}

