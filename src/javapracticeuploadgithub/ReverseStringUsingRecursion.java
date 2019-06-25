package javapracticeuploadgithub;

public class ReverseStringUsingRecursion {
public static void revString(String str) {
	if(str.length()==1) {
		System.out.print(str);
	}
	else {
		revString(str.substring(1, str.length()));
		System.out.print(str.substring(0, 1));
	}
}
	public static void main(String[] args) {
		
String original="abcde";
revString(original);
	}

}
