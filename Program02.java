package streamethod;

import java.util.Random;

public class Program02 {
	public static void main(String[] args) {
		
		Random str=new Random();
		str.doubles().limit(5).forEach(System.out::println); 
	}

}
