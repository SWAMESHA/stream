package streamethod;

import java.sql.Timestamp;
import java.util.Date;

public class Problem11 {
	public static void main(String[] args) {
		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalTime.now());
		System.out.println(java.time.LocalDateTime.now());
		
		Date date = new Date();
		System.out.println(date);
		
		Timestamp time = new Timestamp(System.currentTimeMillis());
		System.out.println(time);
		
	}

}
