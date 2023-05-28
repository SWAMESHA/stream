package streamethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem14 {
	public static void main(String[] args) {
		
		//forEach loop using   cube
		List<Integer> list=Arrays.asList(4,5,6,7,1,2,3);
		List<Integer> t=list.stream().map(s->s*s*s).filter(i->i>50).collect(Collectors.toList());
		for (Integer cube : t) {
			System.out.println(cube);
			
		}
		
		//forEach method
		System.out.println();
		List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8);
		list1.stream().map(a->a*a*a).filter(str->str>50).forEach(System.out::println);

		
		
	}

}
