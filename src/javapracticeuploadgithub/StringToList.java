package javapracticeuploadgithub;

import java.util.Arrays;
import java.util.List;

public class StringToList {

	public static void main(String[] args) {
		String str="hello is greeting";
		System.out.println("String is:");
	String [] elements=str.split(" ");
	List<String> list=Arrays.asList(elements);
	System.out.println(list);

	}

}
