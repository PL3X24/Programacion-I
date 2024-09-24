package Taller05;
public class ahorro {
    private double monto;
    private double interesF;  // interes ganado
    private double interes;
    
    public void Asignar(double montoP1, double interesP2) {
    monto= montoP1;
    interes= interesP2;
    }
    public void Titulos() {
    System.out.println(" Universidad Tecnologica de Panama");
    System.out.println(" Oliver Batista 8-1028-1845 - Alexis Gonzales  8-1026-1272");
    System.out.println(" Grupo 1S3111");
    System.out.println(" Uso:constructor ahorro, Buffer Reader");
    System.out.println(" ");}
    
    public double calculo_capiltal()  {
    interesF=monto*(interes/100.0);
    monto= interesF + monto;
    return (monto); }  // con retorno
    }