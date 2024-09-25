import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(getInt(scanner),getInt(scanner),getOperation(scanner)));
        scanner.close();
    }

    public static int getInt(Scanner scanner){
        return scanner.nextInt();
    }

    public static char getOperation(Scanner scanner){
        return scanner.next().charAt(0);
    }

    public static float calc(int a,int b, char operation)
    {
        switch(operation){
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if(b == 0){
                    System.out.println("Division by zero");
                }
                return (float) a / b;
            default:
                System.out.println("Unknown operation");
                return 0;
        }
    }
}
