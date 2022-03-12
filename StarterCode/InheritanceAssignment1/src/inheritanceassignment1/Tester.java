//lex_auth_012899839320784896227
//do not modify the above line

package inheritanceassignment1;

public class Tester {
	
	  public static void main(String[] args) {
	      
	        PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1850, 115, 3.5f);
	        permanentEmployee.calculateMonthlySalary();
	        System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+Math.round(permanentEmployee.getSalary()*100)/100.0);
	            
	        ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
	        contractEmployee.calculateSalary();
	        System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+Math.round(contractEmployee.getSalary()*100)/100.0);
	        
	        //Create more objects for testing your code
	    }

}
