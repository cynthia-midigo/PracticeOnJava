//Adhiambo Cynthia Midigo - 658390

import java.util.Scanner;
public class SwimmingSchedule
{
	public static void main(String[]args)
{
	Scanner kb=new Scanner(System.in);
	int myDay;
	                                                            
	System.out.println("Swimming Schedule");
	System.out.println("1. Monday ");
	System.out.println("2. Tuesday ");
	System.out.println("3. Wednesday ");
	System.out.println("4. Thursday" );
	System.out.println("5. Friday" );
	System.out.println("6. Saturday ");
	System.out.println("7. Sunday ");
	
	System.out.println("Select a day to know which age group can swim");
	myDay=kb.nextInt();

	switch(myDay){
	//case 1:
	//case 3:
		//System.out.println("Sorry There is No swimming today ");
		//break;
	case 2:
		System.out.println("Teenages can swim today ");
		break;	
	
	case 4:
		System.out.println("Young Adults can swim today  ");
		break;	
	case 5:
		System.out.println("Today is Adults day");
		break;	
	case 6:
		System.out.println("Today is children day ");
		break;	
	default:
	System.out.println("Sorry There is No swimming today ");
	}		
}
}
