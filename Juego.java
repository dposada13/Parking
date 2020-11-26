import java.util.Scanner;
public class Juego {
    public static void main(String[] args) {
        Juego.iniciarJuego();
    }

    public static void iniciarJuego() {
        System.out.println("\nBienvenido al MINI-JUEGO PAISA\n\nPresione C para continuar");
        Scanner scan = new Scanner(System.in);
        String iniciar = scan.next().toUpperCase();
        if (iniciar.equals("C")) {
            System.out.println("Para disparar presione el numero correspondiente a la posición en el tablero\n---------\n| 1 | 2 |\n---------\n| 3 | 4 |\n---------\n");
            Tablero.crearTablero();
            while (true) {
                System.out.println(Tablero.tableroJuego());
                if (Juego.finJuego()) {
                    System.out.println("FELICITACIONES¡¡¡¡ Has aniquilado a todos los bichos!\nFin del juego¡¡¡¡¡¡");
                    System.out.println("¿Queres jugar de nuevo parce? (Va:S - No aguanta:N)");
                    String opcion = scan.next().toUpperCase();
                    if (opcion.equals("S")) {
                        iniciarJuego();
                    }else {
                        System.out.println("\nSuerte Parcero!\n");
                        break;
                    }
                }
                else {
                    System.out.println("Dispara!");
                    int pos = scan.nextInt();
                    int disparo = 5;
                    switch (pos) {
                        case 1:
                        Tablero.tablero[0][0].setSalud(Tablero.tablero[0][0].getSalud() - disparo);
                        break;
                        case 2:
                        Tablero.tablero[0][1].setSalud(Tablero.tablero[0][1].getSalud() - disparo);
                        break;
                        case 3:
                        Tablero.tablero[1][0].setSalud(Tablero.tablero[1][0].getSalud() - disparo);
                        break;
                        case 4:
                        Tablero.tablero[1][1].setSalud(Tablero.tablero[1][1].getSalud() - disparo);
                        break;
                    }
                }
            }
            scan.close();
        }
        else {
            System.out.println("\nSuerte Parcero!\n");
        }
    }

    public static boolean finJuego() {
        int acumulador = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (Tablero.tablero[i][j] != null) {
                    acumulador += Tablero.tablero[i][j].getSalud();
                }
                else {
                    break;
                }
            }
        }
        if (acumulador <= 0) {
            return true;
        }
        else {
            return false;
        }
    }
}