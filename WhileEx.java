import java.util.Scanner;
public class WhileEx
{
	public static void main(String[]args)
{
    int total=0;
	int counter=1;
	while(counter<=10)
{	System.out.println(counter+ " ");
       counter +=1;
       total=counter + total;
}
    System.out.println("The total is : " + total);

}
}