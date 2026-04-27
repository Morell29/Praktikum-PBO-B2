// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 3 - Simulasi Anabul (Polimorfisme Universal Inclusion)

public class Soal3Anabul {
    public static void main(String[] args) {

        // Buat array polimorfis bertipe induk Anabul
        Anabul[] kebun = new Anabul[4];
        kebun[0] = new Kucing("Mimi");
        kebun[1] = new Anjing("Doggy");
        kebun[2] = new Burung("Pitu");
        kebun[3] = new Kucing("Snowy");

        System.out.println("=== Simulasi Bunyi dan Gerakan Anabul ===\n");
        for (Anabul a : kebun) {
            a.Bersuara();   // late binding -> metode kelas anak yang dipanggil
            a.Gerak();
            System.out.println();
        }
    }
}