package javapracticeuploadgithub;

public class ReverseStringWithoutExistingFunction {
  public static String reverseStr(String str) {
	  String rev="";
	 for(int i=str.length()-1;i>=0;i--) {
		 rev=rev+str.charAt(i);
		 
  }return rev;
	 }
	public static void main(String[] args) {
	String	str="abcde";
	System.out.println(reverseStr(str));
	//Reverse String using reverse buffer class//
	StringBuffer sb= new StringBuffer(str);
	System.out.println(sb.reverse());
	}

}
