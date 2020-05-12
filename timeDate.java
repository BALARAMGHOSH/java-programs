package operator;
import java.util.*;

public class timeDate {

	public static void main(String[] args) {
		int day,month,year;
		int sec,min,hr;
		GregorianCalendar date=new GregorianCalendar();
		day=date.get(GregorianCalendar.DAY_OF_MONTH);
		month=date.get(GregorianCalendar.MONTH);
		year=date.get(GregorianCalendar.YEAR);
		sec=date.get(GregorianCalendar.SECOND);
		min=date.get(GregorianCalendar.MINUTE);
		hr=date.get(GregorianCalendar.HOUR);
		
		System.out.println(day  + " / "+  (month+1)  + " / " +  year);
		System.out.println(hr+ " : "+  min  + " : " +  sec);
	}

}
