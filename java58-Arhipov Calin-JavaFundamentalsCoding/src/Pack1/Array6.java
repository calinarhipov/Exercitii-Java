//Given a String array, print only the Strings with an even number of characters.
package Pack1;

public class Array6 {
    public static void main(String[] args) {
        String[] strings2 = {"djsadj askjdsalk ", "djsaj dksajdsakl j", "äna are mere"};

        for (int i = 0; i < strings2.length; i++) {
            if (strings2[i].length() % 2 == 0) {
                System.out.println(strings2[i] + " " + strings2[i].length());
            }
        }
    }

}
