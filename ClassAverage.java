import java.util.Scanner;
public class ClassAverage
{
	public static void main(String[] args)
	{
		int total=0;
		int gradeCounter=0;
		while(gradeCounter<=10)
		{
		Scanner input=new Scanner(System.in);
		System.out.print("ENter grade : ");
		int grade=input.nextInt();
		total=total+grade;
		gradeCounter=gradeCounter+1;
		}
		int average=total/10;
		System.out.println("THE TOTAL IS : " + total);
		System.out.println("The average is : " +average);
}
}
