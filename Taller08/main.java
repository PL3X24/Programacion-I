package Taller08;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        tabla elemManager = new tabla();  // Crear un objeto de la clase ElemManager

        // Pedir la cantidad de elementos al usuario
        System.out.print("Ingrese la cantidad de elementos: ");
        int n = Integer.parseInt(new java.util.Scanner(System.in).nextLine());

        // Llamar al método para ingresar los elementos
        elemManager.ingresarElementos(n);

        // Imprimir todos los elementos ingresados
        elemManager.imprimirElementos();

        // Encontrar el índice del elemento con el mayor número atómico
        int maxNumAtomIdx = elemManager.indiceMaxNumAtom();

        // Encontrar el índice del elemento con el mayor peso atómico
        int maxPesoIdx = elemManager.indiceMaxPeso();

        // Imprimir los resultados de los máximos
        elemManager.imprimirResultados(maxNumAtomIdx, maxPesoIdx);
    }
}
