package Taller05;
import java.io.BufferedReader;   // lectura
import java.io.IOException;      // excepcion x error
import java.io.InputStreamReader;  //
//import java.util.Scanner;
public class bufferreader {
public static void main(String[] args) throws IOException {
double F=0.0;
int anio;
System.out.print("Monto Inicial Ahorro Navidad = " );
//Scanner lee = new Scanner(System.in);
//p1 = lee.nextDouble();  //p2 = lee.nextDouble();
BufferedReader lee = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"

String p1Cadena = lee.readLine(); // leer el p1Cadena cadena
System.out.print("ingrese Tasa interes = " );
String p2Cadena = lee.readLine();
double p1 = Double.parseDouble(p1Cadena);  // conversion monto
double p2 = Double.parseDouble(p2Cadena);  // conversion interes

ahorro op = new ahorro();  // creamos el objeto
op.Titulos();
op.Asignar( p1, p2);        // pasamos parametros p1,p2
F= op.calculo_capiltal();   // con retorno
System.out.println(" ");

System.out.println(" Monto Original = " + p1);
System.out.println(" Tasa  interes  = " + p2);
System.out.println(" Capital + interes= " + F  );
}
}
