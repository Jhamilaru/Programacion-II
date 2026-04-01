
public class MiPunto {

    // a) atributos x e y que representan las coordenadas
    private double x;
    private double y;

    // b) constructor sin argumentos
    public MiPunto() {
        x = 0;
        y = 0;
    }

    // c) constructor con coordenadas
    public MiPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // d) distancia a otro punto
    public double distancia(MiPunto p) {
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    // e) distancia usando coordenadas
    public double distancia(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}