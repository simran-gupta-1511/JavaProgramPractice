package javapracticeuploadgithub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SecondHighestValue {
	//find second largest element by method//
	public static int getSecondLargestEle(int arr[],int total) 
	{
		int temp=0;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i]	;
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		return arr[total-2];	
	}
public static int getSecHighByList(Integer [] arr,int total) {
	List<Integer>list=new ArrayList<Integer>(Arrays.asList(arr));
Collections.sort(list);
	int element=list.get(total-1);
	return element;
}
public static void main(String[]args) {
	int arr[]= {-100,10,110,3,60,100};
	int temp=0;
	for(int i=0;i<arr.length;i++) 
	{
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}		
		}
	
	/*for(int arr1:arr) {
		System.out.println(arr1);*/
	
System.out.println("second highest elemnet is :"+arr[arr.length-2]);
int a[]= {100,-10,10,200,5,80,185};
Integer b[]={100,-10,10,200,5,80,185};
int total= a.length;
System.out.println("Second highest element by method: "+getSecondLargestEle(a,total));
//find second highest element from the array
System.out.println(">>>>>>>>>>>>>>second highest emenet by using collection :>>>>>>>>>>>>>");
System.out.println("using Arrays------------");
Arrays.sort(a);
System.out.println("2nd highest elemnt by Arrays: "+a[a.length-2]);
System.out.println("Using list-------");
System.out.println("find 2nd highest element using list :"+getSecHighByList(b,total));
}
}
