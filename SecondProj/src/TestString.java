
public class TestString {
	
	/*
	 * 
	 */
	
	public static void main(String[] args) {
		/**
		int first = 1 ;
		int second = 2 ;
		int third = 3 ;
		String fourth = "C";
		String fifth = "C" ; //string pool
		String sixth = new String("C") ; //new memory not using string pool
		if(fourth == fifth)
			System.out.println("fourth and fifth is same : " + fourth); // == primitive data types memory actual value 
		else
			System.out.println("fourth and fifth are not the same : ");
		
		if(fourth == sixth)
			System.out.println("fourth and sixth is same : " + fourth);
		
		else
			System.out.println("fourth and sixth are not the same : ");
				
		*/	
		/*	
		System.out.println("Now fourth is: " + fourth);
		
		fourth = third + fourth;
		System.out.println("Now fourth is: " + fourth);
		
		fourth = second + fourth;
		System.out.println("Now fourth is: " + fourth);
		
		fourth = (String.valueOf(first)).concat(fourth);  // concat always the end. the first at 23c1 tgk buku//
		System.out.println("Now fourth is: " + fourth);  
		*/
		
		/*
		String sms ="Selamat Datang Malaysia!!!";
		System.out.println("SMS Size is :" + sms.length());//()  string method 
		System.out.println("Text at 10th position / 9th index :" + sms.charAt(9));
		System.out.println("Index of the text ! :" + sms.indexOf("!"));
		System.out.println("Substring of 0 - 10 :" + sms.substring(0,10)); //two method same name parameter is diff overloading//up to 10 only
		System.out.println("lower :" + sms.toLowerCase());
		System.out.println("upper :" + sms.toUpperCase());
		*/
		
		String country = "Malaysia";
		
		if(country.equals(args[0])); {     //country.equalsIgnoreCase(args[0]	{
				System.out.println("Country is Malaysia"); //equalsIgnoreCase 
			
		}else {
				System.out.println("Country is not Malaysia but " + args[0]);
			}
			
		
		String usercountry = args[0];
		
		if(usercountry.startsWith("m")) {
			System.out.println("Country is Starting with m");
		}
		
		if(usercountry.endsWith("a")) {
			System.out.println("Country is ending with a");
		}
		
	}

}
