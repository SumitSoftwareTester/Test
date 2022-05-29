package HRMS_Project;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number:- ");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		do
		{
			if (i%2==0)
			{
				System.out.println("print odd:-"+i);
			}
			i++;
		}
		while(i<=25);
	}

}
