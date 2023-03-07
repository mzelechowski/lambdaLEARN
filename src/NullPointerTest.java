class Person {
    Person(){

    }
    Person (String name){
        this.name=name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class NullPointerTest {
    public static void main(String[] args) {
        Person[] persons = new Person[10];
//        persons[0].setName("Maciek"); NullPointerException
        persons[0]=new Person("Maciek");

    }
}
