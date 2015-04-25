package lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Case1
{
	public static void main(String[] args)
	{
		long to = System.currentTimeMillis();
		
		List<String> seussCountActivities = Arrays.asList(
	            "findow", "Balloons", "Elephants", "Boom Bands", "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks", "Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants", "findow", "Balloons", "Elephants", "Boom Bands", "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks", "Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants", "findow", "Balloons", "Elephants", "Boom Bands", "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks", "Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants", "findow", "Balloons", "Elephants", "Boom Bands", "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks", "Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants");

	    long numberOfElephants = seussCountActivities
	            .stream()
	            .filter(p -> p.equals("Elephants"))
	            .count();
	    System.out.println(numberOfElephants);
	    System.out.println(System.currentTimeMillis() - to);
	    
	    long t1 = System.currentTimeMillis();
		
		List<String> seussCountActivities1 = Arrays.asList(
	            "findow", "Balloons", "Elephants", "Boom Bands", "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks", "Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants", "findow", "Balloons", "Elephants", "Boom Bands", "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks", "Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants", "findow", "Balloons", "Elephants", "Boom Bands", "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks", "Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants", "findow", "Balloons", "Elephants", "Boom Bands", "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks", "Hakken-Kraks", "Elephants","findow", "Balloons", "Elephants", "Boom Bands", 
	            "findow", "Hakken-Kraks", "Hakken-Kraks","Hakken-Kraks", "Elephants");
		Map<String,Integer> b = new HashMap<String, Integer>();
	    for(String word : seussCountActivities1)
	    {
	    	 if (!b.containsKey(word)){
	             b.put(word,1);
	         } else {
	             b.put(word, b.get(word) +1);
	         }
	    }
	    System.out.println(b);
	    System.out.println(System.currentTimeMillis() - t1);
	}

}
