
import java.util.Scanner;


/*Leer 5 elementos numéricos que se introduciran ordenados de forma creciente. Éstos los guardamos en una tabla de tamaño 10.
Leer un número N, e insertarlo en el lugar adecuado para que la tabla continue ordenada. */
public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero, sitio_num=0, j=0 ;

        System.out.println("Llenar el arreglo");
        do {
            //Llenando el arreglo
            for(int i=0; i<5; i++) {
                System.out.print((i+1)+". Digite un número: ");
                arreglo[i] = entrada.nextInt();
            }

            // Comprobando si el arreglo está ordenado en forma creciente
            for(int i=0; i<4; i++) {
                if(arreglo[i] < arreglo[i+1]) { // Creciente: 1-2-3
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]) { // Decreciente 3-2-1
                    creciente = false;
                    break;
                }
            }

            if(creciente == false) {
                System.out.println("\nEl arreglo no esta ordenado en forma creciente, vuelva a intentar:\n ");
            }
        } while(creciente == false);

        System.out.print("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();

        // Ver en que posicion va el número 
        while(arreglo[j]<numero && j<5) {
            sitio_num++;
            j++;
        }
        // Por último, trasladamos una posición del arreglo a los elementos que van detrás del número
        for(int i=4; i>=sitio_num; i--) {
            arreglo[i+1] = arreglo[i];
        }
        // Insertamos el número que el usuario puso
        arreglo[sitio_num] = numero;

        System.out.print("\nEl arreglo queda: ");
        for(int i=0; i<6; i++) {
            System.out.print(arreglo[i]+ " - ");
        }
        System.out.println();
    }
}
