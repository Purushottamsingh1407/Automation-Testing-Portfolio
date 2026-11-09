package day20;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
HashMap<Integer,String> hm=new HashMap<Integer,String>();
//adding pairs 
		
	hm.put(101, "Jhon")	;
	hm.put(102, "Marry");
	hm.put(103, "Jhon")	;
hm.put(104, "David");
hm.put(104, "David");

		System.out.println(hm);
		
		System.out.println(hm.size());
		
		
		hm.remove(103);
		System.out.println(hm);
		
		//access value of the key
System.out.println(hm.get(102));
		
		//get all the keys from hashmap
		
	System.out.println(	hm.keySet());
	System.out.println(hm.values());
System.out.println( hm.entrySet());   
//Reading all the data from hashmap
//using for each loop 
for(Object k:hm.keySet())
{
	System.out.println(k+"   "+hm.get(k));
}
				
	}

}
