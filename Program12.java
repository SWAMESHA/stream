package streamethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program12 {
	public static void main(String[] args) {
		//forEach loop  sort order
		List<Integer>list=Arrays.asList(4,5,6,7,1,2,3,10);
		List<Integer>sort=list.stream().sorted().collect(Collectors.toList());
		for (Integer i : sort) {
			System.out.println(i);
			
		}
		
		//forEach method
		List<Integer> list1 = Arrays.asList(10,30,50,60,20);
	       list1.stream().sorted().forEach(System.out::println);
	}

}
