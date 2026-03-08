public class MMahasiswa {

    public static void main(String[] args) {

        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        Dosen D1 = new Dosen("456", "Surya", "Informatika");

        Kendaraan K1 = new Kendaraan("A5617D", "Motor");

        Mahasiswa M1 = new Mahasiswa("789", "Moses", "Informatika");

        M1.setDosenWali(D1);
        M1.setKendaraan(K1);

        M1.addMatKul(PBO);
        M1.addMatKul(MBD);

        M1.printDetailMhs();

        System.out.println("\nJumlah Mata Kuliah: " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS: " + M1.getJumlahSKS());
    }
}

// javac *.java
// java MMahasiswa