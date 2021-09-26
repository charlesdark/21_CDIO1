import java.util.Random;
import java.util.Scanner;

public class Roll {
    public static int roll(String player) {
        Random rn = new Random();
        int low = 1;
        int high = 6;
        int result = rn.nextInt(high - low) + low;
        int result2 = rn.nextInt(high - low) + low;
        System.out.print(player + ", slå terningen");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("Du slog " + result + " og " + result2);
        return (result + result2);
    }
}
