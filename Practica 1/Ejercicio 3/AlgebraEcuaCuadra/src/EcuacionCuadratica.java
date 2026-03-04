public class EcuacionCuadratica {

    // a) Atributos privados a, b y c
    private double a;
    private double b;
    private double c;

    // b) Constructor con argumentos para a, b y c
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // c) Metodo getDiscriminante() que devuelve b^2 - 4ac
    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    // d) Metodo getRaiz1() que retorna la primera raiz
    // r1 = (-b + sqrt(b^2 - 4ac)) / (2a)
    // Si el discriminante es negativo, devuelve 0
    public double getRaiz1() {
        double discriminante = getDiscriminante();

        if (discriminante >= 0) {
            return (-b + Math.sqrt(discriminante)) / (2 * a);
        }

        return 0;
    }

    // d) Metodo getRaiz2() que retorna la segunda raiz
    // r2 = (-b - sqrt(b^2 - 4ac)) / (2a)
    // Si el discriminante es negativo, devuelve 0
    public double getRaiz2() {
        double discriminante = getDiscriminante();

        if (discriminante >= 0) {
            return (-b - Math.sqrt(discriminante)) / (2 * a);
        }

        return 0;
    }
}
