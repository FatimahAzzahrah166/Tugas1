package Tugas2;

public class Manusia extends MakhlukHidup {
    private final String DuaKaki;

    public Manusia(String DuaKaki) {
        this.DuaKaki = DuaKaki;
    }

    @Override
    public void berdiri() {
        System.out.println("Manusia berdiri dengan " + DuaKaki);
    }
}
