import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        myCalculator();
    }

    public static void myCalculator() {
        System.out.println("MY CALCULATOR");
        char operator;
        double numC, numH, result;
        Scanner calcu = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        numC = calcu.nextDouble();
        System.out.println("Enter Operator: " + "(+, -, *, /)" + "(Addition, Subtraction, Multiplication, Division)");
        operator = calcu.next().charAt(0);
        System.out.println("Enter Second Number: ");
        numH = calcu.nextDouble();
        System.out.println("______________________");

        if (operator == '+') {
            result = numC + numH;
            System.out.println("the sum is:" + result);
        } else if (operator == '-') {
            result = numC - numH;
            System.out.println("the difference is:" + result);
        } else if (operator == '*') {
            result = numC * numH;
            System.out.println("the product is:" + result);
        } else if (operator == '/') {
            result = numC / numH;
            System.out.println("the quotient is:" + result);
        } else {
            System.out.println("Error");

        }
        exitContinue();
    }

    public static void exitContinue() {
        Scanner calcu = new Scanner(System.in);
        System.out.print("Exit or Continue? ");
        String choice = calcu.nextLine();
        switch (choice) {
            case "Exit":
                System.out.println("Thank you");
                break;
            case "Continue":
                myCalculator();
                break;
            default:
                System.out.println("Choose the following choices!");
                break;
        }
    }
}