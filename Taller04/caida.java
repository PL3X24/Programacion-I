package Taller04;

public class caida {
    // Declarar variables para las operaciones
    int altura = 40;
    double gravedad = 9.81;
    double respuesta;

    // Salida de presentacion
    void titulos(){
        System.out.println(" Universidad tecnologica de panama");
	    System.out.println(" Estudiante Oliver Batista 8-1028-1845");
        System.out.println(" Estudiante Alexis Gonzales 8-1026-1272");
    }

    // Funcion para calculos
    void Calculos(){
        System.out.println(" La altura preseleccionada sera 40m");
	    System.out.println(" La gravedad preseccionada sera 9.81m/s2");

       respuesta = Math.sqrt(2 * altura / gravedad);
    }

    // Funcion que imprime los resultados
    void Resultado(){
        System.out.println("Altura del edificio = " + altura);
        System.out.println("Gravedad de la tiera =  " + gravedad);
        System.out.println("Tiempo de caida     =  " + respuesta);
        System.out.println(" ");
    }
}

