import java.util.Scanner;

public class Main{
public static void menu(){
    System.out.println("Employee Management System");
    System.out.println("Please Select an option");
    System.out.println("1) Add a new Employee");
    System.out.println("2) Update an Employee");
    System.out.println("3) View an Employee");
    System.out.println("4) Remove an Employee");
    System.out.println("5) View all Employees");
    System.out.println("6) Exit");
}


public static void main(String[] args) throws InterruptedException {
    int input;
    Scanner scan = new Scanner(System.in);
    EmployeeManagement manage = new EmployeeManagement();

    while (true){
        menu();
        input = scan.nextInt();

        switch(input){
            
            case 1: 
            manage.addNewEmployee();
            Thread.sleep(3000);
            break;

            case 2: 
            System.out.println("Please enter the ID of the Employee that you want to edit.");
            input = scan.nextInt();
            manage.updateEmployee(input);
            Thread.sleep(3000);
            break;

            case 3: 
            System.out.println("Please enter the ID of the Employee that you want to view.");
            input = scan.nextInt();
            manage.viewEmployee(input);
            Thread.sleep(3000);
            break;

            case 4: 
            System.out.println("Please enter the ID of the Employee that you want to remove.");
            input = scan.nextInt();
            manage.removeEmployee(input);
            Thread.sleep(3000);
            break;

            case 5: 
            manage.viewAllEmployees();
            Thread.sleep(3000);
            break;
            
            case 6: 
            scan.close();
            System.out.println("Exiting program...");
            System.exit(0);
            break;
        }
        

    }
    


} 
    

}