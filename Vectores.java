
import java.util.Scanner;

/*Desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo (o clase) está compuesto por 5 alumnos.
Se pide leer notas del primero, segundo y tercer trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, y 
la media del alumno que se encuentre en la posición N (N se lee por teclado).  */
public class Vectores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float primer[], segundo[], tercer[];
        float sumaPrimer=0, sumaSegundo=0, sumaTercer=0, sumaAlumno=0;
        float promedioPrimer, promedioSegundo, promedioTercer, promedioAlumno;
        int posicion;

        primer = new float[5]; // Creamos los arreglos con los 5 elementos
        segundo = new float[5]; 
        tercer = new float[5];

        System.out.println("Digite las notas del primer trimestre: ");
        for(int i=0; i<5; i++) {
            System.out.print("Alumno ["+i+"]: ");
            primer[i] = entrada.nextFloat();

            sumaPrimer += primer[i]; // Sumamos todas las notas del primer trimestre
        }
        System.out.println("Digite las notas del segundo trimestre: ");
        for(int i=0; i<5; i++) {
            System.out.print("Alumno ["+i+"]: ");
            segundo[i] = entrada.nextFloat();

            sumaSegundo += segundo[i]; // Sumamos todas las notas del segundo trimestre
        }
        System.out.println("Digite las notas del tercer trimestre: ");
        for(int i=0; i<5; i++) {
            System.out.print("Alumno ["+i+"]: ");
            tercer[i] = entrada.nextFloat();

            sumaTercer += tercer[i]; // Sumamos todas las notas del tercer trimestre
        }
        //Sacamos el promedio de cada uno de los trimestres
        promedioPrimer = sumaPrimer/5;
        promedioSegundo = sumaSegundo/5;
        promedioTercer = sumaTercer/5;
        // Ahora pedimos la posicion del alumno N para sacar tu promedio
        do {
            System.out.println("\nDigite la posición del alumno(0-4), para sacar el promedio: ");
            posicion = entrada.nextInt();
        } while(posicion<0 || posicion>4);
        // Sacamos la suma de las notas del alumno
        sumaAlumno = primer[posicion] + segundo[posicion] + tercer[posicion];
        promedioAlumno = sumaAlumno/3;

        System.out.println("\nMostrando los datos requeridos");
        System.out.println("Promedio Primer trimestre: "+promedioPrimer);
        System.out.println("Promedio Segundo trimestre: "+promedioSegundo);
        System.out.println("Promedio Tercer trimestre: "+promedioTercer);
        System.out.println("Promedio del Alumno: "+promedioAlumno);
    }
}
