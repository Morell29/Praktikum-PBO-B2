import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat,
                     double pendapatan, String npwp){
        super(nama, tglMulaiKerja, pendapatan);
        this.alamat = alamat;
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja(){
        int B = 3; // digit NIM
        return LocalDate.now().getYear() - tglMulaiKerja.getYear() + B;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}