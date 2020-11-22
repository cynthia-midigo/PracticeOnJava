import java.util.Scanner;
public class MinimumNumber
{
	public static void main(String[]args)
    {
    Scanner kb =new Scanner(System.in);
    System.out.println("Enter 3 numbers");
    double num1=kb.nextDouble();
    double num2=kb.nextDouble();
    double num3=kb.nextDouble();
    double output =minimum(num1,num2,num3);
    System.out.println("The minimum number is" + output);
    }
    public static double minimum(double t,double y,double z)
    
    {
        return Math.min(t, Math.min(y, z));
    }


}
