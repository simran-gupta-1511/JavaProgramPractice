package javapracticeuploadgithub;

public class PrintPairOfNum {
	public static void getPairCount(int a[],int sum) {
		//result initalization
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i]+a[j]==sum) {
					System.out.printf("(%d, %d) %n", a[i], a[j]);
					count++;	 
				}				
			}		
		}
		System.out.println("count of pair is:"+count+"is have: "+sum);
	}

	public static void main(String[] args) {
		int a[]= {1,5,3,6,8,2};
		int sum=9;
		getPairCount(a,9);

	}

}
