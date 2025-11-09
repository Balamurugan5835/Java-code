import java.util.scanner;
 class Timesec 
{
    public static void main(string[] args)
    {
        Scanner sc=new  scanner(system.in);
        int totsec=sc.nextInt();
        int hrs=totsec/3600;
        totsec=totsec%3600;
        int min=totsec/60;
        totsec=totsec%60;
        system.out.printf("%02d Hours:%02d min:%02d sec",hrs,min,totsec);
    }
}