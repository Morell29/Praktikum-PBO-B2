// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 6 Mei 2026

public class KucingPersia extends Kucing {
    private String warnaRambut;

    public KucingPersia(String panggilan, double bobot, String warnaRambut) {
        super(panggilan, bobot, "Persia");
        this.warnaRambut = warnaRambut;
    }

    public String getWarnaRambut() {
        return warnaRambut;
    }

    public void setWarnaRambut(String warnaRambut) {
        this.warnaRambut = warnaRambut;
    }

    @Override
    public String toString() {
        return "KucingPersia [panggilan=" + panggilan + ", bobot=" + bobot
                + ", warnaRambut=" + warnaRambut + "]";
    }
}