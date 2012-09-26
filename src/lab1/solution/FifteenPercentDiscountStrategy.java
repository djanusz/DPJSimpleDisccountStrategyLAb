/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author djanusz
 */
public class FifteenPercentDiscountStrategy implements DiscountStrategy {
    private final double FIFTEEN_PERCENT_DISCOUNT = 0.15;
    
    @Override
    public final double getDiscountInDollars(double price) {
        return price * FIFTEEN_PERCENT_DISCOUNT;
    }
    
}
 