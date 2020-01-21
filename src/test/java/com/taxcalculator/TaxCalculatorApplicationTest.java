package com.taxcalculator;
import fr.productTaxe.model.taxeCalculTotal.Receipt;

import org.junit.Test;
import fr.application.*;

import static org.junit.Assert.assertEquals;

/**
 * Test class for {@link TaxCalculatorApplication}
 *
 * @author ankit
 */
public class TaxCalculatorApplicationTest {

    private TaxCalculatorApplication taxCalculatorApplication = new TaxCalculatorApplication();

	
	  @Test public void test() {
	 
	  String[] inputs = {"2 livres  à 12.49", "1 CD musical à 14.99",
	  "3 barres de chocolat à 0.85"};
	 
	  Receipt receipt = taxCalculatorApplication.generateReceipt(inputs);


	  assertEquals(48.05, receipt.gettotal(), 0.0);
	  assertEquals(5.53, receipt.gettaxeTotal(), 0.0);

	 
	  }
	 

   @Test
   public void test2() {
       String[] inputs = {"2 boite de chocolat import  à 10.00", " 3 flacons de parfum import à 47.50"};


        Receipt receipt = new TaxCalculatorApplication().generateReceipt(inputs);
        //System.out.println(receipt);
        System.out.println(receipt);
       assertEquals(36.65, receipt.gettaxeTotal(), 0.0);
    assertEquals(199.15, receipt.gettotal(), 0.0);
}

   @Test
   public void test3() {
       String[] inputs = {" 2 flacons de parfum import à 27.99", " 1 flacon de parfum à 18.99","3 boites de pilules contre la migraine à 9.75","2 boites de chocolats import à 11.25"};


        Receipt receipt = new TaxCalculatorApplication().generateReceipt(inputs);
        System.out.println(receipt);
    assertEquals(18.98, receipt.gettaxeTotal(),0.0);
       assertEquals(145.7, receipt.gettotal(),0.0);
    }

 
}
