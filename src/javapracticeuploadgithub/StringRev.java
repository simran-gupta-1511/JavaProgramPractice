package javapracticeuploadgithub;

import java.util.Scanner;

public class StringRev {
	
	int sumArr=0;
	int missElement=0;
	public void findMissingElement(int []arr,int sum) 
	{
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) 
			{
				sumArr=arr[i]+arr[j];
				if(sum==sumArr) {
				System.out.printf("(%d,%d)%n",arr[i],arr[j] );
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
int arr[]= {2,3,5,6,2,1,4,5,6,7};
int sum=7;
	StringRev obj=new StringRev();
	obj.findMissingElement(arr,sum);

	}

}
