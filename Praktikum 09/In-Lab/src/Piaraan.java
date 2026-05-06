// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 6 Mei 2026

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    // Konstruktor
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.offer(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul anabul = Lanabul.poll();
        if (anabul != null) {
            nbelm--;
        }
        return anabul;
    }

    public void showAnabul() {
        System.out.println("=== Antrean Anabul (" + nbelm + " hewan) ===");
        int i = 1;
        for (Anabul a : Lanabul) {
            System.out.println(i + ". " + a.getNama());
            i++;
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul){
            if (a instanceof Kucing){
                count++;
            }
        }
        return count;
    }


    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += a.getBobot();
            }
        }
        return totalBobot;
    }

    public void showJenisAnabul() {
        System.out.println("Jenis Anabul");
        int i = 1;
        for (Anabul a : Lanabul) {
            System.out.println(i + ". " + a.getNama()
                    + " : " + a.getClass().getName());
            i++;
        }
    }
}