package javapracticeuploadgithub;

public class ReplaceWithMultipleOf3 {

	public static void main(String[] args) {
		int a[]= {10,11,13,16,18,19};
		for(int i=0;i<a.length;i++) {
			if(((a[i])%3)==0) 
			{
				a[i]=0;			
	      	}
			System.out.print(a[i]+" ");
		}

	}

}
