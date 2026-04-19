
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    public boolean validaNumero(int num) {
        return num >= 0 && num <= 10;
    }

    public void juega() {
        Scanner sc = new Scanner(System.in);

        reiniciaPartida();
        numeroAAdivinar = (int)(Math.random() * 11);

        System.out.println("Adivina un número entre 0 y 10");

        boolean continuar = true;

        while (continuar) {
            int intento = sc.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número inválido, intenta de nuevo");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡¡Acertaste!!");
                actualizaRecord();
                break;
            } else {
                continuar = quitaVida();

                if (continuar) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número es MAYOR");
                    } else {
                        System.out.println("El número es MENOR");
                    }
                }
            }
        }
    }
}
