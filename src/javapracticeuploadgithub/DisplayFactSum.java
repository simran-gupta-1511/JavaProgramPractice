package javapracticeuploadgithub;

import java.util.Scanner;

public class DisplayFactSum {
	static int fact;
	public static int factDisplay(int n) {
	if(n==0) {
		return 1;
	}	
	else {
		 fact=n*factDisplay(n-1);
	} 
	return fact;
	}

	public static void main(String[] args) {		
Scanner s= new Scanner(System.in);
System.out.println("enter the desined number for fact: ");
int n=s.nextInt();
System.out.println("factorial of the "+n+": "+factDisplay(n));
	}

}
