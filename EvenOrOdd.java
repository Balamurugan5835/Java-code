import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        long num=ip.nextLong();
        if(num%2==0)
        {
            System.out.println( "even");
        
        }
        else{
            System.out.println("odd");
        }
        ip.close();
    }
    
}
