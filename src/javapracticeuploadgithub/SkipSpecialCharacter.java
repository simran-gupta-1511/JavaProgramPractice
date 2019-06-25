package javapracticeuploadgithub;

public class SkipSpecialCharacter {
	public static void reverse(String str) {
		char ch[]=str.toCharArray();
		int r=ch.length-1,l=0;
		while(l<r) {
			if(!Character.isAlphabetic(ch[l])) {
			l++;
			}
			else if(!Character.isAlphabetic(ch[r])) {
				r--;	
			}
			else {
				char temp=ch[l];
				ch[l]=ch[r];
				ch[r]=temp;
				l++;
				r--;	
			}
				
		}
		String revstr1=new String(ch);
		System.out.println("reverse string :"+ revstr1);
	}

	public static void main(String[] args) {
		String str="abc@de#f";
		reverse(str);
		}

	}


