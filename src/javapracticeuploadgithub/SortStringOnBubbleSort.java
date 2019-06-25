package javapracticeuploadgithub;

public class SortStringOnBubbleSort {
	static String str="java";
	static char ar[]=str.toCharArray();
	public static void bubbleSor() {
		for(int i=0;i<ar.length;i++) {	
			for(int j=0;j<ar.length-1;j++) {
				if(ar[j]>ar[j+1]) {
					char temp=ar[j];
					ar[j+1]=ar[j];
					ar[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		bubbleSor();
		System.out.println(ar);

	}

}
