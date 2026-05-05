public class convert_bool_toString {
    public static String convert(boolean b){

        return String.valueOf(b);
    }
    
    public static void main(String[] args) {
        System.out.println(convert(false));
        System.out.println(convert(true));
    }
}
