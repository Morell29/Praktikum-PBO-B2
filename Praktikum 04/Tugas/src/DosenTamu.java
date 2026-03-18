import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String nidk;

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                     double gajiPokok, String fakultas, String nidk) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + nidk);
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Tunjangan: " + hitungTunjangan());
    }
}