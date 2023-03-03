
import java.util.HashSet;
import java.util.Scanner;




public class EmployeeManagement {
    Scanner scan = new Scanner(System.in);
    HashSet<Employee> employees = new HashSet<Employee>();
    Employee employee01 = new Employee(000, 19, "Papin", "Manager", "Management", 140000);
    Employee employee02 = new Employee(001, 21, "Ali", "Marketing Specialist", "Marketing", 25000);
    Employee employee03 = new Employee(002, 20, "Abdullah", "Senior Developer", "IT", 80000);
    Employee employee04 = new Employee(003, 21, "Ilham", "Junior Developer", "IT", 65000);
    private int numOfEmployees;

    
    public EmployeeManagement() {
		
		employees.add(employee01);
		employees.add(employee02);
        employees.add(employee03);
        employees.add(employee04);
        numOfEmployees = 4;
		
	}
    public void addNewEmployee(){
        int id,age;
        String name,designation,department;
        double salary;
        try{
        System.out.println("Please enter the ID of the new Employee: ");
        id = scan.nextInt();
        for(Employee emp:employees){
            if(emp.getId()==id){
                System.out.println("Please enter an ID that is not already in use!");
                addNewEmployee();
                return;
            }
        }
        System.out.println("Please enter the age of the new Employee: ");
        age = scan.nextInt();
        System.out.println("Please enter the name of the new Employee: ");
        name = scan.next();
        System.out.println("Please enter the department of new Employee: ");
        department = scan.next();
        System.out.println("Please enter the designation of the new Employee: ");
        designation = scan.next();
        System.out.println("Please enter the salary of the new Employee: ");
        salary = scan.nextDouble();
        Employee emp = new Employee(id, age, name, designation, department, salary);
        employees.add(emp);
        System.out.println("Employee with the id of "+id+" has been added");
        numOfEmployees++;
    }
    catch(Exception e){
            System.out.println("Please enter a VALID argument.");
            scan.nextLine();
            return;
            

        }
        
        
       
    }
    public void viewEmployee(int ID){
        if(numOfEmployees==0){
            System.out.println("The number of employees is 0, thus no one can be viewed!");
        return;
       }
        for(Employee emp:employees){
         if(emp.getId()==ID){
            System.out.println(emp.toString());
            return;
        } 
            }
        System.out.println("No Employee with this ID exists");}



    public void updateEmployee(int ID){

       try{ for(Employee emp:employees){
            if(emp.getId()==ID){
                System.out.println("Choose the variable that you want to update:");
                System.out.println("1) ID\n2) Age\n3) Name\n4) Designation\n5) Department\n6) Salary\n7) All of the obove \n8) Go back");

                int input = scan.nextInt();
                String input2;
                double input3;
                switch(input){


                    case 1:
                    System.out.println("Please enter new ID.");
                    input = scan.nextInt();
                    emp.setId(input);
                    break;


                    case 2:
                    System.out.println("Please enter new age.");
                    input = scan.nextInt();
                    emp.setAge(input);
                    break;


                    case 3:
                    System.out.println("Please enter new name.");
                    input2 = scan.next();
                    emp.setName(input2);
                    break;


                    case 4:
                    System.out.println("Please enter new designation.");
                    input2 = scan.next();;
                    emp.setDesignation(input2);
                    break;


                    case 5:
                    System.out.println("Please enter new Department.");
                    input2 = scan.next();
                    emp.setDepartment(input2);
                    break;


                    case 6:
                    System.out.println("Please enter new Salary.");
                    input3 = scan.nextDouble();
                    emp.setSalary(input3);
                    break;


                    case 7:
                    System.out.println("Please enter new ID.");
                    input = scan.nextInt();
                    emp.setId(input);
                    System.out.println("Please enter new age.");
                    input = scan.nextInt();
                    emp.setAge(input);
                    System.out.println("Please enter new name.");
                    input2 = scan.next();
                    emp.setName(input2);
                    System.out.println("Please enter new designation.");
                    input2 = scan.next();;
                    emp.setDesignation(input2);
                    System.out.println("Please enter new Department.");
                    input2 = scan.next();
                    emp.setDepartment(input2);
                    System.out.println("Please enter new Salary.");
                    input3 = scan.nextDouble();
                    emp.setSalary(input3);
                    break;


                    case 8:
                    return;


                    default:
                    System.out.println("Please make a valid input!");
                    updateEmployee(ID);
                }
                System.out.println("The Employee has been updated!");
                return;
            }
                }
                System.out.println("Employee with ID "+ID+" does not exist!");}
                catch(Exception e){
                    System.out.println("Please enter a valid argument!");

                }
    }


    public void removeEmployee(int ID){
        for(Employee emp:employees){
            if(emp.getId()==ID){
               employees.remove(emp);
               System.out.println("Employee was removed!");
               numOfEmployees--;
               return; 
            }

        }
        System.out.println("The Employee with the ID "+ID+" does not exist!");
    }
    public void viewAllEmployees(){
        if(numOfEmployees==0){
             System.out.println("The number of employees is 0, thus no one can be viewed!");
         return;
        }

        
            System.out.println(employees.toString());
            
        
        
    }
    
}
