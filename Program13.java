package streamethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program13 {
	public static void main(String[] args) {
		List<Integer> x = Arrays.asList(1, 2, 3, 4, 5,6);
		 Integer sum = x.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
		
	}

}
