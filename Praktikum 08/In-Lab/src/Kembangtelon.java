//  Nama File : Kembangtelon.java
//  Deskripsi : Subkelas Kembangtelon yang merupakan jenis kucing dengan implementasi metode gerak() dan bersuara() sesuai karakteristik kucing Kembangtelon.

public class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berjalan santai");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong keras");
    }
}