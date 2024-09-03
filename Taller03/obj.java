import java.util.Scanner;
public class obj {
    //Declaracion de variables
    
    public float A;
    public float B;
    public float C;
    public float resultado;
    public float x1;
    public float x2;
    //Metodo de entrada
    
        public void titulos(){
        // Salida de presentacion
        System.out.println(" Universidad tecnologica de panama  ");
	    System.out.println(" Estudiante Oliver Batista 8-1028-1845 ");
        System.out.println(" Estudiante Alexis Gonzales 8-1026-1272 ");
        }
        //Entrada del usuario
        public void pedirvalores(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese A");
        A = scanner.nextFloat();
        System.out.println("Ingrese B");
        B = scanner.nextFloat();
        System.out.println("Ingrese C");
        C = scanner.nextFloat();
        }
    
        //Metodo que resuelve la operacion
        public void Procedimiento (){
        
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
    public void respuesta(){
        if (resultado < 0){
            System.out.println("No se puede ejecutar el programa saliendo....");
        }
        else if (resultado > 0){
            System.out.println("La raíz x1 es: " + x1);
            System.out.println("La raíz x2 es: " + x2);
    }
}
}

