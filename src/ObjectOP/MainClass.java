package ObjectOP;


public class MainClass {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.name = "john Doe";
        emp.age = 32;
        emp.jobTitle = "Test Manager";
        bar(emp);



    }

    static void bar(Employee a) {
        System.out.printf(" %s is %d years old and is a %s%n", a.name, a.age, a.jobTitle);

    }

}