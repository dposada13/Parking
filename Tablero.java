import java.util.Random;
public class Tablero {
    public static Bicho[][] tablero = new Bicho[2][2];
    public static void crearTablero() {
        Random random = new Random();
        int numBichos = random.nextInt(5 - 1) + 1; 
        for (int i = 0; i < 2 && numBichos > 0; i++) {
            for (int j = 0; j < 2 && numBichos > 0; j++) {
                int randomTipoBicho = random.nextInt(3 - 1) + 1;
                if (randomTipoBicho == 1) {
                    tablero[i][j] = new BichoNormal();
                    numBichos--;
                }
                else {
                    tablero[i][j] = new BichoAlien();
                    numBichos--;
                }
            }
        }
    }

    public static String tableroJuego() {
        String tab = " -------------\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (Tablero.tablero[i][j] == null) {
                    tab += "| |";
                }
                else {
                    if (Tablero.tablero[i][j] instanceof BichoNormal) {
                        tab += "| BN-" + Tablero.tablero[i][j].getSalud() + " |";
                    }
                    else
                    {
                        tab += "| BA-" + Tablero.tablero[i][j].getSalud() + " |";
                    }
                }
            }
            tab += "\n ---------------- \n";
        }
        return tab;
    }
}