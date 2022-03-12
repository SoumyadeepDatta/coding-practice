//lex_auth_01291666846849433675
//do not modify the above line

package finalexercise1;

public class Tester {
	 public static void main(String[] args) {
	        Student student1 = new Student();
	        student1.setStudentId(1212);
	        student1.setAggreggateMarks(93);
	            
	        double totalStipend = student1.calculateTotalStipend();
	        System.out.println("The final stipend of "+student1.getStudentId()+" is $"+totalStipend);
	        
	        Student student2 = new Student();
	        student2.setStudentId(1222);
	        student2.setAggreggateMarks(84);
	            
	        totalStipend = student2.calculateTotalStipend();
	        System.out.println("The final stipend of "+student2.getStudentId()+" is $"+totalStipend);
	        
	    }
}
