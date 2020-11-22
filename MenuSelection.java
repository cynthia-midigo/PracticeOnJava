import java.util.Scanner;
public class MenuSelection
{
	public static void main(String[]args)
{
   
	Scanner kb=new Scanner(System.in);
	int choice;
	    do
	{                                                         
	System.out.println("COURSE SELECTION MENU");
	System.out.println("1. APT 3040 ");
	System.out.println("2. APT 1020 ");
	System.out.println("3. APT 3010 ");
	System.out.println("4. QUIT" );
	
	
	System.out.println("Enter your choice: ");
	choice=kb.nextInt();

	switch(choice){
    case 1:
        System.out.println("You have chosen APT 3040 ");
        break;
	case 3:
		System.out.println("You have chosen APT 1020 ");
		break;
	case 2:
		System.out.println("You have chosen APT 3010");
		break;	
	
    case 4:
        System.out.println("QUIT");
		break;	

    default:
	System.out.println("INVALID ");
    }	
 
}while(choice!=4);
}
}
