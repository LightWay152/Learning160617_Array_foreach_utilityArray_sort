package lab.Array_foreach_utilityArray_sort.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DemoDate {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*Demo1: findDOB*/
		//findDOB();
		
		/*Demo2: convertDOB*/
		//convertDOB();
		
		/*Demo3: noteForDate*/
		//noteForDate();
		
	}
	
private static void noteForDate() {
		
		/*
		 * Note:
		 * - Year: 4 number
		 * - Month: 0 -> 11
		 * - Date: 1->31
		 * - Minutes/Second: 0->59 
		 * - Day: 0->6
		 *  */
		Date now = new Date();
		now.setDate(40);
		System.out.println(now);
		
		/*get current Quarter*/
		int month = now.getMonth() + 1;
		int quarter = (int)Math.ceil(month/3.0);
		System.out.println(quarter);
		
	}

	private static void convertDOB() {
		
		SimpleDateFormat formater = new SimpleDateFormat();
		
		try {
			String dob = "01-09-1971";
			formater.applyPattern("dd-MM-yyyy");
			Date date = formater.parse(dob);
			
			Date now = new Date();
			formater.applyPattern("h a EEEE, MMMM dd, yyyy");
			String nowStr = formater.format(now);
			
			System.out.println(nowStr);
			
			/*Way 1 to calculate current age*/
			int dob_year_way1 = date.getYear();
			int current_year_way1 = now.getYear();
			int age_way1 = current_year_way1 - dob_year_way1;
			System.out.println("My age is "+age_way1);
			
			/*Way 2 to calculate current age*/
			formater.applyPattern("yyyy");
			int dob_year_way2 = Integer.parseInt(formater.format(date));
			int current_year_way2 = Integer.parseInt(formater.format(now));
			int age_way2 = current_year_way2 - dob_year_way2;
			System.out.println("My age is "+age_way2);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

	private static void findDOB() {
		
		Date now = new Date();
		
		long time = now.getTime();
		System.out.println(time); 
		
		now.setTime(0);
		System.out.println(now); 

		/*Date per year: remember enter 365L to avoid overflow number */
		Date date1 = new Date(365L*24*60*60*1000);
		System.out.println(date1); 
		
		/*Check date1 after now or not*/
		boolean check = date1.after(now);
		System.out.println(check);
		
	}

}
