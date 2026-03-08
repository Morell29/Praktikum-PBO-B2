/*
 Nama File  : Titik.java
 Deskripsi  : Class Titik dengan absis dan ordinat
 Pembuat    : Moses Morell Yosefan
 Tanggal    : 
*/

public class Titik {
    private double absis;
    private double ordinat;

    // Konstruktor
    public Titik(double a, double o) {
        absis = a;
        ordinat = o;
    }

    // Setter
    public void setAbsis(double a) {
        absis = a;
    }

    public void setOrdinat(double o) {
        ordinat = o;
    }

    // Getter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    // Method tampil
    public void tampilTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }
}