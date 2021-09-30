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
            // Opretter to terninger for spiller 1.
            int rn1 = 0;
            int rn2 = 0;
            do {
                rn1 = rn.nextInt(6) + 1;
                rn2 = rn.nextInt(6) + 1;
                // Her evaluerer den om der er slået to 1'ere og sætter counter1 = 0 hvis det er true
                if(rn1 + rn2 == 2) {
                    counter1 = 0;
                }
                else counter1 += Roll.roll(playerName1, rn1, rn2);//Counter1 stiger med sidste roll
                System.out.println("Du har " +counter1 + " point!\n");

                // Evaluerer om der er blevet slået to ens
            } while (rn1 == rn2);

            //Hvis counter1 er over 40, skal loopen breakes inden den når spiller 2s tur
            if(counter1>40)
                break;

            // Opretter to terninger for spiller 2.
            int rn3 = 0;
            int rn4 = 0;
            do {
                rn3 = rn.nextInt(6) + 1;
                rn4 = rn.nextInt(6) + 1;
                // Her evaluerer den om der er slået to 1'ere og sætter counter1 = 0 hvis det er true
                if(rn3 + rn4 == 2){
                    counter2 = 0;
                }
                else counter2 += Roll.roll(playerName2, rn3, rn4);
                System.out.println("Du har " +counter2 + " point!\n");
                // Evaluerer om der er blevet slået to ens
            } while (rn3 == rn4);

        }
        if(counter1 > counter2) {
            System.out.println(playerName1 + " har vundet!!!");
        }
        else System.out.println(playerName2 +" har vundet!!!");
    }
}
