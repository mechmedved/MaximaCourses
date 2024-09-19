import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(calc(getInt(),getInt(),getOperation()));
    }

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static char getOperation(){
        Scanner scanner = new Scanner(System.in);
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
                return (float) a / b;
            default:
                System.out.println("Unknown operation");
                return 0;
        }
    }
}
