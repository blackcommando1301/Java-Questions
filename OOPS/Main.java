public class Main {

    public static void main(String[] args) {

        // Person p1=new Person();
        // p1.age=22;
        // p1.name="saurabh";

        // System.out.println(p1.age +" "+ p1.name );

        // p1.walk(12);
        // p1.walk();

        Person p2 = new Person(22, "bansal");

        Developers d1 = new Developers(19, "nahi batunga ");
        d1.details();
        d1.walk(10);

    }

}

// this is called the inhertiance as Developer class now have the properties of
// Person not only properties also Behaviours while searching for the
// functions/methods 1st the developer class is serched then it goes to its
// parent class
class Developers extends Person {
    public Developers(int age, String name) {
        super(age, name);
    }

    void walk() {
        System.out.println("this is for the developer ");
    }
}

class Person {
    String name;
    int age;

    void details() {
        System.out.println(name + " " + age);
    }

    // the walk function here is a example of complie tym Polymorphism
    void walk() {
        System.out.print(name + " " + "walked");
    }

    void walk(int steps) {
        System.out.println(name + "  walked" + steps);
    }

    // if we do not make a constructor automatically a deafult constructor is made
    // by java which return the object ;
    // constructor are basically used to create new objects

    public Person(int newAge, String newName) {
        age = newAge;
        name = newName;
    }
}
