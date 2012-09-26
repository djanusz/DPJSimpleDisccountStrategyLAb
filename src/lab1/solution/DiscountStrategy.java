/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solution;

/**
 *
 * @author djanusz
 */
public interface DiscountStrategy {
    public abstract double getDiscountInDollars(double price);
}
