//  Nama File : Anggora.java
//  Deskripsi : Subkelas Anggora yang merupakan jenis kucing dengan implementasi metode gerak() dan bersuara() sesuai karakteristik kucing Anggora.

public class Anggora extends Kucing {
    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berjalan dengan anggun");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong lembut");
    }
}