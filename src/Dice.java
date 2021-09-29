import java.util.Random;

class Dice{

    static int dots,roll1,roll2,rollSet;
    Random rn = new Random();

    public void roll1(){
        roll1 = rn.nextInt(6)+1;
    }
    public void roll2(){
        roll2 = rn.nextInt(6)+1;
    }

    public static int getDots1(){
        return roll1;
    }

    public static int getDots2(){
        return roll2;
    }
    public static int getSet(){
        if (roll1 == roll2){
            rollSet++;
        }
        return rollSet;
    }
}
