// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 25 April 2025
// Soal 1 - Polimorfisme Ad Hoc Coersion

public class Soal1Coersion {
    public static void main(String[] args) {

        
        // (a) Ilustrasi coersion tipe dasar
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;   // int -> char
        double nilaiDouble = nilaiInt;       // int -> double (widening)

        System.out.println("=== (a) Coersion Tipe Dasar ===");
        System.out.println("Sebagai int    : " + nilaiInt);
        System.out.println("Sebagai char   : " + nilaiChar);
        System.out.println("Sebagai double : " + nilaiDouble);

        
        // (b) Nilai real dikembalikan ke integer (variabel berbeda)
        double real = 65.0;
        int kembaliInt = (int) real;          // explicit cast double -> int

        System.out.println("\n=== (b) Real -> Integer ===");
        System.out.println("Nilai real          : " + real);
        System.out.println("Kembali ke integer  : " + kembaliInt);

        
        // (c) String X="1234", Y="5678"
        //     S = konkatenasi X+Y
        //     Z = penjumlahan angka X+Y
        String X = "1234";
        String Y = "5678";

        String S = X + Y;                                  // konkatenasi
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); // penjumlahan

        System.out.println("\n=== (c) String Integer ===");
        System.out.println("X = " + X + ", Y = " + Y);
        System.out.println("S (konkatenasi) = " + S);
        System.out.println("Z (penjumlahan) = " + Z);

        
        // (d) String P="12.34", Q="56.78"
        //     R = konkatenasi P+Q
        //     D = penjumlahan angka P+Q
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;                                      // konkatenasi
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); // penjumlahan

        System.out.println("\n=== (d) String Double ===");
        System.out.println("P = " + P + ", Q = " + Q);
        System.out.println("R (konkatenasi) = " + R);
        System.out.println("D (penjumlahan) = " + D);

        
        // (e) Objek Integer A hasil konversi nilai S
        Integer A = Integer.parseInt(S);

        System.out.println("\n=== (e) String S -> Integer A ===");
        System.out.println("S = " + S);
        System.out.println("A = " + A);

        
        // (f) Objek String T hasil konversi nilai A
        String T = A.toString();

        System.out.println("\n=== (f) Integer A -> String T ===");
        System.out.println("A = " + A);
        System.out.println("T = " + T);
    }
}