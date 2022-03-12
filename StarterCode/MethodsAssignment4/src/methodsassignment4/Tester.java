//lex_auth_012890553012772864110
//do not modify the above line

package methodsassignment4;

public class Tester {
	
	public static void main(String args[]) {
		
		Rectangle rectangle=new Rectangle();
		//Assign values to the member variables of Rectangle class

		//Invoke the methods of the Rectangle class to calculate the area and perimeter
		
		//Display the area and perimeter using the lines given below
		rectangle.length = 12f;
		rectangle.width = 5f;
		System.out.println("Area of the rectangle is " + rectangle.calculateArea());
		System.out.println("Perimeter of the rectangle is " + rectangle.calculatePerimeter());
	}
}
