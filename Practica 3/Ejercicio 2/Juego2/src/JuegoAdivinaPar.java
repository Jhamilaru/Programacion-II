
public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int num) {
        if (num < 0 || num > 10) {
            return false;
        }

        if (num % 2 != 0) {
            System.out.println("Error: el número debe ser PAR");
            return false;
        }

        return true;
    }
}
