
import java.util.Scanner;

/*Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares. */
public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //Creamos el arreglo para 10 elementos enteros
        int conteo_pares=0, conteo_impares=0;

        System.out.println("Llenar el arreglo: ");
        for(int i=0; i<10; i++) {
            System.out.print((i+1)+". Digite un número: ");
            arreglo[i] = entrada.nextInt();

            if(arreglo[i] %2==0) { // Si el número es par 
                conteo_pares++;
            } else { // Si el número es impar 
                conteo_impares++;
            }
        }

        // Crear los arreglos
        int par[] = new int[conteo_pares]; // Creamos el arreglo para almacenar los números pares
        int impar[] = new int[conteo_impares];// y ahora los números impares 

        conteo_pares=0;
        conteo_impares=0;

        // Almacenamos los números pares en su arreglo y los impares también
        for(int i=0; i<10; i++) {
            if(arreglo[i] %2 == 0) { // Si el número es par
                par[conteo_pares] = arreglo[i];
                conteo_pares++;
            } else { // Si el número es impar
                impar[conteo_impares] = arreglo[i];
                conteo_impares++;
            }
        }

        System.out.println("\nArreglo pares: ");
        for(int i=0; i<conteo_pares; i++) {
            System.out.print(par[i]+" - ");
        }
        System.out.println("");

        System.out.println("\nArreglo impares: ");
        for(int i=0; i<conteo_impares; i++) {
            System.out.print(impar[i]+" - ");
        }
        System.out.println("");

    }
}
