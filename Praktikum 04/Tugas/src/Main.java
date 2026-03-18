import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dt = new DosenTetap(
                "123", "Andi",
                LocalDate.of(1990,5,5),
                LocalDate.of(2015,1,1),
                5000000,
                "FSM",
                "456"
        );

        dt.printInfo();
    }
}