package javapracticeuploadgithub;

public class RemoveSpecialchar {
	public void RemoveSpecialchar(String str) {
	System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
	}

	public static void main(String[] args) {
		String str1="123#adg%ghjkASD#";
		RemoveSpecialchar obj=new RemoveSpecialchar();
		obj.RemoveSpecialchar(str1);
	}

}
