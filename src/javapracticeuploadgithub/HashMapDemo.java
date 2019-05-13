package javapracticeuploadgithub;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>(){
			{
				put(0,"a");
				put(1,"b");
				put(1,"c");
				put(3,"d");
				put(4,"e");
				put(5,"e");
			}
		};
		Set< Map.Entry< Integer,String> > st = map.entrySet();
		for(Map.Entry<Integer,String> set:st)
		{
				
			System.out.print(set.getKey()+":");
			System.out.println(set.getValue());
			
		}

	}

}
