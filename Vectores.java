
import java.util.Scanner;

/*Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar la posición en que se encuentra. Si 
no está, indicarlo en mensaje. */
public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], numero;
        boolean creciente = true;

        arreglo = new int[10]; // Creamos el arreglo con 10 posiciones
        do {
            // Pedimos el arreglo 
            System.out.println("Rellene el arreglo: ");
            for(int i=0; i<10; i++) {
                System.out.print(i+". Digite un número: ");
                arreglo[i] = entrada.nextInt();
            }
            // Verifica si el arreglo esta ordenado
            for(int i=0; i<9; i++) {
                if(arreglo[i] < arreglo[i+1]) { // Creciente: 1-2-3
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]) { // Decreciente: 3-2-1
                    creciente = false;
                    break;
                }
            }

            if(creciente == false) {
                System.out.println("\nEl arreglo esta desordenado, digite nuevamente: \n");
            }
        } while(creciente == false); 
    
        // Pedimos el numero a buscar 
        System.out.print("\nDigite el número a buscar en el arreglo: ");
        numero = entrada.nextInt();

        // Buscamos el numero en el arreglo
        int i=0;
        // 1-2-3-4-5...-10 
        while(i<10 && arreglo[i]<numero) {
            i++;
        }
        if(i == 10) { // Hemos recorrido todo el arreglo y no encontramos nada 
            System.out.println("\nNúmero no encontrado");
        }
        else {
            if(arreglo[i] == numero) {
                System.out.println("\nNúmero encontrado en la posición: "+i);
            }
            else {
                System.out.println("\nNúmero no encontrado");
            }
        }
    }
}
