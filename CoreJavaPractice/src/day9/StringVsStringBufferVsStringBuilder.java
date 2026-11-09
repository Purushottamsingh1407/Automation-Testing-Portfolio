package day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
    //String is immutable object means we can not change the value
		/*
		String s="welcome";
		System.out.println(s.concat("to java"));
		System.out.println(s);
		*/
		
		//StringBuffer-mutable-can change
		/*
		StringBuffer s=new StringBuffer("welcome");
		s.append("to java");
		System.out.println(s);
		*/
		
		//StringBuilder-mutable-can change
		StringBuilder s=new StringBuilder("welcome");
		s.append("to java");
		System.out.println(s);
		
		
		
		
		
		
		
		
	}

}
