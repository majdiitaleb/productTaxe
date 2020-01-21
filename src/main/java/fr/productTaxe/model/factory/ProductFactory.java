package fr.productTaxe.model.factory;

import fr.productTaxe.model.Adapter.ProductAdapter;
import fr.productTaxe.model.CalulateTax.TaxeProduitCalculation;
import fr.productTaxe.model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductFactory {

    public static List<Product> from(String[] inputs) {
        return Arrays.stream(inputs)
                .map(ProductFactory::from)
                .collect(Collectors.toList());
    }

    private static Product from(String input) {
        Product item = ProductAdapter.createItemFromString(input);
        TaxeProduitCalculation.applyTaxes(item);
        return item;
    }


}
