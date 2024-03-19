class employee {
    private String name;
    private int EmpId;
    public float Salary;

    public employee(String name, int EmpId, float Salary) {
        this.name = name;
        this.EmpId = EmpId;
        this.Salary = Salary;
    }

    public void DisplayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + EmpId);
        System.out.println("Employee Salary: " + Salary);
    }
}

