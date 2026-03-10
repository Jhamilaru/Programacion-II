
public class Main {

    public static void main(String[] args) {

        Vector3D a = new Vector3D(2,3,4);
        Vector3D b = new Vector3D(1,5,2);

        System.out.println("Suma:");
        a.suma(b).mostrar();

        System.out.println("Escalar:");
        a.escalar(2).mostrar();

        System.out.println("Longitud:");
        System.out.println(a.longitud());

        System.out.println("Normal:");
        a.normal().mostrar();

        System.out.println("Producto escalar:");
        System.out.println(a.productoEscalar(b));

        System.out.println("Producto vectorial:");
        a.productoVectorial(b).mostrar();
    }
}


