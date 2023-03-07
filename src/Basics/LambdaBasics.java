package Basics;

public class LambdaBasics {
    public static void main(String[] args) {
        Addition addition =  (int a, int b) -> a+b;
//        int result = addition.add(10,25);
//        System.out.println("Wynik dodawania: "+result);
        System.out.println("Wynik dodawania: "+ addition.add(5,8));
        System.out.println("Wynik dodawania: "+ addition.add(11,6));
        LambdaBasics lambdaBasics = new LambdaBasics();
        lambdaBasics.test(addition);
        lambdaBasics.test((a,b)->(a-8)*2+b);

        MathOpertion<Float> addition2= (a, b) ->a+b;
        System.out.println(addition2.operate(10.0f,15.0f));
        MathOpertion<Integer> substratcion = (a, b) -> a-b;

        System.out.println(substratcion.operate(100, 77));
    }
    public void test(Addition addition){
        System.out.println(addition.add(88,800));
    }

}
