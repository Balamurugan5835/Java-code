import java.util.Scanner;
class SignCheck
{
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int num=ip.nextInt();
        if(num>0)
        System.out.println("positive");
        else if (num<0)
        System.out.println("negative");
        else
        System.out.println("zero");
            
        }


    }

