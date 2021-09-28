import java.util.Random;
import java.util.Scanner;

public class Roll {

    public static int roll(String player, int rn1, int rn2) {
        System.out.print(player + ", slå terningen");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("Du slog " + rn1 + " og " + rn2);

        return rn1 + rn2;
    }
}
