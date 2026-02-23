
import java.util.Scanner;

/*Leer por teclado una tabla de 10 elementos númericos enteros y una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos. */
public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int posicion;

        System.out.println("Llenar el arreglo");
        for(int i=0; i<10; i++) {
            System.out.print(i+". Digite un número: ");
            arreglo[i] = entrada.nextInt(); 
        }
        // Pedimos la posicion en el rango de 0-9
        do {
            System.out.print("Digite una posicion 0-9: ");
            posicion = entrada.nextInt();
        } while(posicion<0 || posicion>9);

        // Eliminando el elemento de la posicion indicada 
        for(int i=posicion; i<9; i++) {
            arreglo[i] = arreglo[i+1];
        }
        
        System.out.println("\nEl arreglo queda: ");
        for(int i=0; i<9; i++) {
            System.out.println(i+". Elemento: "+arreglo[i]);
        }
    }
}
