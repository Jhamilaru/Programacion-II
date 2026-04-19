
public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        System.out.println("Nueva partida iniciada");
    }

    public void actualizaRecord() {
        record++;
        System.out.println("Nuevo record: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te quedan " + numeroDeVidas + " vidas");

        if (numeroDeVidas > 0) {
            return true;
        } else {
            System.out.println("Te quedaste sin vidas");
            return false;
        }
    }
}


