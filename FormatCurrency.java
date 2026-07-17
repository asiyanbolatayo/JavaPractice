import java.text.NumberFormat;
import java.util.Scanner;

public class FormatCurrency {
    public static void main(String[] args) {
        String result = NumberFormat.getCurrencyInstance().format(1234567.890);
        String result2 = NumberFormat.getCurrencyInstance().format(12345678.24);
        String percentageResult = NumberFormat.getPercentInstance().format(0.75);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(percentageResult);
        scannerInput();
    }

    public static void scannerInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");
    }
}