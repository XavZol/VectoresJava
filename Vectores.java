
import java.util.Scanner;


/*Leer los datos correspondiente a dos tablas de 12 elementos númericos, y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la 
B, otros 3 de A, otros 3 de la B, etc. */
public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        int i, j;

        a = new int[12]; //Arreglo a[] va a tener 12 elementos
        b = new int[12];
        c = new int[24]; // Arreglo c[] va almacenar a arreglo a[] y arreglo b[]

        //Pedimos el arreglo a[]
        System.out.println("Digite el primer arreglo");
        for( i=0; i<12; i++) {
            System.out.print((i+1)+". Digite un número: ");
            a[i] = entrada.nextInt();
        }
        
        //Pedimos el arreglo b[]
        System.out.println("Digite el segundo arreglo");
        for( i=0; i<12; i++) {
            System.out.print((i+1)+". Digite un número: ");
            b[i] = entrada.nextInt();
        }
        // Mezclar los dos arreglos a[] y b[]
        // El iterador i sera para los arreglos a[] y b[] y el j para el arreglo c[]
        i=0;
        j=0;

        while(i<12) {
            // Copiar los 3 elementos de a[]
            for(int k=0; k<3; k++) {
                c[j] = a[i+k];
                j++;
            }
            //Ahora copiamos los 3 elementos de b[]
            for(int k=0;k<3;k++) {
                c[j] = b[i+k];
                j++;
            }

            i+=3;
        }

        System.out.print("El arreglo resultante es: ");
        for(i=0; i<24; i++) {
            System.out.print(c[i]+" - ");
        }
        System.out.println();
    }
}
