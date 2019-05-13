package javapracticeuploadgithub;

import java.util.HashSet;

class Animal{
	int i=13;
	public Animal() {
		int i=12;
		
	}
	
	  public String toString() 
	  { 
		  return"Animal"+" "+i; 
		  }
	 
}
public class Test {

	public static void main(String[] args) {
		HashSet<Animal> s=new HashSet(); 			
		s.add(new Animal());
		s.add(new Animal());
		for(Animal a:s) {
			System.out.println(a);
		}
	}

}
