import java.util.Scanner;
class Alpha
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        char ch=ip.next().charAt(0);
        if(ch>='A'&&ch<='Z')
        System.out.println("uppercase");
        else if(ch>='a'&&ch<='z')
        System.out.println("lowercase");
        else
        System.out.println("none");

        
    }
}