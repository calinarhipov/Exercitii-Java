import java.util.Scanner;

//Read a text from keyboard and print 'Too short!' if its length is under 10 characters,
// 'Too long!' if its length is over 10 characters and 'That's the one!' if it has exactly 10 characters.
public class StringLength {
    public static void main(String[] args) {

        while (true) { //linia asta e ca sa faca la infinit asta sa nu se opreasca programul dupa primul input
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();

            if (text.length() < 10) {
                System.out.println("Too short!");
            } else if (text.length() > 10) {
                System.out.println("Too long!");
            } else System.out.println("That's the one!");
        }
    }
    }

