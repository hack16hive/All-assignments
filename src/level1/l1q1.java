public class l1q1 {
    public static void main(String[] args)
    {
        int fee=125000;
        double discountPercent=0.10;
        double discount=fee*discountPercent;
        double discountAmount=fee-discount;
        System.out.println("The discount amount is INR " + discount+ " and the discounted fee is INR " + discountAmount);
    }
}
