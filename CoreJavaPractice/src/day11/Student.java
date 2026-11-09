package day11;

public class Student {
	int sid;
	String sname;
	char grade;

	void printstudata() {
		System.out.println(sid + " " + sname + " " + grade);
	}

//User defined methid we have created	
	void setStuData(int id, String name, char g) {

		sid = id;
		sname = name;
		grade = g;
	}

//creating constructor for assing the data	
	Student(int id, String name, char g) {
		sid = id;
		sname = name;
		grade = g;
		
	}

}
