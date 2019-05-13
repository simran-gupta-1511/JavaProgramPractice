package javapracticeuploadgithub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoOfcollection {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>(Arrays.asList("a","b","c"));
		System.out.println(list);
		String str=String.join("", list);
		System.out.println(str);
		}

}
