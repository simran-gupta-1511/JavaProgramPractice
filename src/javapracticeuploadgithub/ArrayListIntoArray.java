package javapracticeuploadgithub;
import java.util.*;

public class ArrayListIntoArray {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>(Arrays.asList("a","b","c","d"));
		System.out.print("Array list is:"+str);
		System.out.println();
		String strarr[]=new String[(str.size())];
		
for(int i=0;i<str.size();i++) {
	strarr[i]=str.get(i);
	System.out.print(strarr[i]+" ");
}
	}

}
