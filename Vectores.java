
import java.util.Scanner;


/*Leer 5 números, guardalos en un arreglo y mostrarlos en el mismo orden introducido. */
public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Puedes poner los corchetes antes y después de variable
        float[] numeros = new float[5];

            System.out.println("Guardando los datos en el arreglo");
            for(int i=0; i<5; i++) {
                System.out.print((i+1)+". Digite un número: ");
                numeros[i] = entrada.nextFloat();
            }

            System.out.println("\nImprimir los elementos del arreglo");
            for(float i:numeros){
                System.out.println(i);
            }
    }
}
