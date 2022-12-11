import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        out.println("What sort of operation would you like to do?");
        try {
            out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\nYou can either type a number or you can type the type of operation you would like to do.\n\n");
            out.print(">> ");
            var owo = scan.nextLine();
            if (owo.equalsIgnoreCase("add") || owo.equalsIgnoreCase("+") || owo.equalsIgnoreCase("addition") || owo.equalsIgnoreCase("1") || owo.equalsIgnoreCase("one")) {
                out.println("What is your first number?");
                var amogus = scan.nextLine();
                double a = Double.parseDouble(amogus);
                out.println("What is your second number?");
                var idk = scan.nextLine();
                double b = Double.parseDouble(idk);
                out.println(a + b);
            }
            if (owo.equalsIgnoreCase("subtract") || owo.equalsIgnoreCase("-") || owo.equalsIgnoreCase("minus") || owo.equalsIgnoreCase("2") || owo.equalsIgnoreCase("two")) {
                out.println("What is your first number?");
                var amogus = scan.nextLine();
                double a = Double.parseDouble(amogus);
                out.println("What is your second number?");
                var idk = scan.nextLine();
                double b = Double.parseDouble(idk);
                out.println(a - b);
            }
            if (owo.equalsIgnoreCase("multiply") || owo.equalsIgnoreCase("*") || owo.equalsIgnoreCase("multiplication") || owo.equalsIgnoreCase("3") || owo.equalsIgnoreCase("three")) {
                out.println("What is your first number?");
                var amogus = scan.nextLine();
                double a = Double.parseDouble(amogus);
                out.println("What is your second number?");
                var idk = scan.nextLine();
                double b = Double.parseDouble(idk);
                out.println(a * b);
            }
            if (owo.equalsIgnoreCase("divide") || owo.equalsIgnoreCase("/") || owo.equalsIgnoreCase("division") || owo.equalsIgnoreCase("4") || owo.equalsIgnoreCase("four")) {
                out.println("What is your first number?");
                var amogus = scan.nextLine();
                double a = Double.parseDouble(amogus);
                out.println("What is your second number?");
                var idk = scan.nextLine();
                double b = Double.parseDouble(idk);
                out.println(a / b);
            } else {
                out.println("I didn't seem to quite understand what you were trying to do.\nPlease enter an operation of numbers (1, 2, 3, 4), symbols (e.x +, -, /, *), the word form (e.x division, divide, multiply, subtract, add) or the word form of the number (e.x one, two, three, four).");
            }
        } catch (Exception e) {
            out.println(e.getMessage());
        }
    }
}