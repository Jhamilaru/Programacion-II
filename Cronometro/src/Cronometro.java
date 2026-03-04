public class Cronometro {

    // a) Atributos privados inicia y finaliza con metodos getter
    private long inicia;
    private long finaliza;

    // b) Constructor sin argumentos que inicializa inicia con la hora actual
    public Cronometro() {
        this.inicia = System.currentTimeMillis();
    }

    // Getter de inicia
    public long getInicia() {
        return inicia;
    }

    // Getter de finaliza
    public long getFinaliza() {
        return finaliza;
    }

    // c) Metodo llamado inicia() que restablece inicia a la hora actual
    public void inicia() {
        this.inicia = System.currentTimeMillis();
    }

    // d) Metodo llamado detener() que establece finaliza a la hora actual
    public void detener() {
        this.finaliza = System.currentTimeMillis();
    }

    // e) Metodo lapsoDeTiempo() que retorna el tiempo transcurrido en milisegundos
    public long lapsoDeTiempo() {
        return finaliza - inicia;
    }
}
