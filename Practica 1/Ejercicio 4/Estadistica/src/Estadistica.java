public class Estadistica {

    // Atributo privado que almacena los datos
    private double[] datos;

    // Constructor que recibe el arreglo de datos
    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    // Metodo promedio()
    public double promedio() {
        double suma = 0;

        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }

        return suma / datos.length;
    }

    // Metodo desviacion()
    public double desviacion() {
        double prom = promedio();
        double suma = 0;

        for (int i = 0; i < datos.length; i++) {
            suma += Math.pow(datos[i] - prom, 2);
        }

        return Math.sqrt(suma / (datos.length - 1));
    }
}
