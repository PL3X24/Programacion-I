import java.util.Scanner;
public class obj {
    //Declaracion de variables
    
    private float x1;
    private float x2;
    private float resultado;

    //Metodo de entrada
    public obj() {

        // Salida de presentacion
        System.out.println(" Universidad tecnologica de panama  ");
	    System.out.println(" Estudiante Oliver Batista 8-1028-1845 ");
        System.out.println(" Estudiante Alexis Gonzales 8-1026-1272 ");
        
        //Entrada del usuario
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
        //Metodo que resuelve la operacion
        private void Procedimiento ( int A, int B, int C){
        
        //Calcular discriminante antes de proceder
        float discr = B * B -4 * A * C;
        resultado = discr;
            if (discr < 0){
                System.out.println("Las raices son imaginarias ya que la discriminante es negativa");
        }
            else if (discr > 0) {
            //raices
                x1 = (-B + (float) Math.sqrt(discr)) / (2 * A);
                x2 = (-B - (float) Math.sqrt(discr)) / (2 * A);
        }
    }

    //Metodos para devolver la respuesta en main
    public float getX1() {
        return x1;
    }

    public float getX2() {
        return x2;
    }

    public float getdiscr(){
        return resultado;
    }
}

