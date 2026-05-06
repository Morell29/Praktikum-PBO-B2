// NIM    : [24060124130094]
// Nama   : [Moses Morell Yosefan]
// Tanggal: 6 Mei 2026

public class AnjingHerder extends Anjing {
    private String warnaBulu;

    public AnjingHerder(String panggilan, double bobot, String warnaBulu) {
        super(panggilan, bobot, "Herder");
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    @Override
    public String toString() {
        return "AnjingHerder [panggilan=" + panggilan + ", bobot=" + bobot
                + ", warnaBulu=" + warnaBulu + "]";
    }
}