package javapracticeuploadgithub;

import java.util.HashMap;
import java.util.Map;

public class DuplicatecharUsingHashMap {

	public static void main(String[] args) {
		String str="abcdefabc";
		String arr[]=str.split("");
		Map<String,Integer>map=new HashMap<String,Integer>();
		for(String element:arr) {
			System.out.println(element);
			if(map.containsKey(element)) {
				System.out.println("Duplicate value:"+element);
			}
			else {
			
				map.put(element,1);
			}
		}

	}

}
