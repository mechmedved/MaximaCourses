public class returnDegree {
    public static void main(String[] args) {

        System.out.println(returnNumberInDegree(2,4));
    }
    public static int returnNumberInDegree(int number, int degree) {

        return makeNumberDegree(number, degree);
    }

    public static int makeNumberDegree(int n, int d) {
        if(d == 1){
            return n;
        }

        return n * makeNumberDegree(n, d - 1);
    }
}
