package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;

public class JSONArrayCase
{
	@SuppressWarnings({ "unchecked"})
	public static void main(String[] args)
	{
		long to = System.currentTimeMillis();
		JSONArray temp = new JSONArray();
		temp.add("2");temp.add("4");temp.add("2");temp.add("4");temp.add("2");temp.add("4");temp.add("2");temp.add("4");
		List<Double>  a = (List<Double>) temp.stream().map(n -> Double.parseDouble((String) n)).collect(Collectors.toList());
		System.out.println(a);
		System.out.println(System.currentTimeMillis() - to);
		
		long t1 = System.currentTimeMillis();
		JSONArray temp1 = new JSONArray();
		temp1.add("2");temp1.add("4");temp1.add("2");temp1.add("4");temp1.add("2");temp1.add("4");temp1.add("2");temp1.add("4");
		List<Double> b = new ArrayList<Double>();
		for(Object object : temp1)
			b.add(Double.parseDouble((String) object));
		System.out.println(b);
		System.out.println(System.currentTimeMillis() - t1);
		
		long t2 = System.currentTimeMillis();
		JSONArray temp2 = new JSONArray();
		temp2.add("2");temp2.add("4");temp2.add("2");temp2.add("4");temp2.add("2");temp2.add("4");temp2.add("2");temp2.add("4");
		double[] c = new double[temp2.size()];
		int i = 0;
		for(Object object : temp1)
		{
			c[i] = Double.parseDouble((String) object);
			i = i + 1;
		}
		System.out.println(c.length);
		System.out.println(System.currentTimeMillis() - t2);
	}
}