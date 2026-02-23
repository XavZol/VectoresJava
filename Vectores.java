
import java.util.Scanner;


/*Diseñar una aplicación que declare una tabla de 10 elementos enteros y la desplace N posiciones en un arreglo. */
public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //Creamos 10 elementos enteros 
        int nPosicion, ultimo;

        System.out.println("Llenar el arreglo: ");
        for(int i=0; i<10; i++) {
            System.out.print(i+ ". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("\nDigite la cantidad de posiciones a desplazar: ");
        nPosicion = entrada.nextInt();

        for(int vuelta=1; vuelta<=nPosicion; vuelta++) {

            ultimo = arreglo[9]; // Guardamos el ultimo elemento del arreglo 
            
            for(int i=8; i>=0; i--) { // Desplazando una posicion en el arreglo
                arreglo[i+1] = arreglo[i];
            }

            arreglo[0] = ultimo; // ponemos el último elemento como el primero.
        }

        System.out.println("\nEl arreglo resultante es: ");
        for(int i=0; i<10; i++) {
            System.out.println(i+". Elemento: "+arreglo[i]);
        }
    }
}
