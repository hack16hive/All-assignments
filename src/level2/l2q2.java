import java.util.*;
public class l2q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base of the triangle in cm:");
        double base=sc.nextDouble();
        System.out.println("enter the height of the triangle in cm:");
        double height=sc.nextDouble();
        double area=0.5*base*height;
        System.out.println("the area of the triangle in sq cm is "+area+" cm^2");
    }
}