import java.util.Scanner;

public class CelsiusToFahrenheit_group_4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        boolean conversion = true;

    /*The while true loop is used to continuously prompt the user for
    temperature conversions until the user explicitly chooses to stop
    by entering "no" when asked if they want to make another conversion*/

        while (conversion) {
            // Prompt the user to enter temperature in Celsius
            System.out.print("Enter temperature in Celsius: ");
            double celsius = x.nextDouble();

            // formula that Convert Celsius to Fahrenheit
            double fahrenheit = (celsius * 9/5)+32;

            // Display the result
            System.out.println(celsius + " in celcius equals: " + fahrenheit + " in fahrenheit.");

            // Ask if the user wants to make another conversion
            System.out.print("Do you want to make another conversion? (yes/no): ");
            String choice = x.next();

            // Check user's choice and break the loop if they choose "no", if the user chooses yes, the program will restart.
            if (!choice.equalsIgnoreCase("yes")) {
                conversion = false;   // Set conversion to false to exit the loop and end the program if user chooses no.
            }
        }
    }
}

