package streamethod;

import java.util.Arrays;
import java.util.List;

public class Program05 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 1, 5, 25, 4,100);
        Integer x = list.stream().max(Integer::compare).get();
       System.out.println("The maximum value is : "+x);
		
	}

}
