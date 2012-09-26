package lab1.solution;

import lab1.*;

/**
 *
 * @author jlombardo
 */
public class BaseballHat extends Product {
    
 
    public BaseballHat() {
        this.setDiscount(new TenPercentDiscountStrategy());
    }

    public BaseballHat(String partName, String partNumber, double price) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
         this.setDiscount(new TenPercentDiscountStrategy());
    }
    
    
    
//    @Override
//    public double getDiscountInDollars() {
//        return this.getPrice() * .10;
//    }

}
