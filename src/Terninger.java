import java.util.Random;
import java.util.Scanner;

public class Terninger {

    public static int roll(int player) {
        Random rn = new Random();
        int low = 1;
        int high = 6;
        int result = rn.nextInt(high - low) + low;
        int result2 = rn.nextInt(high - low) + low;
        System.out.print("Spiller " + player + ", slå terningen");
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine();
        System.out.println("Du slog " + result + " og " + result2);
        return (result + result2);
    }

    public static void main(String[] args) {

        int counter1 = 0;
        int counter2 = 0;

        while (counter1 < 40 & counter2 < 40) {
            counter1 += roll(1);
            System.out.println("Du har " +counter1 + " point!\n");

            counter2 += roll(2);
            System.out.println("Du har " +counter2 + " point!\n");
        }
        if(counter1 > counter2) {
            System.out.println("Spiller 1 har vundet!!!");
        }
        else System.out.println("Spiller 2 har vundet!!!");
    }
}
