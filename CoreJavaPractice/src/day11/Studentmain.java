package day11;

public class Studentmain {

	public static void main(String[] args) {
//Assign the data using object reference variable
	/*	Student stu = new Student();
		stu.sid = 101;
		stu.sname = "akash";
		stu.grade = 'A';
		stu.printstudata();

//assing data by using user defined method		
		stu.setStuData(103, "Purushottam", 'c');
		stu.printstudata();*/
//assing the data using constructor
		Student stu = new Student(104,"singh",'d');
		stu.printstudata();
		
		
	}

}
