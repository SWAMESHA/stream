package streamethod;

import java.util.Arrays;
import java.util.List;
public class Program04 {
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(10, 1, 5, 25, 4);
	         Integer x = list.stream().min(Integer::compare).get();
	        System.out.println("The maximum value is : "+x);
	}
}
