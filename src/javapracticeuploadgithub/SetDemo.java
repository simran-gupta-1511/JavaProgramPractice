package javapracticeuploadgithub;

import java.util.Set;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		Set<String> hashSet=new HashSet<String>();
		
		hashSet.add("hello");
		hashSet.add("to");
		hashSet.add("india");
	System.out.println(hashSet.add("hello"));;
		hashSet.add("welcome");
		System.out.println(hashSet);
		Set<String> treeSet=new TreeSet<String>(hashSet);
		treeSet.add("bangalore");
		System.out.println(treeSet);
		//to get union using Set interface
		Set<Integer> a=new HashSet<Integer>(Arrays.asList(new Integer [] {1,2,3,4,5,6,9,10})); 
		Set<Integer> b=new HashSet<Integer>(Arrays.asList(new Integer [] {12,3,4,6,9,10}));
		Set<Integer> union=new HashSet<Integer>(a);
		union.addAll(b);
		System.out.println("Union is: "+union);
		Set<Integer> intersection=new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.println("intersection is:"+intersection);
		Set<Integer> difference=new HashSet<Integer>(a);
		
		difference.removeAll(b);
		System.out.println(difference);
		
	}

}
