public class ex03 {

    public static String reverse(String s)
    {
        StringBuilder sb = new StringBuilder();

        if(s.length() <= 1)
        {
            return s;
        }

        sb.append(reverse(s.substring(1)));
        sb.append(s.charAt(0));

        return sb.toString();
    }


    static void main() {
        System.out.println(reverse("abcde"));
    }

}
