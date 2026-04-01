
public class AlgebraVectorial {

    private double ax, ay;
    private double bx, by;

    public AlgebraVectorial(){}

    public AlgebraVectorial(double ax,double ay,double bx,double by){
        this.ax=ax;
        this.ay=ay;
        this.bx=bx;
        this.by=by;
    }

    // a,b,c,d) determinar si vectores son perpendiculares
    public boolean perpendicular(){
        return (ax*bx + ay*by)==0;
    }

    // sobrecarga del metodo
    public boolean perpendicular(double ax,double ay,double bx,double by){
        return (ax*bx + ay*by)==0;
    }

    // e,f) determinar si vectores son paralelos
    public boolean paralela(){
        return (ax*by - ay*bx)==0;
    }

    // sobrecarga
    public boolean paralela(double ax,double ay,double bx,double by){
        return (ax*by - ay*bx)==0;
    }

    // g) proyeccion de a sobre b
    public double proyeccion(){

        double prod = ax*bx + ay*by;
        double mag = bx*bx + by*by;

        return prod/mag;
    }

    // h) componente de a en direccion de b
    public double componente(){

        double prod = ax*bx + ay*by;
        double mag = Math.sqrt(bx*bx + by*by);

        return prod/mag;
    }
}