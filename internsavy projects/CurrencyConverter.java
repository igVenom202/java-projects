import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in US Dollars: ");
        double dollars = scanner.nextDouble();

        double exchangeRate = 73.5; 

        double rupees = dollars * exchangeRate;

        System.out.println(dollars + " US Dollars is equivalent to " + rupees + " Indian Rupees.");

        scanner.close();
    }
}






