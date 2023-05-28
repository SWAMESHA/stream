package streamethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program7 {
	public static void main(String[] args) {
		//for Each loop using
	List<String> stringList = Arrays.asList("Hello","Hi","Swamesha","Going","To","Park","ram");
    List<String>s=stringList.stream().filter(str -> str.length() > 3).collect(Collectors.toList());
    		for(String show:s) {
    			System.out.println(show);
    		}
    		
    		//forEach method
    		List<String> list=Arrays.asList("Tata","Bye","Questions","Answers","For","Swamy");
    		list.stream().filter(st->st.length()>3).forEach(System.out::println);
    		
	
}

}