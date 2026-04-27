// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 4 - Aplikasi Seminar (Polimorfisme Universal Inclusion)

public class Soal4Seminar {
    public static void main(String[] args) {

        // -------------------------------------------------------
        // (e) Buat 2 objek Dosen dan 5 objek MahasiswaSeminar
        // -------------------------------------------------------
        Dosen d1 = new Dosen("197001011995031001", "Dr. Budi Raharjo");
        Dosen d2 = new Dosen("198505052010122002", "Dr. Siti Rahayu");

        MahasiswaSeminar m1 = new MahasiswaSeminar("23001", "Andi Pratama");
        MahasiswaSeminar m2 = new MahasiswaSeminar("23002", "Bela Safitri");
        MahasiswaSeminar m3 = new MahasiswaSeminar("23003", "Candra Wijaya");
        MahasiswaSeminar m4 = new MahasiswaSeminar("23004", "Dina Marlina");
        MahasiswaSeminar m5 = new MahasiswaSeminar("23005", "Eko Prasetyo");

        // -------------------------------------------------------
        // (f) Registrasi ketujuh peserta
        // -------------------------------------------------------
        Seminar seminar = new Seminar();
        System.out.println("=== Registrasi Peserta ===");
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        // -------------------------------------------------------
        // (c) countPeserta
        // -------------------------------------------------------
        System.out.println("\n=== (c) Jumlah Peserta ===");
        System.out.println("Total peserta : " + seminar.countPeserta());

        // -------------------------------------------------------
        // (g) tampilPeserta
        // -------------------------------------------------------
        System.out.println("\n=== (g) Daftar Peserta ===");
        seminar.tampilPeserta();

        // -------------------------------------------------------
        // (h) countMahasiswa
        // -------------------------------------------------------
        System.out.println("\n=== (h) Jumlah Peserta Mahasiswa ===");
        System.out.println("Jumlah mahasiswa: " + seminar.countMahasiswa());

        // -------------------------------------------------------
        // (i) setWali - tetapkan dosen wali untuk setiap mahasiswa
        // -------------------------------------------------------
        System.out.println("\n=== (i) Penetapan Dosen Wali ===");
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);
        System.out.println("Dosen wali berhasil ditetapkan.");

        // -------------------------------------------------------
        // (j) tampilDataMahasiswa
        // -------------------------------------------------------
        System.out.println("\n=== (j) Data Lengkap Mahasiswa ===");
        System.out.println("--- Mahasiswa 1 ---");
        m1.tampilDataMahasiswa();
        System.out.println("--- Mahasiswa 2 ---");
        m2.tampilDataMahasiswa();
        System.out.println("--- Mahasiswa 3 ---");
        m3.tampilDataMahasiswa();
        System.out.println("--- Mahasiswa 4 ---");
        m4.tampilDataMahasiswa();
        System.out.println("--- Mahasiswa 5 ---");
        m5.tampilDataMahasiswa();
    }
}