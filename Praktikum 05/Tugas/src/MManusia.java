import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {

        PNS p1 = new PNS("Satriyo", LocalDate.of(2006,4,1),
                "Jl. Seroja",15000000,"198302032006041002");

        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000,1,1),
                "Jl. Air",55000000,"000-556-773");

        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977,1,9),
                "Jl. Bunga",5000000,"Wonogiri");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("Pajak PNS = " + p1.hitungPajak());
        System.out.println("Masa Kerja = " + p1.hitungMasaKerja());

        System.out.println("Pajak Pengusaha = " + pe1.hitungPajak());
        System.out.println("Pajak Petani = " + pt1.hitungPajak());

        System.out.println("Masa Kerja Pengusaha = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja Petani = " + pt1.hitungMasaKerja());

        pe1.cetakInfo();
        pt1.cetakInfo();
        p1.cetakInfo();
    }
}