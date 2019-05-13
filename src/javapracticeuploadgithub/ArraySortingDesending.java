package javapracticeuploadgithub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArraySortingDesending {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(10,50,80,90,100));
		System.out.println(list);
		Iterator i=list.iterator();
		System.out.println("display the iterator");
		while(i.hasNext()) {
			System.out.println(i.next());			
		}
Comparator com=Collections.reverseOrder();
Collections.sort(list, com);
System.out.println("printing desending order list:");
Iterator<Integer> i1=list.iterator();
while(i1.hasNext()) {
	System.out.println(i1.next());
}
	}

}
