//Write a java program to check if two Strings consist of exactly the same characters.
// The program should work in a case insensitive way and the position of characters in the two strings does not matter.
//For example: Angel an angle should return true since both words consists of same letters.
// Scrieți un program java pentru a verifica dacă două șiruri constau din exact aceleași caractere.
// Programul ar trebui să funcționeze într-un mod fără majuscule și minuscule si nu contează poziția caracterelor din cele două șiruri.
// De exemplu: Angel un unghi ar trebui să fie adevărat, deoarece ambele cuvinte sunt compuse din aceleași litere.
public class StringComparator {
        public static void main(String[] args) {
            String str1 = "Angel";
            String str2 = "an angle";

            boolean result = areStringsEqual(str1, str2);

            if (result) {
                System.out.println("The two strings consist of the same characters (case-insensitive).");
            } else {
                System.out.println("The two strings do not consist of the same characters.");
            }
        }

        public static boolean areStringsEqual(String str1, String str2) {
            // Remove spaces and convert to lowercase
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            // Check if the sorted strings are equal
            return sortString(str1).equals(sortString(str2));
        }

        public static String sortString(String str) {
            char[] charArray = str.toCharArray();
            java.util.Arrays.sort(charArray);

            java.util.Arrays.sort(charArray);

            return new String(charArray);
        }
    }

