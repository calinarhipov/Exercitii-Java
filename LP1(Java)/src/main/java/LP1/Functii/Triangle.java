package LP1.Functii;

//2.2  Creează o funcție care să calculeze aria
//     unui triunghi pe baza datelor introduse de la tastatură.

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti lungimea laturei a: ");
        double a = sc.nextDouble();
        System.out.println("Introduceti lungimea laturei b: ");
        double b = sc.nextDouble();
        System.out.println("Introduceti lungimea laturei c: ");
        double c = sc.nextDouble();

        //Calculam semiperimetrul
        double s = (a +  b + c) / 2;

        //Calulam aria folosind formula lui Heron
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Aria triunghiului este: " + area);

    }
}
