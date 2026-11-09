package day18;
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class TypeCastingObjects2 {

	public static void main(String[] args) {
//Animal an =new Dog();

//	Cat ct=(Cat)an;	
		
		
//Dog dg=new Dog();
//Cat ct=(Cat)dg; // Invalid because they do not have any relation ship
		
	//Animal an =new Dog();	
	//Cat ct=(Cat)an;//this is ok because assignment is valid
	
	//Animal an =new Dog();
	//Cat ct=(Dog) an; Assignment is invalid as per rule no 2 because on invlaid assigmnent
	
	
	//Rule 3:
		Animal ct=new Dog();
	//	Cat ct=(Cat) an;
	
	}

}
