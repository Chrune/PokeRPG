import java.util.Scanner;

public class mainentrance {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        startgame startObject = new startgame();

        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        startObject.setName(name);
        startObject.saying();

    }
}
