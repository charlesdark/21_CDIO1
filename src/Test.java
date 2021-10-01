public class Test {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int sum, actual = 0;
        int[] Total = new int[14];

        for (int i = 0; i < 1000; i++) {
            dice.roll1();
            dice.roll2();
            sum = Dice.getDots1() + Dice.getDots2();
            if (Dice.getDots1() == Dice.getDots2()) {
                Total[13]++;
                Total[sum]++;
            }
            else Total[sum]++;
        }

        for (int i = 0; i < 13; i++) actual += Total[i];

        for (int i = 2; i < 13; i++)
            System.out.println(i + "    " + Total[i] + "    " + 100.0 * (double) Total[i] / actual +" %");

        System.out.println("Par: " + Total[13] + "    "+100.0 * (double) Total[13] / actual +" %" );
    }

}



