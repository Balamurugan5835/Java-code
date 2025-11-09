import java.util.Scanner;
class refresh
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("enter the item ");
        long dec=ip.nextLong();
        System.out.println("Enter gift item Exp:");
        long gift=ip.nextLong();
        System.out.println("Enter refreshment Exp:");
        long ref=ip.nextLong();
        double tot=(dec+gift+ref);
        double gp=(gift);

        
    }
}

