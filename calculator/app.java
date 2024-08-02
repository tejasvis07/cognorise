import java.util.*;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operation: [+,-,*,/]");
        char op = sc.next().charAt(0);

        System.out.println("Enter 1st Number");
        double num1 = sc.nextDouble();

        System.out.println("Enter 2nd Number");
        double num2 = sc.nextDouble();

        double sum = 0;
        switch (op) {
            case '+':
                sum = num1 + num2;
                break;
            case '-':
                sum = num1 - num2;
                break;
            case '*':
                sum = num1 * num2;
                break;

            case '/':
                sum = num1 / num2;
                break;
            default:
                System.out.println("Sorry invalid operation");
                break;
        }
        System.out.println("The Final output: ");
        System.out.println(num1 + " " + op + " " + num2 + " = " + sum);

    }
}