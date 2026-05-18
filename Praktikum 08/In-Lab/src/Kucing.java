//  Nama File : Kucing.java
//  Deskripsi : Subkelas Kucing yang merupakan jenis Anabul dengan atribut tambahan bobot, serta implementasi metode gerak() dan bersuara() sesuai karakteristik kucing.

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berjalan dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama + ", Bobot: " + bobot + " kg");
    }
}