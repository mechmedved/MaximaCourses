import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(makeNumberDegree(number));
        scanner.close();
    }
    public static int makeNumberDegree(int number){
        return number * number * number;
    }
}
