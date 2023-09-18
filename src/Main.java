public class Main
{
    public static void main(String[] args)
    {
        double salesTax = 1.05;
        double itemCost = 20;
        double totalCost = 0;

        totalCost = salesTax * itemCost;
        System.out.println("The cost before sales tax is " + itemCost);
        System.out.println("The total cost including sales tax is " + totalCost);

    }
}