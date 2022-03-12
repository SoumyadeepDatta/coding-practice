//lex_auth_012890553012772864110
//do not modify the above line

package methodsassignment4;

public class Rectangle {
	//Implement your code here
	public float length;
	public float width;

	public double calculateArea() {
		return Double.parseDouble(String.format("%.2f", length * width));
	}
	public double calculatePerimeter() {
		return Double.parseDouble(String.format("%.2f", 2 * (length + width)));
	}
	
}
