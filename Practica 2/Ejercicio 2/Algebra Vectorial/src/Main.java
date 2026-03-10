
public class Main {

    public static void main(String[] args) {

        AlgebraVectorial v = new AlgebraVectorial(2,4,1,2);

        System.out.println("Perpendicular: "+v.perpendicular());

        System.out.println("Paralela: "+v.paralela());

        System.out.println("Proyeccion: "+v.proyeccion());

        System.out.println("Componente: "+v.componente());
    }
}