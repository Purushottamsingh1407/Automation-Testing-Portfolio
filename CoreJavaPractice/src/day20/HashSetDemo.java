package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet myset = new HashSet();

//	Set myset=new HashSet();

//Only for homogenious data 
		// HashSet<Integer> myset=new HashSet<Integer>();
//addingh data into hashset	
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add('a');
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);

		System.out.println(myset);

		myset.remove('a');
		System.out.println(myset);

//insertion not possible
//Access specific elemet is not possible

//convert hashset to array list 
		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
//size 
		myset.size();
		System.out.println(myset);

//Read all the element

//only possible by enhanced for lopp 
		for (Object x : myset) {
			System.out.println(x);
		}

//Using iterator
		Iterator it = myset.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
//clearing all the data 
		myset.clear();
		System.out.println(myset);
	}

}
