import java.util.Random;
import java.util.Scanner;

public class Terninger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Navn på Spiller 1: ");
        String playerName1 = scan.nextLine();
        System.out.println("Navn på Spiller 2: ");
        String playerName2 = scan.nextLine();

        int counter1 = 0;
        int counter2 = 0;

        while (counter1 < 40 & counter2 < 40) {
            counter1 += Roll.roll(playerName1);
            System.out.println("Du har " +counter1 + " point!\n");

            if(counter1>40)
                break;

            counter2 += Roll.roll(playerName2);
            System.out.println("Du har " +counter2 + " point!\n");
        }
        if(counter1 > counter2) {
            System.out.println(playerName1 + " har vundet!!!");
        }
        else System.out.println(playerName2 +" har vundet!!!");
    }
}
