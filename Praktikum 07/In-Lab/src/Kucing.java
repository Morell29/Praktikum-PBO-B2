// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 3 - Kelas Kucing

public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " (Kucing) berbunyi: Meong!");
    }
}