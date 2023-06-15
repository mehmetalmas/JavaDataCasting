public class NarrowingConversion {
    public static void main(String[] args) {

        /*
            Narrowing Conversion:
           double:64 bit / float:32 bit / long:64 bit / int:32 bit / char :16 bit / short:16 bit / byte:8 bit


            * cast operatörü "()" kullanilmali, java otamatik cevirim YAPMAZ
            java da dogal sayiler hafizada int tipinde tutulur (int ve altindaki degerler)

            * byte b = Byte.MAX_VALUE;
            * short s = Short.MAX_VALUE;
            * int i = Integer.MAX_VALUE;
            * long l = Long.MAX_VALUE;
            * float f = Float.MAX_VALUE;
            * double d = Double.MAX_VALUE;
         */

        byte byteType = 10;

        short shortType = 32767;
        short shortType2 = 127;

        char charType = 65;

        int intType = 2147483647;

        long logType = 9223372036854775807L;
        long logType2 = 2147483646;

        float floatType = 111222333.123456f;

        double doubleType = 111222333444555666777888999.123456789101112131415;

        byteType = (byte) shortType;
        System.out.println(byteType); // -1
        byteType = (byte) shortType2;
        System.out.println(shortType2); // 127



        shortType = (short) intType;
        System.out.println(shortType); // -1

        intType = (int) logType;
        System.out.println(intType); // -1
        intType = (int) logType2;
        System.out.println(intType); // 2147483646

        logType = (long) floatType;
        System.out.println(logType); // 111222336

        // floatType f =  3.14;  Compiler error
        floatType = (float) 3.14;
        floatType = 3.24f;

        floatType = (float) doubleType;
        System.out.println(floatType); //11122234E26

        logType = (long) doubleType;
        System.out.println(logType); // 9223372036854775807

        byte b = 0;
        short s = 1000;
        char c;
        int i = -100;
        long l = 10_000_000_000_000L;
        float f = 65.5541233F;
        double d = 98.014353495485483;

        b = (byte) s;

        i = (int) l;
        i = (int) d;
        i = (int) f;

        l = (long) f;

        f = (float) d;

        i=65;
        c = (char) i;

        i = -i;

        byte b1 = -10;
        char c1 = (char) b1;





































    }
}
