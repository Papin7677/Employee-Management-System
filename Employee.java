public class Employee {
    private int id,age;
    private String name, designation, department;
    private double salary;


    public Employee(int id, int age, String name, String designation, String department, double salary) {
        super();
        this.id = id;
        this.age = age;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee id: "+this.id+" {" +
            
            "age='" + getAge() + "'" +
            ", name='" + getName() + "'" +
            ", designation='" + getDesignation() + "'" +
            ", department='" + getDepartment() + "'" +
            ", salary='" + getSalary() + "'" +
            "}";
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}