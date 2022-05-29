package HRMS_Project;

abstract class Bank{
	abstract void debit();
	abstract void credit();

}

class HDFC  extends Bank{
	public void debit()
	{
		System.out.println("HDFC Debit");
	}
	public void credit()
	{
		System.out.println("HDFC Credit");
	}
}
class ICIC extends Bank{
	public void debit()
	{
		System.out.println("ICIC debit");
	}
	public void credit()
	{
		System.out.println("ICIC Credit");
	}
}

public class Abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HDFC hf=new HDFC();
		hf.credit();
		hf.debit();
		
		ICIC ic=new ICIC();
		ic.credit();
		ic.debit();
	}

}
