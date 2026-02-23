
import java.util.Scanner;

/*Leer dos series de 10 enteros, que estarán ordenados crecientemente. Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados */
public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];
        boolean creciente = true;

        a = new int[10]; // 10 elementos para el arreglo a
        b = new int[10]; //también para el arreglo b
        c = new int[20]; //20 elementos para arreglo c

        System.out.println("Digite el primer arreglo: ");
        do {
            
            // Pedimos el arreglo
            for(int i=0; i<10; i++) {
                System.out.print((i+1)+". Digite un número: ");
                a[i] = entrada.nextInt();
            }

            // Comprobamos si el arreglo esta ordenado
            for(int i=0; i<9; i++) {
                if(a[i]< a[i+1]) { // Creciente: 1-2-3-4..
                    creciente = true;
                }
                if(a[i] > a[i+1]) { // Decreciente: 3-2-1
                    creciente= false;
                    break;
                }
            }

            if(creciente == false) {
                System.out.println("\nEl arreglo está desordenado, vuelve a digitar: ");
            }
        } while(creciente == false);
        
        // Segundo arreglo
        System.out.println("Digite el segundo arreglo: ");
        do {
            
            // Pedimos el arreglo
            for(int i=0; i<10; i++) {
                System.out.print((i+1)+". Digite un número: ");
                b[i] = entrada.nextInt();
            }

            // Comprobamos si el arreglo esta ordenado
            for(int i=0; i<9; i++) {
                if(b[i]< b[i+1]) { // Creciente: 1-2-3-4..
                    creciente = true;
                }
                if(b[i] > b[i+1]) { // Decreciente: 3-2-1
                    creciente= false;
                    break;
                }
            }

            if(creciente == false) {
                System.out.println("\nEl arreglo está desordenado, vuelve a digitar: ");
            }
        } while(creciente == false);

        int i=0; // iterador i sera para el arreglo a 
        int j=0; // iterador i sera para el arreglo b
        int k=0; // iterador i sera para el arreglo c

        while(i<10 && j<10) {
            if(a[i] < b[j]) { // Si el elemento de a es menor de b
                c[k] = a[i]; //Copiamos el elemento de a 
                i++; // Avanzamos una posicion en a 
            }
            else {
                c[k] = b[j]; // copiamos el elemento de b
                j++; // Avanzamos una posicion en b
            }
            k++; // Avanzamos una posicion en c
        }
        // Cuando salimos de while es porque un arreglo( a o b), sea copiamos completamente  
        if(i == 10) { // Significa que ya copiamos el arreglo a, falta b
            while(j<10) { // mientras el iterador sea menor a 10
                c[k] = b[j]; // copiamos el elemento de b en c
                j++; // Avanzamos una posicion en b 
                k++; // Avanzamos una posicion en c
            }
        }
        else { // Significa que ya copiamos todo el arreglo b, falta el a
            while(i<10) {
                c[k] = a[i];
                i++;
                k++;
            }
        }
        
        System.out.println("\nEl arreglo C completo es: ");
        for(k=0; k<20; k++) {
            System.out.print(c[k]+" - ");
        }
        System.out.println("");
    }
}
