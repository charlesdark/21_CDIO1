import java.util.Random;
import java.util.Scanner;

public class Roll {
    public static int roll(String player) {
        Random rn = new Random();
        int result = rn.nextInt(6) + 1;
        int result2 = rn.nextInt(6) + 1;
        System.out.print(player + ", slå terningen");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("Du slog " + result + " og " + result2);
        return (result + result2);
    }
}
