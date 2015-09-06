import java.util.Scanner;
import java.util.Random;

public class mainentrance {
    public static void main(String[] args) {

        startgame startObject = new startgame();
        startgame startObject1 = new startgame(5);
        startgame startObject2 = new startgame(5, 13);
        startgame startObject3 = new startgame(5, 13, 43);
        System.out.printf("%s\n", startObject.toMilitary());
        System.out.printf("%s\n", startObject1.toMilitary());
        System.out.printf("%s\n", startObject2.toMilitary());
        System.out.printf("%s\n", startObject3.toMilitary());


    }


    }
