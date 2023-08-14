import java.util.Scanner;

public class TempTool{
    public static double fahrenheitToCelcius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    public static double celciusToFahrenheit(double celcius){
        return (celcius*9/5)+32;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Tool");
        System.out.println("1. Fahrenheit To Celcius ");
        System.out.println("2. Celcius to Fahrenheit ");
        System.out.println("Enter your choice (1/2): ");

        int choice = scanner.nextInt();

        if(choice==1){
            System.out.println("Enter the temperature in Fahrenheit:");
            double fTemp = scanner.nextDouble();
            double cTemp = fahrenheitToCelcius(fTemp);
            System.out.printf("%.2f F is %.2f C%n", fTemp , cTemp);
        } else if(choice==2){
            System.out.print("Enter temperature in Celcius: ");
            double cTemp = scanner.nextDouble();
            double fTemp = celciusToFahrenheit(cTemp);
            System.out.printf("%.2f C is %.2f F%n", cTemp,fTemp);
        }else{
            System.out.println("Invalid choice. please Select 1 or 2.");
        }

        scanner.close();
    }
}