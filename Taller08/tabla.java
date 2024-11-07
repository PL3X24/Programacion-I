package Taller08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Elem {
    String nom;    // Nombre del elemento
    String simb;   // Símbolo del elemento
    double peso;   // Peso atómico
    int numAtom;   // Número atómico

    // Constructor para inicializar los atributos del elemento
    public Elem(String nom, String simb, double peso, int numAtom) {
        this.nom = nom;
        this.simb = simb;
        this.peso = peso;
        this.numAtom = numAtom;
    }
}

public class tabla {
    private Elem[] elems; // Arreglo de elementos

    // Método para ingresar los elementos
    public void ingresarElementos(int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        elems = new Elem[n];  // Inicializar el arreglo de elementos

        // Leer los datos de cada elemento
        for (int i = 0; i < n; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            System.out.print("Nombre del elemento: ");
            String nom = reader.readLine();

            System.out.print("Símbolo del elemento: ");
            String simb = reader.readLine();

            System.out.print("Peso atómico: ");
            double peso = Double.parseDouble(reader.readLine());

            System.out.print("Número atómico: ");
            int numAtom = Integer.parseInt(reader.readLine());

            elems[i] = new Elem(nom, simb, peso, numAtom);  // Guardar el elemento en el arreglo
        }
    }

    // Método para imprimir todos los elementos
    public void imprimirElementos() {
        System.out.println("\nDatos de los elementos:");
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Elemento " + (i + 1) + ": " +
                "Nombre: " + elems[i].nom + 
                ", Símbolo: " + elems[i].simb +
                ", Peso Atómico: " + elems[i].peso +
                ", Número Atómico: " + elems[i].numAtom);
        }
    }

    // Método para encontrar el elemento con el mayor número atómico
    public int indiceMaxNumAtom() {
        int maxNumAtomIdx = 0;
        for (int i = 1; i < elems.length; i++) {
            if (elems[i].numAtom > elems[maxNumAtomIdx].numAtom) {
                maxNumAtomIdx = i;
            }
        }
        return maxNumAtomIdx;
    }

    // Método para encontrar el elemento con el mayor peso atómico
    public int indiceMaxPeso() {
        int maxPesoIdx = 0;
        for (int i = 1; i < elems.length; i++) {
            if (elems[i].peso > elems[maxPesoIdx].peso) {
                maxPesoIdx = i;
            }
        }
        return maxPesoIdx;
    }

    // Método para imprimir los resultados de los máximos
    public void imprimirResultados(int maxNumAtomIdx, int maxPesoIdx) {
        System.out.println("\nElemento con el mayor número atómico: " + elems[maxNumAtomIdx].nom +
            " (Posición: " + (maxNumAtomIdx + 1) + ")");
        System.out.println("Elemento con el mayor peso atómico: " + elems[maxPesoIdx].nom +
            " (Posición: " + (maxPesoIdx + 1) + ")");
    }
}
