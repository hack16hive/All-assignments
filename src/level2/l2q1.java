import java.util.*;
public class l2q1
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the perimeter of the square in cm:");
        double perimeter=sc.nextDouble();
        double side= perimeter/4.0;
        System.out.println("the length of the side is "+side+" cm whose perimeter is "+perimeter+" cm");
    }
}
