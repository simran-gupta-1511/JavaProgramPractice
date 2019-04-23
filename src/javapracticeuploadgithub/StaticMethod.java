package javapracticeuploadgithub;
class StaticMethod{
public StaticMethod(int i)	{
		System.out.println("1");
	}
public StaticMethod()	{
	this(10);
	System.out.println("2");
}
void StaticMethod()	{
	StaticMethod(10);
	System.out.println("3");
}
void StaticMethod(int i)	{
	System.out.println("4");
}
public static void main(String [] args){
	new StaticMethod().StaticMethod();
}
}
