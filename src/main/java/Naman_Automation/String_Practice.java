package Naman_Automation;

//import java.util.ArrayList;

public class String_Practice {
	public static void main(String[]args) {
//	ArrayList<String> a = new ArrayList<String>();
//	a.add("Naman");
//	a.add("XYZ");
//	a.add("GWH123");
//	a.add("GSSW");
//	
//	for(int i = 0; i<a.size(); i++)
//	{
//		System.out.println("Value of array is : " + a.get(i));
//	}	
//		
//	System.out.println("**********************");
//	
//	
//	for( String val:a) {
//		System.out.println("Value of array is : " + (val));
//       	
//	}
//	System.out.println(a.contains("Naman"));
//	
		String s = "Naman Java Practice"; // String Literal
//		System.out.println(s);
//		String[] splittedString = s.split("Java");
//	System.out.println(splittedString[0]);
//	System.out.println(splittedString[1]);
//	System.out.println(splittedString[1].trim());
//	System.out.println(splittedString[2]);
	
	for(int i = s.length()-1 ; i>=0;i--) { // To print the string in reverse
		System.out.print(s.charAt(i));
	}
	}
	}

