import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        char calculate = 'a';
        do {
        double operand1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        double operand2 = scanner.nextInt();
        System.out.println(calcul(operand1, operation, operand2));
        } while (calculate != 'c');
    }

    public static double calcul(double operand1, char operation, double operand2) {
        switch (operation) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                System.out.println("error");
                return 0;
            }

        };

    }


