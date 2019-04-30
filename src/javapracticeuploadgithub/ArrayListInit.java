package javapracticeuploadgithub;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInit {

	public static void main(String[] args) {
		//Array list initalization using add method//
		ArrayList<String> strList=new ArrayList<String>();
		
		strList.add("java");
		strList.add("have");
		strList.add("nice");
		strList.add("concept");
		strList.add("collection");
		strList.add("Arraylist data structure");
		System.out.print("Array list using add() is:"+strList);
//ArrayList initialization using Shorthand 
System.out.println();
		
ArrayList<String> strList1=new ArrayList<String>() {
	{
		add("java");
		add("have");
		add("nice");
	    add("concept");
		add("collection");
		add("Arraylist data structure");	
	}
};
System.out.print("Arraylist list strList1:"+ strList1);
System.out.println();
ArrayList<Integer> strList2=new ArrayList<Integer>() {
		{
			add(1);
			add(2);
			add(3);
		    add(4);
			add(5);
			add(6);	
		}
	};
	System.out.print("Arraylist list strList2:"+ strList2);
	System.out.println();
	//using asList
	ArrayList<String> strList3=new ArrayList<String>(Arrays.asList("a","b","c"));
	System.out.print("ArrayLIst strList3:"+ strList3);
	System.out.println();
	//using another collection;
	ArrayList <String> strList4=new ArrayList<String>()
	{
		{
			add("abc");
			add("abc");
			add("abc");
			add("abc");
			add("abc");
		}
	};
	ArrayList <String> strList5=new ArrayList<String>(strList4);
	System.out.print("ArrayList initialization using other collection is :"+strList5);
	
		}
}
