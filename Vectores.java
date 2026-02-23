
import java.util.Scanner;


/*Leer 5 números, guardalos en un arreglo y mostrarlos en el mismo orden introducido. */
public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];

        System.out.println("Guardando los datos del arreglo");

        for(int i=0; i<5; i++) {
            System.out.print((i+1)+". Digite un número: ");
            numeros[i] = entrada.nextFloat();
        }

        System.out.println("Los elementos del arreglo en orden inverso son: ");
        for(int i=4; i>=0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
