package Pack1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{


    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int    height = scanner.nextInt();
        String sport = scanner.next();
        scanner.close();

        ATHLETES.add(new Athlete(name, height, sport));

        System.out.println(printAll(ATHLETES));

        ArrayList<String> rareAthletes = printAll(ATHLETES);
        System.out.println(rareAthletes);

    }

    public static ArrayList<String> printAll(List<Athlete> all) {
        if (all == null)
            throw new NullPointerException();
        else if (all.size() < 1)
            return new ArrayList<>();
        else {
            ArrayList<String> allNames = new ArrayList<>();
            for (Athlete f : all) {
                if (rare(f)) {
                    allNames.add(f.name);
                }
            }
            return allNames;
        }
    }

    // It is the norm for tall athletes to be basketball players
    public static boolean rare(Athlete a) {
        if (a.height > 180 || !"basketball".equals(a.profession)){
            return false;
        } else {
            return true;
        }
    }
    public final static class Athlete {
        public final int height;
        public final String profession;
        public final String name;

        public Athlete(String name, int height, String profession) {
            this.name = name;
            this.height = height;
            this.profession = profession;
        }
    }

    private final static List<Athlete> ATHLETES = new ArrayList<>();
    static {
        ATHLETES.add(new Athlete("Bob", 190, "basketball"));
        ATHLETES.add(new Athlete("Alex", 170, "soccer"));
        ATHLETES.add(new Athlete("Frank", 130, "basketball"));
        ATHLETES.add(new Athlete("Scotty", 175, "basketball"));
        ATHLETES.add(new Athlete("Jane", 190, "chess"));
    }
}
