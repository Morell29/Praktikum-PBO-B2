import java.time.LocalDate;

public class Petani extends Manusia implements Pajak {
    private String asalKota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tglMulaiKerja, String alamat,
                  double pendapatan, String asalKota){
        super(nama, tglMulaiKerja, pendapatan);
        this.alamat = alamat;
        this.asalKota = asalKota;
        counterPetani++;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja(){
        int C = 2; // digit NIM
        return LocalDate.now().getYear() - tglMulaiKerja.getYear() + C;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
    }
}