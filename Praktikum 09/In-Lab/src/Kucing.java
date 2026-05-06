// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 6 Mei 2026

public class Kucing extends Anabul {
    private String ras;

    public Kucing(String panggilan, double bobot, String ras) {
        super(panggilan, bobot);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    @Override
    public String toString() {
        return "Kucing [panggilan=" + panggilan + ", bobot=" + bobot + ", ras=" + ras + "]";
    }
}