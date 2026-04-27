// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 3 - Kelas Induk Anabul (Polimorfisme Universal Inclusion)

public abstract class Anabul {

    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() { return nama; }

    /** Setiap anak mendefinisikan cara geraknya sendiri */
    public abstract void Gerak();

    /** Setiap anak mendefinisikan suaranya sendiri */
    public abstract void Bersuara();
}