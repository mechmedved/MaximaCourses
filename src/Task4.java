public class Task4 {
    public static void main(String[] args){
        System.out.println(makeSumDerivatives(2,3));
    }

    public static int makeNumberDegree(int n, int d){
        if(d == 1){
            return n;
        }
        return n * makeNumberDegree(n, d - 1);
    }

    public static int makeSumDerivatives(int n, int d){
        return makeNumberDegree(n, d) + makeNumberDegree(n, d);
    }
}
