public class WideningConversion {
    public static void main(String[] args) {
        /*
            windening conversion:
            byte:8 bit / short:16 bit / int:32 bit / long:64 bit / float:32 bit / double:64 bit
                         char :16 bit

            * sadece atama yapilir, java otamatik cevirim yapar

            * byte --> short    : byte short atama yapilir, automatic conversion
            * short --> int     :  short int atama yapilir, automatic conversion
            * char --> int      :  char int atama yapilir, automatic conversion
            * int --> long      :  int long atama yapilir, automatic conversion
            * long --> float    :  long float atama yapilir, automatic conversion
            * float --> double  :  float double atama yapilir, automatic conversion
            * long --> double   :  long double atama yapilir, automatic conversion


            * byte b = Byte.MAX_VALUE;
            * short s = Short.MAX_VALUE;
            * int i = Integer.MAX_VALUE;
            * long l = Long.MAX_VALUE;
            * float f = Float.MAX_VALUE;
            * double d = Double.MAX_VALUE;
         */

        byte byteType = 10;
        short shortType; char charType = 'a';
        int intType;
        long logType;
        float floatType;
        double doubleType;

        shortType = byteType; intType = byteType;  logType = byteType;  floatType = byteType;   doubleType = byteType;  // byte
                              intType = shortType; logType = shortType; floatType = shortType;  doubleType = shortType; // short
                              intType = charType;  logType = charType;  floatType = charType;   doubleType = charType;  // char
                                                   logType = intType;   floatType = intType;    doubleType = intType;   // int
                                                                        floatType = logType;    doubleType = logType;   // log
                                                                                                doubleType = floatType; // float



        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.4028235E38f;
        double d = 1.7976931348623157E308;

        s = b;
        l = i;

        f = i;
        System.out.println(i);         // 2_147_483_647
        System.out.println(f);         // 2_147_483_65E9  !!!

        l = 111_222_333_444_555_666L;
        f = l;                         // long = 64 bit / float = 32 bit
        System.out.println(l);         // 111_222_333_444_555_666
        System.out.println(f);         // 111_222_336_E17 : Loss of precision

        d = l;                         // double = 64 bit / long = 64 bit
        System.out.println(l);         // 111222333444555666
        System.out.println(d);         // 111222333444555664E17  !!!

        d = f;
        System.out.println(f);         // 111222336E17
        System.out.println(d);         // 111222335658262528E17 !!!











    }
}
