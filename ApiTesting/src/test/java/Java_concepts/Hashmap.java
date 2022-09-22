package Java_concepts;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a=10;
		//int b=20;
		
		HashMap<String, Integer> Hash= new HashMap<String, Integer>();
		Hash.put("a", 10);
		Hash.put("b", 10);
		
		System.out.println(Hash);
		
		System.out.println(Hash.get("a"));
		
		
		//User and Pass
		
		HashMap<String, String> Hash2= new HashMap<String, String>();
		
Hash2.put("User123","Pass123");

System.out.println(Hash2.containsKey("User123"));


	}

	
}
