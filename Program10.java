package streamethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program10 {
	public static void main(String[] args) {
		//forEach loop
		List<Integer>list=Arrays.asList(1,2,3,4,1,2,3);
		List<Integer>l=list.stream().distinct().collect(Collectors.toList());
		for (Integer i : l) {
			System.out.println("after removing the dupicates value:"+i);
			
		}
		//forEach method
		List<Integer> list1=Arrays.asList(1,2,3,4,1,2,3);
		list1.stream().distinct().forEach(System.out::println);
	}

}
