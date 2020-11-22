import java.lang.*;
public class GetTheNumber {

    public static void main(String[] args) {
	int p;
	int q;
	int n;
	int t;
        while (true) {
		//random number between 2 and 200
             p = (int) (Math.random() * (199 - 2) + 2);
            if(PrimeNumb(p)){
                System.out.println(" Random Prime P is :"+p);
                break;
            }
        }
        while(true){
            q = (int) (Math.random() * (199 - 2) + 2);
            if(PrimeNumb(q)){
                System.out.println("Random Prime Q is :"+q);
                break;
            }
        }
   	n= p* q;
     t=(p-1)*(q-1);
     System.out.println(t);

    }

    private static boolean PrimeNumb(int e) {
       int t;
       for(t=2;t<=Math.sqrt(e);t++){
           if(e % t == 0){
               return false;
           }
       }
       return true;
    }

}
