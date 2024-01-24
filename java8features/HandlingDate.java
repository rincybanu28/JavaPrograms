package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HandlingDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current date: "+currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: "+currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Time: "+currentDateTime);
		
		LocalDate date = LocalDate.parse("1997-10-24"); //setting date by passing string
		System.out.println("Date: "+date);
		
		LocalDate date2 = LocalDate.of(2005, 5, 10);//setting date by passing integer
		System.out.println("Date: "+date2);
		
		
		//retrieve yesterdays date
		LocalDate yesterday = currentDate.minusDays(1);
		System.out.println("Yesterdays date: "+yesterday);
		
		//retrieve tomorrows date
		LocalDate tommorrow = currentDate.plusDays(1);
		System.out.println("Yesterdays date: "+tommorrow);
		
		
		//is leap year?
		System.out.println("Is leap year? "+currentDate.isLeapYear());
		
		//changing date-time format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:ss:mm");
		String formattedDate = currentDateTime.format(formatter);
		System.out.println("Date(dd-mm-yyyy) format: "+formattedDate);
		
		//handling zone
		ZonedDateTime zonedDate = ZonedDateTime.now();
		System.out.println("Date with zone :"+zonedDate);
		
		//get zone
		System.out.println("Current zone :"+zonedDate.getZone());
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo"); //setting Tokyo zone
		ZonedDateTime tokyoZone =  zonedDate.withZoneSameInstant(tokyo);
		System.out.println("Date (tokyo zone): "+tokyoZone);

	}

}
