import java.util.Scanner;
import java.util.Random;

public class maingame {
    public static void main(String[] args) {

        for(startgame people: startgame.values())
            System.out.printf("%s\t%s\t%s\n",people,people.getDesc(), people.getYear());
    }

    }
