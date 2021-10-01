import java.util.Scanner;

public class Fisk {
    public static void main(String[] args) {
        //Opretter Scanner class
        Scanner scan = new Scanner(System.in);
        System.out.println("Navn på Spiller 1: ");
        String playerName1 = scan.nextLine();
        System.out.println("Navn på Spiller 2: ");
        String playerName2 = scan.nextLine();


        Dice dice = new Dice();

        int counter1 = 0;
        int counter2 = 0;

        while (counter1 < 40 & counter2 < 40) {
            do {
                dice.roll1();
                dice.roll2();
                System.out.println(playerName1 + " Tryk Enter for at slå med terningen");
                scan.nextLine();
                if(Dice.getSum() == 2) {
                    counter1 = 0;}
                else counter1 += Dice.getSum();
                System.out.println(playerName1 + ", du slog " + Dice.getDots1() + " og " + Dice.getDots2() + "\n Du har " + counter1 + " point!\n");

                if(Dice.getDots1()==Dice.getDots2()){
                    System.out.println(playerName1 + " har fået en ekstra tur");
                }
            }
            while (Dice.getDots1() == Dice.getDots2());


            do {
                dice.roll1();
                dice.roll2();
                System.out.println(playerName2 + " Tryk Enter for at slå med terningen");
                scan.nextLine();
                if(Dice.getSum() == 2) {
                    counter2 = 0;}
                else counter2 += Dice.getSum();
                System.out.println(playerName2 + ", du slog " + Dice.getDots1() + " og " + Dice.getDots2() + "\n Du har " + counter2 + " point!\n");

                if(Dice.getDots1()==Dice.getDots2()) {
                    System.out.println(playerName2 + " har fået en ekstra tur");
                }

            }
            while (Dice.getDots1() == Dice.getDots2());
        }
        if (counter1 >= 40){
            System.out.println(playerName1 + " vandt!!!");
        }
        if (counter1 == counter2){
            System.out.println("Uafgjort");
        }
        else System.out.println(playerName2 + " vandt!!!");
    }
}
