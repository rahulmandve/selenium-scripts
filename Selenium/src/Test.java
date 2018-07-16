class BB
{
	public void m1()
	{
		System.out.println("BB m1 method");
	}
	public void m()
	{
		System.out.println("BB m2 method");
	}
}
	


public class Test extends BB
{
	public void m1()
	{
		System.out.println("aa M1");
	}
	
	public void m2()
	{
		System.out.println("aa m2");
		}
	public static void main(String[] args) 
	{
	BB b=new BB();
			BB bb=new Test();
			bb.m1();
			bb.m();
		
		}

}