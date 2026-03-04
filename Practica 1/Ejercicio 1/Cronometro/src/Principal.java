import java.util.Random;

public class Principal {

    // Metodo de ordenacion por seleccion
    public static void seleccion(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMin = i;

            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMin]) {
                    indiceMin = j;
                }
            }

            int temp = arreglo[i];
            arreglo[i] = arreglo[indiceMin];
            arreglo[indiceMin] = temp;
        }
    }

    public static void main(String[] args) {

        int n = 100000;
        int[] numeros = new int[n];

        Random rand = new Random();

        // Llenar arreglo con numeros aleatorios
        for (int i = 0; i < n; i++) {
            numeros[i] = rand.nextInt(100000);
        }

        Cronometro cron = new Cronometro();

        cron.inicia();        // Iniciar medicion
        seleccion(numeros);   // Ordenar
        cron.detener();       // Detener medicion

        System.out.println("Tiempo de ejecucion (ms): "
                + cron.lapsoDeTiempo());
    }
}
