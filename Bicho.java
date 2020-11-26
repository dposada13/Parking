public class Bicho {
    private int salud;

    public Bicho(int salud) {
        this.salud = salud;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        if (this.salud > 0) {
            this.salud = salud;
        }
    }
}
