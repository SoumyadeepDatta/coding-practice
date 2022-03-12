//lex_auth_012880454683738112345
//do not modify the above line
package abstractexercise1;

public class Tester {
	 public static void main(String[] args) {
	        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
	        undergraduateStudent.setTestScore(0, 70);
	        undergraduateStudent.setTestScore(1, 69);
	        undergraduateStudent.setTestScore(2, 71);
	        undergraduateStudent.setTestScore(3, 55);
	            
	        undergraduateStudent.generateResult();
	            
	        System.out.println("Student name: "+undergraduateStudent.getStudentName());
	        System.out.println("Result: "+undergraduateStudent.getTestResult());
	            
	        System.out.println();
	            
	        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
	        graduateStudent.setTestScore(0, 70);
	        graduateStudent.setTestScore(1, 69);
	        graduateStudent.setTestScore(2, 71);
	        graduateStudent.setTestScore(3, 55);
	            
	        graduateStudent.generateResult();
	            
	        System.out.println("Student name: "+graduateStudent.getStudentName());
	        System.out.println("Result : "+graduateStudent.getTestResult());
	        
	        //Create more objects of the classes for testing your code
	    }
}
