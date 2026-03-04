public class EcuacionLineal {

    // a) Atributos privados a, b, c, d, e y f
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    // b) Constructor con argumentos para a, b, c, d, e y f
    public EcuacionLineal(double a, double b, double c,
                          double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // c) Metodo tieneSolucion() que devuelve true si ad - bc != 0
    public boolean tieneSolucion() {
        return (a * d - b * c) != 0;
    }

    // d) Metodo getX() que retorna la solucion para x
    public double getX() {
        double determinante = a * d - b * c;
        return (e * d - b * f) / determinante;
    }

    // d) Metodo getY() que retorna la solucion para y
    public double getY() {
        double determinante = a * d - b * c;
        return (a * f - e * c) / determinante;
    }
}
