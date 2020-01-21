package fr.productTaxe.model.util;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtils {



    public static double roundOffTax(double number) {

       /* System.out.println("number taxe off " +number);

        BigDecimal bd= roundA(new BigDecimal(number),new BigDecimal(0.05),RoundingMode.UP);
        System.out.println( "new round method " +bd.doubleValue());
     return bd.doubleValue();*/
      // return Math.round(number * 20.0) / 20.0;
        return  Math.round(number * 100.0 /5.0) * 5.0 / 100.0;
        //  return  ((double) (long) (number * 20 + 0.5)) / 20;

    }

    public static double roundOffAmount(double number) {

        System.out.println("number taxe off " +number);
        // return Math.ceil(number+0.05 / 0.05) * 0.05;
       // return bd.doubleValue();
       // System.out.println( "new round method " +bd.doubleValue());
        //return bd.doubleValue();
    // return Math.round(number * 100.0 /5.0)*5.0 / 100.0;
       // return  ((double) (long) (number * 100 + 0.5)) / 100;
      return  Math.round(number * 1000.0 /5.0) * 5.0 / 1000.0;
       // return Math.round(number * 1000.0) / 1000.0;
    }



}
