import java.util.Random;
import java.util.Scanner;

public class Terninger {

    public static void main(String[] args) {
        //Opretter Scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Navn på Spiller 1: ");
        String playerName1 = scan.nextLine();
        System.out.println("Navn på Spiller 2: ");
        String playerName2 = scan.nextLine();
        System.out.println("\nTryk Enter for at slå med terningen\n");

        Random rn = new Random();

        //Opretter en counter pr. spiller
        int counter1 = 0;
        int counter2 = 0;

        //Laver et while loop som breaker når én af counterne når >40
        while (counter1 < 40 & counter2 < 40) {
            int rn1 = rn.nextInt(6) + 1;
            int rn2 = rn.nextInt(6) + 1;
            int rn3 = rn.nextInt(6) + 1;
            int rn4 = rn.nextInt(6) + 1;

            counter1 += Roll.roll(playerName1, rn1, rn2);//Counter1 stiger med sidste roll
            System.out.println("Du har " +counter1 + " point!\n");

            //Hvis counter1 er over 40, skal loopen breakes inden den når spiller 2s tur
            if(counter1>40)
                break;

            counter2 += Roll.roll(playerName2, rn3, rn4);
            System.out.println("Du har " +counter2 + " point!\n");
        }
        if(counter1 > counter2) {
            System.out.println(playerName1 + " har vundet!!!");
        }
        else System.out.println(playerName2 +" har vundet!!!");
    }
}
