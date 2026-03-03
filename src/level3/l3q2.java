import java.util.Scanner;

public class l3q2
{
    public static void main(String[] args)
    {
        System.out.println("Number of Chocolates: ");
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        System.out.println("Number of Friends: ");
        int friends = sc.nextInt();
        int remainingChocolates = chocolates % friends;
        int chocolatePerPerson = chocolates / friends;
        System.out.println("Each friend gets " + chocolatePerPerson + " chocolates and " + remainingChocolates + " chocolates are left over.");
}
}