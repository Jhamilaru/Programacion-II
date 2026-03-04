import java.util.Scanner;

public class TestEstadistica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        // Se crea el objeto de la clase Estadistica
        Estadistica est = new Estadistica(numeros);

        System.out.println("El promedio es " + est.promedio());
        System.out.println("La desviacion estandar es " 
                + est.desviacion());

        sc.close();
    }
}
