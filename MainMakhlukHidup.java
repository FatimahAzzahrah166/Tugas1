package Tugas2;

public class MainMakhlukHidup {
    public void cekMakhlukHidup(MakhlukHidup mHidup) {
        mHidup.berdiri();
        mHidup.oksigen();
    }

    public static void main(String[] args) {
        MainMakhlukHidup MH = new MainMakhlukHidup();
        MH.cekMakhlukHidup(new Manusia("Dua Kaki"));
        System.out.println("============================================");
        MH.cekMakhlukHidup(new Hewan("Empat Kaki", "Dua Kaki"));
        System.out.println("============================================");
        MH.cekMakhlukHidup(new Tumbuhan("Akar"));
    }
}

