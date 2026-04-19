
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
        System.out.println("Record: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te quedan " + numeroDeVidas + " vidas");

        if (numeroDeVidas > 0) {
            return true;
        } else {
            System.out.println("Perdiste el juego");
            return false;
        }
    }
}

