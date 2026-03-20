public class Main {
    public static void main(String[] args){

        // inget : B1 = new BangunDatar(); ERROR
        // abstract class gabisa dibuat objek

        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);

        System.out.println(P1.getLuas());
        System.out.println(L1.getKeliling());

        System.out.println(P1.isEqualLuas(P2));
        System.out.println(L1.isEqualKeliling(L2));

        // UJI INTERFACE 
        Persegi p = new Persegi(10);
        p.zoomIn();
        System.out.println(p.getLuas());
    }
}