package streamethod;



import java.util.stream.Stream;

public class Program09 {
	public static void main(String[] args) {
		//creating two stream	[concat method in Integer]
		Stream<Integer> list1 = Stream.of(1,2,3);
        Stream<Integer> list2 = Stream.of(4,5,6);
   Stream.concat(list1, list2) .forEach(element -> System.out.println(element));
   
   //creating two Stream 	[concat method in String]
   Stream<String> s1=Stream.of("swamesha","mahesh");
   Stream<String>s2=Stream.of("Ullash");
   Stream.concat(s1, s2).forEach(System.out::println);
   
    
    
    
		
	}

}
