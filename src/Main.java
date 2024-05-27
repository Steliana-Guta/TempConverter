import java.util.Scanner;

class TempConv {
    TempConv() {}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type in a temperature in degrees F for the transfer: ");
        String input = scan.nextLine();
        double fahrenheitTemp = Double.parseDouble(input);
        double celsiusTemp = (fahrenheitTemp - 32.0) * 5.0 / 9.0;
        System.out.println("This temperature in degrees C is: " + celsiusTemp);
    }
}