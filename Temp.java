import java.util.Scanner;
public class Temp
{
public static void main(String [] args)
{
Scanner input = new Scanner(System.in);
	int temp;
	
System.out.print("Enter Weight in Kilogram : ");
temp=input.nextInt();


if(temp>30)
{
	System.out.println("Too hot");
}
else if (temp>25)
{
	System.out.println("Pleasant");
}
else if(temp>20)
{
	System.out.println("cool");
}
else
{
	System.out.println("Too cold");
}
}
}
	
