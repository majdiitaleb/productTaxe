public class MainProgram {


    public static void main(String[] args){
        for (String input:args
             ) {
            System.out.println(args);

        }
    }

   /* private static void ma ProcessInput(String[] input)
    {


        var shoppringCart = ItemParser.Parse(input);

        var taxCalculator = new TaxCalculator();
        taxCalculator.Calculate(shoppringCart);

        //Discounting can be applied here!

        ShopingCartPrinter.Print(shoppringCart);
    }*/
}
