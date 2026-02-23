
import java.util.Scanner;


/*Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8números.
Depués se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén detrás. */
public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; // Creamos el arreglo de 10 elementos enteros
        int numero, posicion;

        System.out.println("Llenamos el arreglo");
        for(int i=0; i<8; i++) {
            System.out.print((i)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("\nDigite un número: ");
        numero = entrada.nextInt();
        System.out.print("\nDigite una posición: ");
        posicion = entrada.nextInt();

        // Correr una posición los elementos detrás de la posición que el usuario quiere
        for(int i=7; i>=posicion; i--) { // 1-2-3-4-5-6
            arreglo[i+1] = arreglo[i];
        }

        arreglo[posicion] = numero; // insertamos el número en la posición requerida

        System.out.println("El nuevo arreglo es: ");
        for(int i=0; i<9; i++) {
            System.out.println("Posicion "+i+": "+arreglo[i]);
        }
    }
}
