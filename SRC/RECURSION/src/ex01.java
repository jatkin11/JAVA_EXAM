public class ex01 {

    public static String buggyMethod(int n) {
        if (n <= 0) {
            return "";
            }
        return n + " " + buggyMethod(n - 2);
        }

    static void main() {
        System.out.println(buggyMethod(-1));
    }

}
