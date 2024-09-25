public class Task3 {
    public static void main(String[] args) {
        System.out.println(returnMinimalNumber(3,7));
    }
    public static int returnMinimalNumber(int number,int number1) {
        if(number < number1){
            return number;
        }
        return number1;
    }
}
