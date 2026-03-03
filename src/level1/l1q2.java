import java.util.Scanner;
public class l1q2
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the distance in km:");
        double km=sc.nextDouble();
        double miles= km*0.621371;
        System.out.println("The total miles is" + miles + " mile  for the given"+ km + " km");
        sc.close();
    }
}