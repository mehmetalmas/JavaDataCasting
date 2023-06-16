public class IntegerToString {
    public static void main(String[] args) {

        int i = 10;
        String s;


        //1
        s = i + "";
        System.out.println(s); //10

        String str1 = s +"Hello";
        System.out.println(str1); //10Hello


        //2
        s = String.valueOf(i);
        System.out.println(s); //10

        String str2 = s +"Hello";
        System.out.println(str2); //10Hello

        //3
        s = Integer.toString(i);
        System.out.println(s); //10

        String str3 = s +"Hello";
        System.out.println(str3); //10Hello

        s = Double.toString(i);
        s = Float.toString(i);
        s = Long.toString(i);







































    }
}
