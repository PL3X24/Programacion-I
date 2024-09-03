import java.util.Scanner;
public class obj {
    //Metodos que preguntaran y calcularan
    
    private float x1;
    private float x2;
    private float resultado;

    public obj() {
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
        private void Procedimiento ( int A, int B, int C){
        
        //discriminante
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

