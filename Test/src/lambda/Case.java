package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Case 
{
	public static void main(String[] args)
	{
//		String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};
//		List<String> players =  Arrays.asList(atp);
//		players.forEach((player) -> System.out.print(player + "; "));
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//		list.forEach(n -> System.out.println(n));
		long to = System.currentTimeMillis();
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);
		System.out.println(System.currentTimeMillis() - to);
		System.out.println(System.currentTimeMillis() - to);
		
//		String[] atp = {"Rafael Nadal", "Novak Djokovic"};
//		List<String> players =  Arrays.asList(atp);	
//		players.forEach(System.out::println);
	}

}