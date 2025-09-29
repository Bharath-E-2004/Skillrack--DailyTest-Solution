import java.util.*;

class Professor {
    String name;
    String department = "N/A";
    int salary = 10000;

    // Constructor with only name
    public Professor(String name) {
        this.name = name;
    }

    // Constructor with name and department
    public Professor(String name, String dep) {
        this.name = name;
        this.department = dep;
    }

    // Constructor with name, department, and salary
    public Professor(String name, String dep, int sal) {
        this.name = name;
        this.department = dep;
        this.salary = sal;
    }

    public String getName() {
        return this.name;
    }

    public String getDept() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Professor with only name
        Professor prof1 = new Professor(sc.nextLine().trim());

        // Professor with name and department
        Professor prof2 = new Professor(sc.next(), sc.next().trim());

        // Professor with name, department, and salary
        Professor prof3 = new Professor(sc.next(), sc.next(), sc.nextInt());

        display(prof1);
        display(prof2);
        display(prof3);

        sc.close();
    }

    private static void display(Professor prof) {
        System.out.println("Name: " + prof.getName());
        System.out.println("Department: " + prof.getDept());
        System.out.println("Salary: " + prof.getSalary());
        System.out.println("-------------------------");
    }
}
