// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 6 Mei 2026

public abstract class Anabul {
    protected String panggilan;
    protected double bobot;

    public Anabul(String panggilan, double bobot) {
        this.panggilan = panggilan;
        this.bobot = bobot;
    }

    public String getNama() {
        return panggilan;
    }

    public void setNama(String nama) {
        this.panggilan = nama;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [panggilan=" + panggilan + ", bobot=" + bobot + "]";
    }
}