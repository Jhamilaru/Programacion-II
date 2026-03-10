
public class Main {

    public static void main(String[] args) {

        // crear punto (0,0)
        MiPunto p1 = new MiPunto();

        // crear punto (10,30.5)
        MiPunto p2 = new MiPunto(10,30.5);

        // mostrar puntos
        System.out.println("Punto 1: ("+p1.getX()+","+p1.getY()+")");
        System.out.println("Punto 2: ("+p2.getX()+","+p2.getY()+")");

        // calcular distancia
        double d = p1.distancia(p2);

        // mostrar resultado
        System.out.println("Distancia entre puntos: "+d);
    }
}