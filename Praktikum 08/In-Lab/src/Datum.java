//  Nama File : Datum.java
//  Deskripsi : Program untuk membuat kelas Datum yang dapat menyimpan satu elemen dengan tipe data generik, serta metode untuk mengakses dan memodifikasi elemen tersebut.

public class Datum<T> {
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}