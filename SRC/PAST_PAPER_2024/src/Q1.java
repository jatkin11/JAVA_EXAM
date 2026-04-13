public class Q1 {

    public static long m(int e, Obtainer f)
    {
        while(true){
            long value = f.obtain(e);
            if(value > Integer.MAX_VALUE)
            {
                return value;
            }
        }
    }
}

