//lex_auth_012909127698530304533
//do not modify the above line

package arrayassignment4;

public class Tester {

	public static void main(String[] args) {
		int[] marks = { 79, 87, 97, 65, 78, 99, 66 };
		Student student = new Student(marks);
		student.findGrade();
		System.out.println("Grades corresponding to the marks are : ");
		char[] grades = student.getGrade();
		for (int index = 0; index < grades.length; index++) {
			System.out.print(grades[index] + " ");
		}
	}

}
