import java.util.Scanner;

public class Main {
    public static void calc(String input);
    String[] elements = input.split(" ");{
        if (elements.length != 3) {
            return "throws Exception";
        }
// Переместил объявление класса main внутрь метода main
        class Calculator {
            static String calc(String input) {
                String[] parts = input.split(" ");
                if (parts.length != 3) {
                    try {
                        int a = Integer.parseInt(elements[0]);
                        int b = Integer.parseInt(elements[2]);
                        String operator = elements[1];
                        int result = 0;
                        switch (operator) {
                            case "+":
                                result = a + b;
                                break;
                            case "-":
                                result = a - b;
                                break;
                            case "*":
                                result = a * b;
                                break;
                            case "/":
                                result = a / b;
                                break;
                            default:
                                return "throws Exception";
                        }
                        return Integer.toString(result);
                    } catch (NumberFormatException | ArithmeticException e) {
                        return "throws Exception";
                    }
                }
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    String input = scanner.nextLine();
                    System.out.println(calc(input));
                    scanner.close();
                }
