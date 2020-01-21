package fr.productTaxe.model.taxeCalculTotal;

import java.util.List;


import fr.productTaxe.model.Product;
import fr.productTaxe.model.util.MathUtils;

public class Receipt {
    private double taxeTotal =0.0; ;
    private double total= 0.0;
    private String itemDetails;

    public Receipt(List<Product> items) {

        StringBuilder itemDetails = new StringBuilder();

        for (Product item : items) {
            itemDetails.append(item.toString()).append("\n");
            taxeTotal+=item.getTaxAmount();
            total+=item.getFinalPrice();
            System.out.println("item tax amount: "+item.getTaxAmount());
        }
        System.out.println("total amount before round:" +total);
        total = MathUtils.roundOffAmount(total);
        taxeTotal = MathUtils.roundOffTax(taxeTotal);

        this.itemDetails = itemDetails.toString();
    }

    public double gettotal() {
        return total;
    }

    public double gettaxeTotal() {
        return taxeTotal;
    }

    @Override
    public String toString() {
        return "Receipt" + "\n"
                + itemDetails
                + "Sales Taxes: " + taxeTotal + "\n"
                + "Total: " + total
                +"\n*******************************\n";
    }
}
