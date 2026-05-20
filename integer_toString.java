public class integer_toString {

    public static String numberTostring(int num){

        return Integer.toString(num);
    }

    public static void main(String[] args) {

        int num = 123;
        String res = numberTostring(num);
        System.out.println(res);
    }
}