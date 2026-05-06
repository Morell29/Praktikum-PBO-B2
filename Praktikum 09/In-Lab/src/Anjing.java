// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 6 Mei 2026

public class Anjing extends Anabul {
    private String ras;

    public Anjing(String panggilan, double bobot, String ras) {
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
        return "Anjing [panggilan=" + panggilan + ", bobot=" + bobot + ", ras=" + ras + "]";
    }
}