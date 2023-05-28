package streamethod;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class Problem8 {
	public static void main(String[] args) {
		
		//forEach loop  using  (multiple program)
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
		List<Integer>l=list.stream().map(s->s*3).collect(Collectors.toList());
		for (Integer i : l) {
		System.out.println(i);			
	}
		
		// forEach method
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7);
		list1.stream().map(x->x*3).forEach(System.out::println);		
		
	}

}
