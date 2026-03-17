class Circle {
    double radius;
    
    Circle(double r) {
        radius = r;
    }
    
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    
    void display() {
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Circumference: %.2f%n", calculateCircumference());
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.display();
    }
}
