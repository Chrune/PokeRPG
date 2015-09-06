import java.util.Scanner;
import java.util.Random;

public class maingame {
    public static void main(String[] args) {

        endgame endObject = new endgame(4,5,6);
        startgame startObject = new startgame("Greg", endObject);
        System.out.println(startObject);
    }


    }
