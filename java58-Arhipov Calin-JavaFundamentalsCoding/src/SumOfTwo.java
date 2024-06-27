import java.util.Scanner;

//Read 2 numbers from keyboard and print their sum.
public class SumOfTwo {
    public static void main(String[] args) {
        //String text = "Salut SDA";
        //int x = 100;
        //mai jos ai exercitiu in sine de mai sus
        //int a = 20;
        //int b = 30;
        //ori cum e mai jos in comentarii ori cum e lasat codul pe linia 17 sa fie mai eficient
        //int sum = a+b;
        //System.out.println(sum);

//        System.out.println(a+b);



//        int firstNumber = keyboardReader.nextInt();
//        System.out.println(firstNumber);
        //sau cum e mai jos scris fara linia 19 si 20 ca sa salveze spatiu
        //System.out.println(keyboardReader.nextInt());

        //mai jos definim un obiect care stie sa citeasca lucruri de la tastaturA
        Scanner keyboardReader = new Scanner(System.in);
        int firstNumber = keyboardReader.nextInt();
        int secondNumber = keyboardReader.nextInt();
        System.out.println(firstNumber + secondNumber);
    }
}

