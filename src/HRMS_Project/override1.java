package HRMS_Project;

public class override1 extends override {

	public void add(int a, int b)
	{
		System.out.println(a-b);
		System.out.println("child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		override1 op=new override1();
		op.add(20, 10);
		

	}

}
