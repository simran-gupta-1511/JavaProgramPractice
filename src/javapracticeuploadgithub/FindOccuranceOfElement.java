package javapracticeuploadgithub;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindOccuranceOfElement {
public static void  occuranceOfElement(char ar[]) {
	Map<Character,Integer>charMap=new HashMap<Character,Integer>();
	for(Character ch:ar) {
		if(charMap.containsKey(ch)) {
			charMap.put(ch, charMap.get(ch)+1);
		}
		else {
			charMap.put(ch,1);
		}
		
	}
	Set<Character> keys=charMap.keySet();
	for(Character element:keys) 
	{
		if(charMap.get(element)>1) {
			System.out.println(element +"- count is : "+charMap.get(element));
		}
		else {
			System.out.println(element +"- count is : "+charMap.get(element));
		}
	}
}
	public static void main(String[] args) {
		String str ="abcaccbccc";
		char ar[]=str.toCharArray();
		occuranceOfElement(ar);
	}

}
