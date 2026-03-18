import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                  double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerjaTahun() * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Tendik");
        System.out.println("Bidang: " + bidang);
        System.out.println("Tunjangan: " + hitungTunjangan());
    }
}