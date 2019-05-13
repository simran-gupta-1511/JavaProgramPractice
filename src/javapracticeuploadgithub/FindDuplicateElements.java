package javapracticeuploadgithub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {
		int str[]= {5,4,3,2,2,2,3,4};	
		//find duplicate element using for loop
/*for(int i=0;i<str.length;i++){
	int temp=str[i];
	int count = 0;
	for(int j=i+1;j<str.length;j++) {
		if(temp==str[j]) {
		System.out.println("duplicate element are:"+ str[j]);
		}	
		
		}*/
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(5,4,3,2,2,2,3,4));
		System.out.println(list);
		Set<Integer> mySet=new HashSet<Integer>();
		for(Integer element:list) {
			if(!mySet.add(element)) {
				System.out.print(element+" ");
			}
		}
	
	}
	
}		

	


