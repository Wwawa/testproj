/**
 * 
 */

/**
 * @author User
 *
 */
public class MyStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("I am Studying Java");
		String constant = "Studying";
		
		System.out.println("Given String:" + sb + " with length :" + sb.length());
		System.out.println("First Three:" + sb.substring(0,3));
		System.out.println("Last Three:" + sb.substring(sb.length()-3)); //last index only for in between
		int startOfConstant = sb.indexOf(constant);
		int endOfConstant = startOfConstant + constant.length();
		System.out.println("Print Studying:" + sb.substring(startOfConstant, endOfConstant));
		
		//System.out.println("Print out: " + sb.substring("startOfConstant"), endOfConstant));
		//System.out.println("Given : " + sb.substring("startOfConstant"), endOfConstant));
		
		
		//INSERT
		sb.insert ((sb.indexOf("am") +2), " wawa"); //2 lenght of am
		System.out.println("After insert:" + sb);
		sb.delete(sb.indexOf("am"),sb.indexOf("am")+2);
		System.out.println("After delete:" + sb);
		System.out.println("Reserve:" + sb.reverse());
		
		StringBuilder sb2 = new StringBuilder (args[0]);
		System.out.println(sb == sb2);
		StringBuilder sb3 = (sb.insert(sb.indexOf("am")+2, "wawa")); // immutability insert same memory
		System.out.println(sb == sb3);
		
		sb = null;
		
		System.out.println("sb3:" + sb);
		System.out.println("sb3:" + sb3);
	}

}
