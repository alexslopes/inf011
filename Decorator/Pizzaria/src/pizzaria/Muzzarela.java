/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaria;

/**
 *
 * @author alex
 */
public class Muzzarela extends ToppingDecorator{
    
    public Muzzarela(Pizza newPizza) {
        super(newPizza);
        
        System.out.println("Adding Dough");
        
        System.out.println("Adding Moz");
    }
    
    
    public String getDescription(){
        return tempPizza.getDescription() + ", Muzzarela";
    }
    
    public double getCost(){
        return tempPizza.getCost() + 0.5;
    }
    
}
