public class ex06 {

    public static long factorial(int x)
    {
        if( x <= 1 ){
            return 1;
        }

        return x * factorial(x-1);
    }

    static void main() {
        System.out.println(factorial(10));
    }

}
