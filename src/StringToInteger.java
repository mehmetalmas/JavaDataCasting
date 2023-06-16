public class StringToInteger {
    public static void main(String[] args) {

        int i;
        String s = "20";



        //1
        i = Integer.parseInt(s);
        System.out.println(i);

       //2
        i = Integer.valueOf(s);
        System.out.println(i);



        double d;
        d = Double.parseDouble(s);
        d = Double.valueOf(d);

        float f;
        f = Float.parseFloat(s);
        f = Float.valueOf(f);

        long l;
        l = Long.parseLong(s);
        l = Long.valueOf(l);






    }
}
