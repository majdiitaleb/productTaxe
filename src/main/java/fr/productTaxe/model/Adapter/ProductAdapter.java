package fr.productTaxe.model.Adapter;

import fr.productTaxe.model.Product;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductAdapter {

	 private static final String ITEM_ENTRY_REGEX = "(\\d+) ([\\w\\s]* )à (\\d+.\\d{2})";

    public static Product createItemFromString(String input) {
    	System.out.println(input);
        Pattern pattern = Pattern.compile(ITEM_ENTRY_REGEX);
        
        Matcher matcher = pattern.matcher(input);
        matcher.find();

        return new Product(matcher.group(1), matcher.group(2), matcher.group(3));
    }
}
