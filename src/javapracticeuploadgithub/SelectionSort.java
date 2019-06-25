package javapracticeuploadgithub;

public class SelectionSort {
	static String str="javaMadeSoEasy";
	static char arr[]=str.toCharArray();

	public static void main(String args[]) {
		selectionSort();
		System.out.println(arr);

	}
	public static void selectionSort() {
		int i,j ;
		for(i=0;i<arr.length-1;i++) {
			
			for(j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				}
			}
		}
	/*
	 * private static void swap(int pos1, int pos2) { char temp = arr[pos1];
	 * arr[pos1] = arr[pos2]; arr[pos2] = temp;
	 * 
	 * }
	 */

}
