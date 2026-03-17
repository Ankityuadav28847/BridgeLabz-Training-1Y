
32class Person {
    String name;
    int age;
    
    Person(String n, int a) {
        name = n;
        age = a;
    }
    
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1);
        p1.display();
        p2.display();
    }
}
