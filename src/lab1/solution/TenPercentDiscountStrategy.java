/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author djanusz
 */
public class TenPercentDiscountStrategy implements DiscountStrategy {
    private final double TEN_PERCENT_DISCOUNT = .10;
    
    
    @Override
    public final double getDiscountInDollars(double price) {
        return price * TEN_PERCENT_DISCOUNT;
    }
    
}
