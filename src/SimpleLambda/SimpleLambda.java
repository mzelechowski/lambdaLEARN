package SimpleLambda;

class Testowa{

}

public class SimpleLambda{
    public static void main(String[] args) {
        SLAdditoion<Integer> slAdditoion = (Integer a, Integer b)-> a+b;
//        int result =slAdditoion.add(5,10);
        System.out.println("Dodawanie: "+ slAdditoion.add(5,10));

    }
}
