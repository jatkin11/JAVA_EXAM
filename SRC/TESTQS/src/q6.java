public class q6 {


    public static String m(int n, String s) {
        if(n< 0){
            throw new IllegalArgumentException();
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= n; i++)
        {
            sb.append(s.charAt(i%s.length()));
        }

        return sb.toString();
    }

}
