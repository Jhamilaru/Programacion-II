
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    public void juega() {
        Scanner sc = new Scanner(System.in);

        reiniciaPartida();

        numeroAAdivinar = (int)(Math.random() * 11); // 0 a 10

        System.out.println("Adivina un número entre 0 y 10");

        boolean continuar = true;

        while (continuar) {
            int intento = sc.nextInt();

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
                    System.out.println("Intenta de nuevo:");
                }
            }
        }
    }
}