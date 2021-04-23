package Tugas1;

abstract class bangundatar {
    abstract double luas();
    abstract double keliling();
    void tampilLuas(double l)
    {
        System.out.println("Luasnya Sebesar " + l);
    }
    static void staticMethod()
    {
        System.out.println("Static Method dapat dipanggil");
    }
}
