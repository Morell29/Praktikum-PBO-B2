import java.util.HashMap;
import java.util.Map;

public class LambdaMap {

    public static void main(String[] args) {

        Map<String, String> mahasiswa = new HashMap<>();

        mahasiswa.put("24060124130094", "Moses Morell Yosefan");
        mahasiswa.put("24060124130001", "Bahlil");
        mahasiswa.put("24060124130002", "Keripik Tempe");
        mahasiswa.put("24060124130003", "Ganen");

        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println();
        });
    }
}