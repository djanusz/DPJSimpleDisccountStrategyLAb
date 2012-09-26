package lab1.solution;

import lab1.*;

/**
 *
 * @author jlombardo
 */
public class Socks extends Product {

    public Socks() {
        this.setDiscount(new NoDiscountStrategy());
    }

    public Socks(String partName, String partNumber, double price) {
        this.setPartName(partName);
        this.setPartNumber(partNumber);
        this.setPrice(price);
        this.setDiscount(new NoDiscountStrategy());
    }
    
}
