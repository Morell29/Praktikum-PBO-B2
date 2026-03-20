import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tglMulaiKerja, String alamat,
               double pendapatan, String nip){
        super(nama, tglMulaiKerja, pendapatan);
        this.alamat = alamat;
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja(){
        int A = 4; // ganti dengan digit NIM kamu
        return LocalDate.now().getYear() - tglMulaiKerja.getYear() + A;
    }

    @Override
    public double hitungPajak(){
        return 0.1 * pendapatan;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}