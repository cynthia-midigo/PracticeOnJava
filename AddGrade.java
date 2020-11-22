import java .util.Scanner;
public class AddGrade
{
	public static void main(String[]args)
{
	Scanner input=new Scanner(System.in);
        int total=0;
	int gradeCounter=1;
	int grade=0;

        System.out.print("Enter the grade or -1 to quit  :");
	grade=input.nextInt();
        
        
        while(grade!=-1)
	{
        total=total+grade;
	gradeCounter=gradeCounter+1;

        System.out.print("Enter the grade or -1 to quit:");
	grade=input.nextInt();
         }
	System.out.print("The total of grades  : " +gradeCounter + "\n");
	System.out.println("Average" + (total/gradeCounter));
        
		

}
}
