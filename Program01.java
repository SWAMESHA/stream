package streamethod;

import java.util.StringJoiner;

public class Program01 {
	public static void main(String[] args) {
		 StringJoiner s=new StringJoiner (",", "[", "]");
	        s.add("Swamesha");
	        s.add("Ullash");
	        s.add("Ramesh");
        System.out.println("String after adding # in suffix and prefix:" +s);
	
	}

}
