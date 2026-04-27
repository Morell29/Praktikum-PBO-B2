// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 4a - Kelas CivitasAkademika

public abstract class CivitasAkademika {

    protected String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() { return nama; }
    public void   setNama(String nama) { this.nama = nama; }

    /**
     * getNomor() bersifat polimorfis:
     *   - Dosen    -> mengembalikan NIP
     *   - Mahasiswa -> mengembalikan NIM
     */
    public abstract String getNomor();

    public void tampilData() {
        System.out.println("Nomor : " + getNomor());
        System.out.println("Nama  : " + nama);
    }
}