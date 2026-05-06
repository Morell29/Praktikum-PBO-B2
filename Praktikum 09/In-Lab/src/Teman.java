// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 6 Mei 2026

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    // Konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // a. Mengembalikan banyak elemen
    public int getNbelm() {
        return nbelm;
    }

    // b. Mengambil nama berdasarkan indeks
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return null;
    }

    // c. Mengubah nama pada indeks tertentu
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        }
    }

    // d. Menambah nama ke dalam list
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // e. Menghapus nama dari list (penghapusan pertama yang ditemukan)
    public boolean delNama(String nama) {
        boolean hasil = Lnama.remove(nama);
        if (hasil) {
            nbelm--;
        }
        return hasil;
    }

    // f. Mengecek apakah nama ada dalam list
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // g. Mengganti nama lama dengan nama baru (semua kemunculan)
    public void gantiNama(String nama, String namabaru) {
        Collections.replaceAll(Lnama, nama, namabaru);
    }

    // h. Menghitung banyak kemunculan nama dalam list
    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    // i. Menampilkan semua nama teman
    public void showTeman() {
        System.out.println("=== Daftar Teman (" + nbelm + " orang) ===");
        for (int i = 0; i < Lnama.size(); i++) {
            System.out.println((i + 1) + ". " + Lnama.get(i));
        }
    }
}