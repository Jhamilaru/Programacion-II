
public class Vector3D {

    private double a1,a2,a3;

    public Vector3D(){}

    public Vector3D(double a1,double a2,double a3){
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
    }

    // a) suma de vectores
    public Vector3D suma(Vector3D b){
        return new Vector3D(
        a1+b.a1,
        a2+b.a2,
        a3+b.a3);
    }

    // b) multiplicacion por escalar
    public Vector3D escalar(double r){
        return new Vector3D(
        r*a1,
        r*a2,
        r*a3);
    }

    // c) longitud
    public double longitud(){
        return Math.sqrt(a1*a1 + a2*a2 + a3*a3);
    }

    // d) vector normal
    public Vector3D normal(){

        double m = longitud();

        return new Vector3D(
        a1/m,
        a2/m,
        a3/m);
    }

    // e) producto escalar
    public double productoEscalar(Vector3D b){
        return a1*b.a1 + a2*b.a2 + a3*b.a3;
    }

    // f) producto vectorial
    public Vector3D productoVectorial(Vector3D b){

        double x = a2*b.a3 - a3*b.a2;
        double y = a3*b.a1 - a1*b.a3;
        double z = a1*b.a2 - a2*b.a1;

        return new Vector3D(x,y,z);
    }

    public void mostrar(){
        System.out.println("("+a1+","+a2+","+a3+")");
    }
}