
import java.util.Scanner;


/*Diseñar una aplicación que declare una tabla de 10 elementos enteros y la desplace una posición hacia abajo: el primero pasa a ser el segundo, el segundo pasa 
a ser el tercero y así sucesivamente. EL último pasa a ser el primero. */
public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;
        System.out.println("Llenar el arreglo");
        for(int i=0; i<10; i++) {
            System.out.print(i+". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }

        ultimo = arreglo[9]; //Guardamos el ultimo elemento

        for(int i=8; i>=0; i--) { // Avanzar una posicion abajo en el arreglo 
            arreglo[i+1] = arreglo[i];
        }

        arreglo[0] = ultimo; // Ponemos el ultimo elemento como el primero 

        System.out.println("\nEl nuevo arreglo es: ");
        for(int i=0; i<10; i++){
            System.out.println(i+". Número: "+arreglo[i]);
        }
    }
}
