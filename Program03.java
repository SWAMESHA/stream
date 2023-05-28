package streamethod;

import java.util.Arrays;
import java.util.List;

public class Program03 {
	public static void main(String[] args) {
		//forEach method 
		List<String>list=Arrays.asList("Hi","Hello","Tata","Bye Bye");
		list.stream().forEach(System.out::println);
	}
}
