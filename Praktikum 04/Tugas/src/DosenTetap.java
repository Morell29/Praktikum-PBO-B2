import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String nidn;

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                      double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerjaTahun() * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + nidn);
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Tunjangan: " + hitungTunjangan());
    }
}