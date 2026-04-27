// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 4a - Kelas Dosen

public class Dosen extends CivitasAkademika {

    private String nip;

    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }

    public String getNip() { return nip; }
    public void   setNip(String nip) { this.nip = nip; }

    /** getNomor() mengembalikan NIP untuk Dosen */
    @Override
    public String getNomor() {
        return nip;
    }
}