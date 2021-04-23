package Tugas2;

public class Tumbuhan extends MakhlukHidup {
    private final String Akar;

    public Tumbuhan(String Akar) {
        this.Akar = Akar;
    }

    @Override
    public void berdiri() {
        System.out.println("Tumbuhan berdiri dengan " + Akar);
    }
}