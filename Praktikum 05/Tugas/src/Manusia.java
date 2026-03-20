import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, LocalDate tglMulaiKerja, double pendapatan){
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public abstract int hitungMasaKerja();

    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}