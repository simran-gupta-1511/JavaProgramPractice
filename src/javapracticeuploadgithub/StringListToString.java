package javapracticeuploadgithub;

import java.util.*;

public class StringListToString {

	public static void main(String[] args) {
		
		  List<String> str=new ArrayList<String>(Arrays.asList("e","f","g","a"));
		  System.out.print("list is :"+str);
		  String string=String.join(" ", str);	
		  System.out.println();
		  System.out.print(string);
		}
	
	}


