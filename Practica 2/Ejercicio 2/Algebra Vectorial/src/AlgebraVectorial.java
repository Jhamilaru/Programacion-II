
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
    public boolean perpendicular(){
        return (ax*bx + ay*by)==0;
    }
    public boolean perpendicular(double ax,double ay,double bx,double by){
        return (ax*bx + ay*by)==0;
    }
    public boolean paralela(){
        return (ax*by - ay*bx)==0;
    }
    public boolean paralela(double ax,double ay,double bx,double by){
        return (ax*by - ay*bx)==0;
    }
    public double proyeccion(){
        double prod = ax*bx + ay*by;
        double mag = bx*bx + by*by;
        return prod/mag;
    }
    public double componente(){
        double prod = ax*bx + ay*by;
        double mag = Math.sqrt(bx*bx + by*by);
        return prod/mag;
    }

}
