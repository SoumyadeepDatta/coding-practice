//lex_auth_012908173091069952511
//do not modify the above line

package exceptionexercise1;

public class Tester {
	 public static void main(String[] args) {
         
	        try {
	            Applicant applicant= new Applicant();
	            applicant.setName("Jenny");
	            applicant.setJobProfile("Clerk");
	            applicant.setAge(25);
	            
	            Validator validator = new Validator();
	                  
	            validator.validate(applicant);
	            System.out.println("Application submitted successfully!");
	        } 
	        catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
