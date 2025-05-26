class Person {
    String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.display();
    }
}
