public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi(4, "Merah", "Hitam");
        Lingkaran l = new Lingkaran(7, "Biru", "Putih");

        System.out.println("=== Persegi ===");
        p.printInfo();
        System.out.println("Luas: " + p.getLuas());
        System.out.println("Keliling: " + p.getKeliling());

        System.out.println("\n=== Lingkaran ===");
        l.printInfo();
        System.out.println("Luas: " + l.getLuas());
        System.out.println("Keliling: " + l.getKeliling());
    }
}

// Open src terminal
// javac *.java
// java Main