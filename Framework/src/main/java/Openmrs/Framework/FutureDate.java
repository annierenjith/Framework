package Openmrs.Framework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FutureDate {

	public static void main(String[] args) {
		Calendar cal =  Calendar.getInstance();
		Date d = cal.getTime();
		System.out.println(d);
		SimpleDateFormat  sdf = new	SimpleDateFormat("dd/mm/yy"); 
		System.out.println(sdf.format(d));		

	}

}
