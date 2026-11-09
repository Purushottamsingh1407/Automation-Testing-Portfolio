package day20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
//Decleration for heterogenious data 
		ArrayList mylist=new ArrayList();

		// for specific type of data or homogenious data

		//ArrayList<String> myList = new ArrayList<String>();

		//add data into array list 
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('a');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//size of array list
	System.out.println("Size of an arraylsit:"+mylist.size());	
		//PRINTING DATA FROM ARRAY LSIT 
	System.out.println("Pronting data from array list:"+mylist);
		
	//Remove the element from the atray list 	
		mylist.remove(5);//5is index of particular element 
		System.out.println("After printing:"+mylist );
		//Insert a element between some value
		mylist.add(2, "java");
		System.out.println(mylist);
		
		//Modify element in the array list
		mylist.set(2, "pYTHON");
		System.out.println(mylist);
		
		//AAccess specific element from arraylsit 
	System.out.println(mylist.get(2));
		
		//Reading all the element from the array list
	//using normal fro loop
	for(int i=0;i<mylist.size();i++)
	{
	System.out.println(mylist.get(i));	
	}
		
	//Using for each loop 
	for(Object x:mylist)
	{
		System.out.println(x);
	}
		
	//using iterator	
Iterator it=	mylist.iterator();	
	
	
	while(it.hasNext())
	{
	System.out.println(it.next());	
	}
	//Checkinf arraylist is empty or not 
System.out.println(mylist.isEmpty());	
	
	//Remove all elements from array list
		ArrayList mylist2=new ArrayList();
		mylist2.add(100);
		mylist.add("Welcome");
		mylist.removeAll(mylist2);
		
		//remove all the elements from arraylist
		mylist.clear();
		
		
		System.out.println(mylist.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
