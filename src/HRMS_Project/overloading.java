package HRMS_Project;

public class overloading {
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloading op=new overloading();
		op.add(12, 34);
		op.add(21, 3, 4);
	}

}
