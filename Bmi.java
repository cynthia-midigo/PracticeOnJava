import java.util.Scanner;
public class Bmi
{
public static void main(String [] args)
{
Scanner input = new Scanner(System.in);
	double wInKg;
	double hInM;
	double BMI;
System.out.print("Enter Weight in Kilogram : ");
wInKg=input.nextDouble();

System.out.print("Enter Height in Meter : ");
hInM=input.nextDouble();
BMI =wInKg/(hInM*hInM);
if(BMI<18.5)
{
	System.out.println("UnderWeight");
}
else if (BMI<25)
{
	System.out.println("Normal");
}
else if(BMI<30)
{
	System.out.println("Overweight");
}
else
{
	System.out.println("Obese");
}
}
}
	
