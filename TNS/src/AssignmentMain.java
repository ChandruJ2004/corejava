import com.Chandru.assignment.employees.*;
import com.Chandru.assignment.utilities.*;

public class AssignmentMain {
	public static void main(String[] args) {
       
        Manager manager = new Manager("Chandru", 101, 50000, "Sales");
        
        Developer developer = new Developer("Chan", 102, 45000, "Java");
        
        EmployeeUtilities utilities = new EmployeeUtilities();
        utilities.displayEmployeeDetails(manager);
        utilities.displayEmployeeDetails(developer);
        utilities.increaseSalary(manager, 10); 
        utilities.increaseSalary(developer, 8);
        System.out.println("\nUpdated Details:");
        utilities.displayEmployeeDetails(manager);
        utilities.displayEmployeeDetails(developer);
    }
}
