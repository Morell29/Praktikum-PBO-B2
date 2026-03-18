/*
 Nama           : Pegawai
 Deskripsi      : Superclass yang merepresentasikan data dasar pegawai
                  meliputi NIP, nama, tanggal lahir, TMT, dan gaji pokok
 Pembuat        : Moses Morell Yosefan (24060124130094)
 Tanggal        : 14 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public int hitungMasaKerjaTahun() {
        return Period.between(tmt, LocalDate.now()).getYears();
    }

    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("TMT: " + tmt);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}