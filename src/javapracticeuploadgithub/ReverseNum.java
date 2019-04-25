package javapracticeuploadgithub;

public class ReverseNum {

	public static void main(String[] args) {
		int rev=0;
		
		int num=12345;
		while(num!=0) {
			rev=rev*10+(num%10);
			num=num/10;
		}
System.out.println(rev);
int num1=45897;
StringBuffer sb=new StringBuffer(String.valueOf(num1));
System.out.println(sb.reverse());
	}

}
