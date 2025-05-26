class Employee {
    private String name; // Private access
    public int id; // Public access

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Bob");
        emp.id = 101;
        System.out.println("Employee Name: " + emp.getName() + ", ID: " + emp.id);
    }
}
