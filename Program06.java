package streamethod;

import java.util.Arrays;
import java.util.List;

public class Program06 {
	public static void main(String[] args) {
		
		//Greater Than 3 later counting
	List<String> list=Arrays.asList("Hi","Hello","Bye", "Tata");
	long countvalue = list.stream().filter(s->s.length()>3).count();
	System.out.println("String Count with greater Than 3 later:" +countvalue);
	}
}
