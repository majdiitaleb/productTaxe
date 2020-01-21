package fr.application;

import fr.productTaxe.model.Product;
import fr.productTaxe.model.factory.ProductFactory;
import fr.productTaxe.model.taxeCalculTotal.Receipt;

import java.util.List;

public class TaxCalculatorApplication {

    public Receipt generateReceipt(String[] inputs) {
        List<Product> items = ProductFactory.from(inputs);
        return new Receipt(items);
    }
}
