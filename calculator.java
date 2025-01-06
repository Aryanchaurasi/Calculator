import java.util.*;
public class calculator
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the calculator");
		int num1 = sc.nextInt();
         	int num2 = sc.nextInt();
         	int num3 = sc.nextInt();
		int AdditionAnswer = Addition(num1 , num2 , num3);
		System.out.println("Addition of Number is :"+ AdditionAnswer);
	}
	private static int Addition(int n1 , int n2 , int n3)
    	{
		return n1 + n2 + n3 ;
    	}
}