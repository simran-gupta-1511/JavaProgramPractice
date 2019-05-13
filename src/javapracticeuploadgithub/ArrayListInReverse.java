package javapracticeuploadgithub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListInReverse {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(Arrays.asList("a","b","d","c"));
		Iterator i=list.iterator();
		//display list in order
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Collections.reverse(list);
		System.out.println("display in reverse order");
		Iterator i1=list.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}
