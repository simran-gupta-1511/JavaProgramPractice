package javapracticeuploadgithub;

public class BubbleSort {
	public static void bubbleSort(int ar[]) {
		int n=ar.length;
		for(int i=0;i<n;i++) 
		{
			for(int j=1;j<n-i;j++) {
				if(ar[j-1]>ar[j]) {
					int temp=ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
				}			
				}
				
			}
		System.out.println();
		System.out.println("display the array after bubblesort:");
	}

	public static void main(String[] args) {
		int ch[]= {10,35,5,2,3,11,350};
		System.out.println("display the array before bubblesort:");
		for(int ch1:ch){
			System.out.print(ch1+" ");
		}
		bubbleSort(ch);
		for(int ch2:ch) {
			System.out.print(ch2+" ");
		}

	}

}
