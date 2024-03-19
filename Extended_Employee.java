class Employee {
    String name;
    int EmpId;
    float Salary;

    public Employee(String name, int EmpId, float Salary) {
        this.name = name;
        this.EmpId = EmpId;
        this.Salary = Salary;
    }

    public void DisplayDetails() {
        System.out.println("Employeee Name: " + name);
        System.out.println("Employeee ID: " + EmpId);
        System.out.println("Employeee Salary: " + Salary);
    }
}

class DevOpsEngineer extends Employee {
    float bonus;

    public DevOpsEngineer(String name, int EmpId, float Salary, float bonus) {
        super(name, EmpId, Salary);
        this.bonus = bonus;
    }

    public double CalculateTotalSalary() {
        return (Salary + bonus);
    }

    public void DisplayDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: " + EmpId);
        System.out.println("Employee Salary: " + Salary);
        System.out.println("Employee Total Salary: " + CalculateTotalSalary());
    }
}

public class Extended_Employee {
    public static void main(String[] args) {
        DevOpsEngineer d1 = new DevOpsEngineer("Suresh", 112, 30000, 1500);
        d1.DisplayDetails();
    }
}