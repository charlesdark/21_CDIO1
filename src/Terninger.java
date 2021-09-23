import java.util.Random;
import java.util.Scanner;

public class Terninger {
        public static void main(String[] args) {
            Random rn = new Random();

            int low = 1;
            int high = 6;

            int counter1 = 0;
            int counter2 = 0;

            while(counter1 < 40 || counter2 < 40) {
                int result = rn.nextInt(high-low) + low;
                int result2 = rn.nextInt(high-low) + low;
                System.out.print("Spiller 1, slå terningen");
                Scanner sc = new Scanner(System.in);
                String roll = sc.nextLine();
                System.out.println("Du slog " + result + " og " + result2);

                counter1 += result + result2;
                System.out.println("Du har " +counter1 + " point!\n");

                int result3 = rn.nextInt(high-low) + low;
                int result4 = rn.nextInt(high-low) + low;
                System.out.print("Spiller 2, slå terningen");
                Scanner sc1 = new Scanner(System.in);
                String roll1 = sc1.nextLine();
                System.out.println("Du slog " + result3 + " og " + result4);

                counter2 += result3 + result4;
                System.out.println("Du har " +counter2 + " point!\n");
            }
            if(counter1 > counter2) {
                System.out.println("Spiller 1 har vundet!!!");
            }
            else System.out.println("Spiller 2 har vundet!!!");
        }
    }
