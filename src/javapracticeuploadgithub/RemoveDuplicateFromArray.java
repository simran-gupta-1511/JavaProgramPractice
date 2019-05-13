package javapracticeuploadgithub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(Arrays.asList("a","a","b","a"));
		//ArrayList<String> nonDuplicateList=new ArrayList<String>();
		//Set<String> set=new HashSet<String>(list);
		/*
		 * list.clear(); list.addAll(set);
		 */
		//System.out.println(list);
		//without using hashset
		/*
		 * for(String element:list) { if(!nonDuplicateList.contains(element)) {
		 * nonDuplicateList.add(element); }
		 * 
		 * } System.out.println(nonDuplicateList);
		 */
		//Using LinkedHashSet
		LinkedHashSet<String> lhs=new LinkedHashSet<String>(list);
		list.clear();
		list.addAll(lhs);
		System.out.println(list);
	}

}
