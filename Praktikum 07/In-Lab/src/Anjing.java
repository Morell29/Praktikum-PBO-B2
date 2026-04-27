// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 3 - Kelas Anjing

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " (Anjing) bergerak dengan melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " (Anjing) berbunyi: Guk-guk!");
    }
}