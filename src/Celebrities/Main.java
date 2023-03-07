package Celebrities;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Celebrity> celebrities = new ArrayList<Celebrity>();
        celebrities.add(new Celebrity("Justin Bieber", true, false, true));
        celebrities.add(new Celebrity("Kim Kardashian", false, false, false));
        celebrities.add(new Celebrity("Joanna Krupa", true, true, false));
        print(celebrities, new CheckIfSinger());
        print(celebrities, new CheckifActor());
        print(celebrities, c->c.canDance());
        print(celebrities, (Celebrity c)->{
            System.out.println("Celebryta umiejacy tanczyc to: ");
            return  c.canDance();});
    }

    private static void print(List<Celebrity> celebrities, CheckTalent checker) {
        for (Celebrity celebrity : celebrities) {
            if (checker.test(celebrity)) {
                System.out.print(celebrity + " ");
            }
            System.out.println();
        }
    }
}
