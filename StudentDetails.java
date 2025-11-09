import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String name = ip.nextLine();
        int age = ip.nextInt();
        char gen = ip.next().charAt(0);
        float cgpa = ip.nextFloat();
        ip.nextLine(); // to consume leftover newline
        String loc = ip.nextLine();
        long mob = ip.nextLong();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gen);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Location: " + loc);
        System.out.println("Mobile number: " + mob);

        ip.close();
    }
}

