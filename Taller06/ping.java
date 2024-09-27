package Taller06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Librerias necesarias
import java.net.InetAddress; // libreria maneja en net Ips
import java.net.UnknownHostException; // maneja errores


public class ping {
    
    // Variables
    String dominio;


    public void Titulos(){
        System.out.println("Universidad tecnologica de panama");
	    System.out.println("Estudiante Oliver Batista 8-1028-1845");
        System.out.println("Estudiante Alexis Gonzales 8-1026-1272");
        System.out.println("Ping /busca URL dominio Web       ");
        System.out.println(" ");
    }

    public void Lector() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // lector
        System.out.println("Ingrese el dominio deseado (ej: www.google.com) ");
        dominio = br.readLine();
    }

    public void Ping(){
        try{
            InetAddress host = InetAddress.getByName(dominio);  // objeto host = dominio
            System.out.println(" Dominio URL: "+ host);            // Obtenemos el Host pc
            System.out.println("No IP: "+ host.getHostAddress()); // obtener el ip conv ips
            System.out.println("Nombre del URL : "+host.getHostName()); // Obtenemos el nombre
        }
        
        catch( UnknownHostException e) {
            System.out.println("Dominio o Host no encontrado Exception");
            System.out.println(e.toString());
        }
    }
}
