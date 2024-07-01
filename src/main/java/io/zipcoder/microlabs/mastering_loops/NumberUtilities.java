package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String s = "";
        for (int i = start; i < stop; i = i + 1) {
            if (isEven(i) == true) {
                s = s + Integer.toString(i);
                // String.valueOf(i) same thing^^
            }
        }
            return s;
    }

        //   ( i % 2 == 0) if true, i is even
    static boolean isEven(int i){
            return (i % 2 == 0);
        }



    public static String getOddNumbers(int start, int stop) {
         String s = "";
        for (int i = start; i < stop; i = i + 1) {
            if (isEven(i) == false) {
                //if ( !isEven(i)){ //same thing^^
                s = s + Integer.toString(i);
                // String.valueOf(i) same thing^^
            }
        }
        return s;
    }


    public static String getSquareNumbers(int start, int stop, int step) {

        return getExponentiations(start, stop, step, 2);
    }


    // this should be stop, not start
    //changed from start to stop
    public static String getRange(int stop) {


        return  getExponentiations(0, stop, 1, 1);
//        String s = "";
////        String expected = "01234";
////        int stop = 5;
////        Given an integer, stop, return a String concatenation of all integers between 0 up to and not including stop.
//        for (int i = 0; i < stop; i = i + 1 ){
//            s = s + Integer.toString(i);
//        }
//        return s;
    }

    public static String getRange(int start, int stop) {
//        String s = "";
//
//        for (int i = start; i < stop; i = i + 1 ) {
//            s = s + Integer.toString(i);
//        }
//        return s;

        return getExponentiations(start, stop, 1, 1);  //step = 1 step up by one
        }


    public static String getRange(int start, int stop, int step) {
//        String s = "";
//
//        for (int i = start; i < stop; i = i + step) {
//            s = s + Integer.toString(i);
//        }
//        return s;

        return getExponentiations(start, stop, step, 1); //any power raised to '1' is itself
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        //need to get this right and rest will be right
        String s = "";

        for (int i = start; i < stop; i = i + step) {
            s = s + Integer.toString((int)Math.pow(i, exponent));
        }
        return s;
//        return null;
    }
}
