import java.util.Scanner;

public class EstadisticaModular {

    // Metodo promedio() que obtiene el promedio de los valores
    public static double promedio(double[] datos) {
        double suma = 0;

        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }

        return suma / datos.length;
    }

    // Metodo desviacion() que devuelve la desviacion estandar
    // Formula: sqrt( Σ(xi - promedio)^2 / (n - 1) )
    public static double desviacion(double[] datos) {
        double prom = promedio(datos);
        double suma = 0;

        for (int i = 0; i < datos.length; i++) {
            suma += Math.pow(datos[i] - prom, 2);
        }

        return Math.sqrt(suma / (datos.length - 1));
    }

    // Metodo principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        System.out.println("El promedio es " + promedio(numeros));
        System.out.println("La desviacion estandar es " 
                + desviacion(numeros));

        sc.close();
    }
}

