package javapracticeuploadgithub;

public class Pattern_1 {
	
	public static void main(String[] args) {
		int correntRow=1;
		int count=1;
		for(int i=1;i<=5;i++)
		{
		
       if(i%2==0) 
        {
	int reverse=correntRow +count-1;
	for(int j=0;j<i;j++) {
		
		System.out.print(reverse + " ");
		count++;
	    }	
}
	else {
		for(int j=1;j<=i;j++) {
			System.out.print(count +" ");
			count++;
		}
	  }	
System.out.println();
correntRow++;
}
		}
			
		}
	


