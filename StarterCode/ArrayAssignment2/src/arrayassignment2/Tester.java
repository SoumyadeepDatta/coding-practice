//lex_auth_012909489074814976538
//do not modify the above line

package arrayassignment2;

public class Tester {
	
	 public static double[] findDetails(double[] salary) {
		 	double[] ans = new double[3];
	        double sum = 0;
			for (double d : salary){
				sum += d;
			}     
			ans[0] = sum / salary.length;

			for (double d : salary){
				if (d > ans[0]) {
					ans[1] += 1;
				}
				else if (d < ans[0]) {
					ans[2] += 1;
				}
			}
			return ans;
	    }
	       
	    public static void main(String[] args) {
	        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
	        double[] details = findDetails(salary);
	              
	        System.out.println("Average salary: "+ details[0]);
	        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
	        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
	    }

}
