package javapracticeuploadgithub;

import java.util.Scanner;

public class SearchMissingArrayitem {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int num=sc.nextInt();
		
		SearchMissingArrayitem obj=new SearchMissingArrayitem();
		obj.searchMissedArrayElement(arr,10);
	}
public void searchMissedArrayElement(int arr[],int num) 
{
		
int sum=0,sum1=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
System.out.println("sum of the array content :"+sum);
for(int j=1;j<=num;j++){
	sum1=sum1+j;
}
System.out.println("sum of n number is:"+sum1);
System.out.println("Missing number from the array is ::"+(sum1-sum));
	}

}
