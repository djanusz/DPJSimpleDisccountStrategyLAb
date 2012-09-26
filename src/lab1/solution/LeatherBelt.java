package lab1.solution;

import lab1.*;

/**
 *
 * @author jlombardo
 */
public class LeatherBelt extends Product {

    public LeatherBelt() {
        this.setDiscount(new FifteenPercentDiscountStrategy());
    }

    public LeatherBelt(String partName, String partNumber, double price) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        this.setDiscount(new FifteenPercentDiscountStrategy());
    }
    
//    @Override
//    public double getDiscountInDollars() {
//        return this.getPrice() * .15;
//    }

}
