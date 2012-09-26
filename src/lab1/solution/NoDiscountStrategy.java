/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author djanusz
 */
public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public final double getDiscountInDollars(double price) {
        return price;
    }
    
}
