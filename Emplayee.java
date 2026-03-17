class Employee {
    String name;
    int id;
    double salary;
    
    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Salary: $%.2f%n", salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice Johnson", 101, 75000);
        emp.display();
    }
}
