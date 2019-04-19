package javapracticeuploadgithub;

public class ReplaceWithMultiple {

	public static void main(String[] args) {
		
		ReplaceWithMultiple obj=new ReplaceWithMultiple();
		obj.replace(10);
	}
public void replace(int num) {
	int a[]= {10,11,13,16,18,19,100};
	for(int i=0; i<a.length;i++) {	
		if(((a[i])%num)==0)
		{
			a[i]=0;		
		}
		System.out.print(a[i]+" ");
		}
}

}
