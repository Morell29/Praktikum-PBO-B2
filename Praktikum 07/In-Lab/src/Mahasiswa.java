// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 2 - Kelas Mahasiswa (Polimorfisme Ad Hoc Overloading)

public class Mahasiswa {

    // --- Atribut ---
    private String nim;
    private String nama;
    private String programStudi;

    // -------------------------------------------------------
    // (c) Konstruktor tanpa parameter -> default values
    // -------------------------------------------------------
    public Mahasiswa() {
        this.nim          = "-999";
        this.nama         = "n/a";
        this.programStudi = "n/a";
    }

    // -------------------------------------------------------
    // (d) Konstruktor dengan tiga parameter
    // -------------------------------------------------------
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim          = nim;
        this.nama         = nama;
        this.programStudi = programStudi;
    }

    // -------------------------------------------------------
    // (e) Konstruktor salinan (copy / kloning)
    // -------------------------------------------------------
    public Mahasiswa(Mahasiswa lain) {
        this.nim          = lain.nim;
        this.nama         = lain.nama;
        this.programStudi = lain.programStudi;
    }

    // --- Getter & Setter dasar ---
    public String getNim()          { return nim; }
    public void   setNim(String nim){ this.nim = nim; }

    public String getNama()           { return nama; }
    public void   setNama(String nama){ this.nama = nama; }

    public String getProgramStudi() { return programStudi; }

    // -------------------------------------------------------
    // (a) Overloading setProgramStudi – tiga varian
    // -------------------------------------------------------

    /** Varian 1: tanpa parameter -> isi "Kosong" */
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    /** Varian 2: satu parameter String */
    public void setProgramStudi(String prodi) {
        this.programStudi = prodi;
    }

    /** Varian 3: satu parameter objek Mahasiswa lain */
    public void setProgramStudi(Mahasiswa lain) {
        this.programStudi = lain.programStudi;
    }

    // --- Tampil data ---
    public void tampilData() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Program Studi: " + programStudi);
    }
}