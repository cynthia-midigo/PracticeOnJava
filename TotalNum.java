import java.util.Scanner;
public class TotalNum
{
	public static void main(String[]args)
    {
    Scanner kb =new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    int num1=kb.nextInt();
    int num2=kb.nextInt();
    int total=0;
    for (int count=num1;count<=num2;count++)
    
    total+=count;
    System.out.println("The total is : " + total);
    }
}
