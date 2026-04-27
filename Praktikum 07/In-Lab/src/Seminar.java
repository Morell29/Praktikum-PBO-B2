// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 4b-h - Kelas Seminar

public class Seminar {

    private static final int KAPASITAS = 100;

    // (b) Larik statis dan atribut banyakpeserta
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    // (b) Konstruktor -> banyakpeserta diinisialisasi nol
    public Seminar() {
        pesertas      = new CivitasAkademika[KAPASITAS];
        banyakPeserta = 0;
    }

    // -------------------------------------------------------
    // (c) countPeserta - mengembalikan jumlah peserta
    // -------------------------------------------------------
    public int countPeserta() {
        return banyakPeserta;
    }

    // -------------------------------------------------------
    // (d) registrasi - menambahkan peserta secara kontigu
    // -------------------------------------------------------
    public void registrasi(CivitasAkademika ca) {
        if (banyakPeserta >= KAPASITAS) {
            System.out.println("Pendaftaran ditolak: kapasitas seminar penuh!");
            return;
        }
        pesertas[banyakPeserta] = ca;
        banyakPeserta++;
        System.out.println("Terdaftar: " + ca.getNama() + " [" + ca.getNomor() + "]");
    }

    // -------------------------------------------------------
    // (g) tampilPeserta - daftar Nomor & Nama semua peserta
    // -------------------------------------------------------
    public void tampilPeserta() {
        System.out.println("--- Daftar Peserta Seminar (" + banyakPeserta + " orang) ---");
        System.out.printf("%-5s %-15s %-30s%n", "No.", "Nomor", "Nama");
        System.out.println("-".repeat(55));
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.printf("%-5d %-15s %-30s%n",
                    i + 1,
                    pesertas[i].getNomor(),
                    pesertas[i].getNama());
        }
    }

    // -------------------------------------------------------
    // (h) countMahasiswa - hitung peserta yang instanceof MahasiswaSeminar
    // -------------------------------------------------------
    public int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof MahasiswaSeminar) {
                jumlah++;
            }
        }
        return jumlah;
    }
}