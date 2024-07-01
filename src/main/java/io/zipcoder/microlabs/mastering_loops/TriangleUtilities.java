package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String s = "";
        for (int i = 1; i < numberOfRows; i++){ // i needs to equal 1 - if =0, then nothing will print
            s += getRow(i);
            s += "\n";
        }
        return s;
    }
//Call getRows()
    public static String getRow(int numberOfStars) {
        String s = "";
      for (int i = 0; i < numberOfStars; i++){
          s = s += "*";
      }
        return s;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {


        return getTriangle(10);
    }
}
