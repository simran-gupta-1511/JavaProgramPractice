package javapracticeuploadgithub;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("ah");
		list.add("ad");
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
