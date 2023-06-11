public class WideningConversion {
    public static void main(String[] args) {
        /*
            * byte:8 bit / short:16 bit / int : 32 bit / long:64 bit
            * float:32 bit / double:64 bit

            * byte --> short : automatic conversion
            * short --> int : automatic conversion
            * char --> int : automatic conversion
            * int --> long : automatic conversion
            * float --> double : automatic conversion
            * float --> long : automatic conversion / loss of precision
            * float --> int : automatic / loss of precision
            * double --> long : automatic / loss of precision
         */


        byte b = 126;
        short s = 32767;
        int i = 2_147_483_647;
        long l = 9_223_372_03;
        float f = 3.1415926f;
        double d = 179_769_313_486_231_570E308;







    }
}
