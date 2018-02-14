/**
 * 
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
//import java.time
/**
 * @author User
 *
 */
public class UtilTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		Date dt = new Date();
//		String currentDate = String.valueOf(dt.getDate()); //getDay the 2=tuesday 
//		
//		System.out.println("Current Date is :" + currentDate);
//		System.out.println("Current Time is :" + dt.getTime()); //epoc time,,negative less than jan 1 1970
//		
//		Calendar cal = Calendar.getInstance();//current timezone
//		
//		cal.set(2018, 1, 13); //accept argument- public static void main/data type is string/convert param to int-set the param for display the results
//		String currentCalDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR) + " " +
//		cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + cal.get(Calendar.SECOND) + "" + cal.getTimeZone().getDisplayName();
//		
//		System.out.println("Current Date is :" + currentCalDate);
//		
//		int year = Integer.parseInt(args[0]);
//		int month = Integer.parseInt(args[1]);
//		int date = Integer.parseInt(args[2]);
//		int hourOfDay = Integer.parseInt(args[3]);
//		int minute = Integer.parseInt(args[4]);
//		int second = Integer.parseInt(args[5]);
//		
//		cal.set(year, (month-1), date, hourOfDay, minute, second);
//		
//		String yourDate = cal.get(Calendar.DATE) + "/" + (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR) + " " +
//				cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + cal.get(Calendar.SECOND) + "" + cal.getTimeZone().getDisplayName();
//	
//		
//		System.out.println("Your Date is :" + yourDate);
		
		LocalDateTime localDate = LocalDateTime.now(); //local date only accept date thus add time
		System.out.println("Current date before:" + localDate);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm:ss a");
		System.out.println("Current date before:" + localDate);
		//String text = localDate.format((formatter2);
		//System.out.println("Current date formatted:" + text);
		
		//String text = date.format(formatter);
		//LocalDate parsedDate = LocalDate.parse(text, formatter);
		
		
		
		
//		
	}

}
