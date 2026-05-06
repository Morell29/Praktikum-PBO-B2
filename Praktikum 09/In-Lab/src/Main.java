// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 6 Mei 2026

public class Main {
    public static void main(String[] args) {
        Piaraan piaraan = new Piaraan();
 
        piaraan.enqueueAnabul(new Kucing("Mpruy", 3.5, "Liar"));
        piaraan.enqueueAnabul(new Anjing("Bobon", 12.0, "Stroberi"));
        piaraan.enqueueAnabul(new KucingPersia("Furab", 4.2, "Putih"));
        piaraan.enqueueAnabul(new AnjingHerder("Timi", 28.0, "Coklat"));
        piaraan.enqueueAnabul(new KucingPersia("Uus", 3.8, "HITAM"));
        piaraan.showJenisAnabul();
 
        System.out.println("\nTotal Anabul  : " + piaraan.getNbelm());

        int jmlkcg = piaraan.countKucing();
        System.out.println("Total Kucing : " + jmlkcg);
    }
}