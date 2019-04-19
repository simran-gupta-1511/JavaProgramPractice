package javapracticeuploadgithub;

public class ReplaceWithEvenorOdd {

	public static void main(String[] args) {
		
		ReplaceWithEvenorOdd obj=new ReplaceWithEvenorOdd();
		obj.replaceOddEven(7);
	}
public void replaceOddEven(int num) {
	int a[]= {10,11,13,16,18,19};
	for(int i=0;i<a.length;i++) {
		if((num%2)==0) 
		{
			if(((a[i])%2)==0) {
				a[i]=0;
			}
			System.out.print(a[i]+" ");
		}
		else {
			if(((a[i])%2)!=0) {
				a[i]=0;
			}
			System.out.print(a[i]+" ");
		}
		}

	}
}


