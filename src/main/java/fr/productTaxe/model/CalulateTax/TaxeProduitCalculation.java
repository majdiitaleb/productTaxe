package fr.productTaxe.model.CalulateTax;

import java.math.BigDecimal;

import fr.productTaxe.model.Product;

public class TaxeProduitCalculation {


    private static final double TAXE_LIVRE = 0.1;
    private static final double TAXE_AUTRE =0.2;
    private static final double TAXE_SUPP = 0.05;

    public static void applyTaxes(Product item) {
        if (!item.isExempted()) {
            if(item.isLivre()){
                item.setTaxeBase(TAXE_LIVRE);
            }else
            item.setTaxeBase(TAXE_AUTRE);
        }

        if (item.isImported()) {
            item.setTaxeSupp(TAXE_SUPP);
        }


    }
}
