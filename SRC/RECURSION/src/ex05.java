public class ex05 {

    public static long pow(int b, int p){
        if(p<0)
        {
            throw new IllegalArgumentException();
        }

        if(p==0)
        {
           return 1;
        }

        return b * pow(b, p-1);

    }

    static void main() {
        System.out.println(pow(2,3));
    }
}
