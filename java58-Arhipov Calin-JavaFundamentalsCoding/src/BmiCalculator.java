//Read 2 numbers from keyboard, person weight in kg and person height in cm and calculate the Body Mass Index using the formula :
// weightInKg/(heightInMeters*heightInMeters). If the result is between 18.5 and 24.9 including the ends of the interval,
// print 'BMI optimal', else 'BMI not optimal'

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner keyLogger = new Scanner(System.in);
        System.out.println("Enter weight: ");
        float weight = keyLogger.nextFloat();
        System.out.println("Enter height: ");
        float height = keyLogger.nextFloat();
        float BMI = weight / (height * height);
        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("BMI optimal");
        } else {
            System.out.println("BMI not optimal");
        }
        System.out.println("BMI is: " + BMI);
    }
}

