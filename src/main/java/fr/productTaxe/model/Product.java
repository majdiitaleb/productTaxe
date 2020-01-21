package fr.productTaxe.model;

import fr.productTaxe.model.util.MathUtils;


import java.math.RoundingMode;
import java.util.stream.Stream;

public class Product {

    private String name;
    private double quantity;
    private double prixHt;
    private double taxeBase;
    private double taxeSupp;


    public Product(String quantity, String name, String prixHt) {
        this.name = name;
        this.quantity = Integer.valueOf(quantity);
        this.prixHt =Double.valueOf(prixHt);
    }

    public boolean isImported() {
        return name.contains("import");
    }
    public boolean isExempted() {
        return Stream.of( "chocolat", "pilules")
                .anyMatch(exemptedItem -> name.contains(exemptedItem));
    }
    public boolean isLivre(){
        return name.contains("livres");
    }
    public double getFinalPrice() {
      return quantity * prixHt +  MathUtils.roundOffTax(getTaxAmount());
    }
    public void setTaxeBase(double factor) {

        taxeBase = prixHt * factor;
    }

    public double getTaxAmount() {


              return  quantity * (taxeBase + taxeSupp);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", prixHt=" + prixHt +
                ", taxeBase=" + taxeBase +
                ", taxeSupp=" + taxeSupp +
                '}';
    }


    public void setTaxeSupp(double taxeSuppPercent) {

        System.out.println("taxe supp before round:" + prixHt*taxeSuppPercent);
        taxeSupp = prixHt * taxeSuppPercent;

    }
}
