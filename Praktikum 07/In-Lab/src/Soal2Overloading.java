// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 2 - Aplikasi Overloading Mahasiswa

public class Soal2Overloading {
    public static void main(String[] args) {

        // -------------------------------------------------------
        // (c) Konstruktor tanpa parameter
        // -------------------------------------------------------
        System.out.println("=== (c) Konstruktor Default ===");
        Mahasiswa mhs0 = new Mahasiswa();
        mhs0.tampilData();

        // -------------------------------------------------------
        // (d) Konstruktor dengan tiga parameter
        // -------------------------------------------------------
        System.out.println("\n=== (d) Konstruktor Tiga Parameter ===");
        Mahasiswa mhs1 = new Mahasiswa("23001", "Budi Santoso", "Informatika");
        mhs1.tampilData();

        // -------------------------------------------------------
        // (e) Konstruktor salinan (kloning)
        // -------------------------------------------------------
        System.out.println("\n=== (e) Konstruktor Kloning ===");
        Mahasiswa mhs2 = new Mahasiswa(mhs1);
        mhs2.setNim("23002");
        mhs2.setNama("Ani Lestari");
        mhs2.tampilData();

        // -------------------------------------------------------
        // (b) Aplikasi semua varian setProgramStudi
        // -------------------------------------------------------
        System.out.println("\n=== (b) Overloading setProgramStudi ===");

        // Varian 1: tanpa parameter
        Mahasiswa m1 = new Mahasiswa("23010", "Citra Dewi", "Teknik Elektro");
        System.out.println("Sebelum setProgramStudi() :");
        m1.tampilData();
        m1.setProgramStudi();
        System.out.println("Setelah setProgramStudi() [tanpa param] :");
        m1.tampilData();

        System.out.println();

        // Varian 2: dengan parameter String
        Mahasiswa m2 = new Mahasiswa("23011", "Dani Putra", "n/a");
        m2.setProgramStudi("Sistem Informasi");
        System.out.println("Setelah setProgramStudi(String) :");
        m2.tampilData();

        System.out.println();

        // Varian 3: dengan parameter Mahasiswa lain
        Mahasiswa m3 = new Mahasiswa("23012", "Eka Saputra", "n/a");
        m3.setProgramStudi(mhs1);   // ambil prodi dari mhs1 (Informatika)
        System.out.println("Setelah setProgramStudi(Mahasiswa) [ikut mhs1] :");
        m3.tampilData();
    }
}