// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 3 - Kelas Burung

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " (Burung) bergerak dengan terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " (Burung) berbunyi: Cuit-cuit!");
    }
}