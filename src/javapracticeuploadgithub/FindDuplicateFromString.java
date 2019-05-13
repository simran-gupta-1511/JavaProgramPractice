package javapracticeuploadgithub;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class FindDuplicateFromString {
	public static void main(String[] args) {
		String str="abcdefcabccccc";
		String arr[]=str.split("");
		//using set
		/*
		 * Set<String> set=new HashSet<String>(); for(String element:arr) {
		 * if(set.add(element)==false) {
		 * System.out.println("duplicate element is:"+element); } else {
		 * set.add(element); } }
		 */
		Map<String, Integer> map=new HashMap<String, Integer>();
		for(String elemnet:arr) {
			Integer count=map.get(elemnet);
			if(count==null) {
				map.put(elemnet, 1);
			}
			else {
				map.put(elemnet, ++count);
			}
			 Set<Entry<String, Integer>> entryset=map.entrySet();
			 for(Entry<String,Integer> entry:entryset)
			 {
				 if(entry.getValue()>1) 
				 {
					 System.out.printf("duplicate element '%s' and count '%d' %n: ",entry.getKey(),entry.getValue());
				 }
			 }		}
		}
		 
	}


