/**
 * 
 */

/**
 * @author User
 *
 */
public class TestTypeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Double salaryDbl = new Double (args[0]);
		if(salaryDbl.isNaN()) {
			System.out.println("salary is not valid:" + salaryDbl);
		
		}else {
	
		double salary = Double.parseDouble(args[0]);
		
		String salaryStr = String.valueOf(salary);
		System.out.println(salaryStr);

		
		
		}
	}

}
