// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 4a - Kelas MahasiswaSeminar (turunan CivitasAkademika)

public class MahasiswaSeminar extends CivitasAkademika {

    private String nim;
    private Dosen  dosenWali;

    public MahasiswaSeminar(String nim, String nama) {
        super(nama);
        this.nim       = nim;
        this.dosenWali = null;
    }

    public String getNim() { return nim; }
    public void   setNim(String nim) { this.nim = nim; }

    public Dosen getDosenWali() { return dosenWali; }

    /** getNomor() mengembalikan NIM untuk MahasiswaSeminar */
    @Override
    public String getNomor() {
        return nim;
    }

    // -------------------------------------------------------
    // (i) setWali - mengubah dosen wali
    // -------------------------------------------------------
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }

    // -------------------------------------------------------
    // (j) tampilDataMahasiswa - NIM, Nama, Nama Dosenwali
    // -------------------------------------------------------
    public void tampilDataMahasiswa() {
        System.out.println("NIM          : " + nim);
        System.out.println("Nama Mhs     : " + nama);
        if (dosenWali != null) {
            System.out.println("Dosen Wali   : " + dosenWali.getNama());
        } else {
            System.out.println("Dosen Wali   : (belum ditetapkan)");
        }
    }
}