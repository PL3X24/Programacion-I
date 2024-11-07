package Taller10;

import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer tamaño de las matrices
        System.out.print("Ingrese el tamaño de la matriz (n x n): ");
        int n = scanner.nextInt();

        // Inicializar las matrices
        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];

        // Leer e imprimir la matriz A
        System.out.println("Ingrese los elementos de la matriz A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);

        // Leer e imprimir la matriz B
        System.out.println("Ingrese los elementos de la matriz B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz B:");
        imprimirMatriz(matrizB);

        // Calcular e imprimir las sumas y restas solicitadas
        System.out.println("Suma total de los elementos de la matriz A: " + sumaTotal(matrizA));
        System.out.println("Suma total de los elementos de la matriz B: " + sumaTotal(matrizB));
        System.out.println("Suma de las matrices A y B:");
        imprimirMatriz(sumaMatrices(matrizA, matrizB));
        System.out.println("Resta de las matrices A y B:");
        imprimirMatriz(restaMatrices(matrizA, matrizB));
        System.out.println("Suma de la diagonal de la matriz A: " + sumaDiagonal(matrizA));
        System.out.println("Suma de la diagonal de la matriz B: " + sumaDiagonal(matrizB));
        System.out.println("Valor máximo de la matriz A: " + valorMaximo(matrizA));
        System.out.println("Valor máximo de la matriz B: " + valorMaximo(matrizB));
        System.out.println("Valor mínimo de la matriz A: " + valorMinimo(matrizA));
        System.out.println("Valor mínimo de la matriz B: " + valorMinimo(matrizB));

        scanner.close();
    }

    // Función para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    // Función para calcular la suma total de los elementos de una matriz
    public static int sumaTotal(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }
        return suma;
    }

    // Función para sumar dos matrices
    public static int[][] sumaMatrices(int[][] matrizA, int[][] matrizB) {
        int n = matrizA.length;
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    // Función para restar dos matrices
    public static int[][] restaMatrices(int[][] matrizA, int[][] matrizB) {
        int n = matrizA.length;
        int[][] resultado = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        return resultado;
    }

    // Función para calcular la suma de la diagonal de una matriz
    public static int sumaDiagonal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    // Función para encontrar el valor máximo en una matriz
    public static int valorMaximo(int[][] matriz) {
        int max = matriz[0][0];
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento > max) {
                    max = elemento;
                }
            }
        }
        return max;
    }

    // Función para encontrar el valor mínimo en una matriz
    public static int valorMinimo(int[][] matriz) {
        int min = matriz[0][0];
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento < min) {
                    min = elemento;
                }
            }
        }
        return min;
    }
}
