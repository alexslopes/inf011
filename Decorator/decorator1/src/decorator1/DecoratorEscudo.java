/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator1;

/**
 *
 * @author alex
 */
public class DecoratorEscudo extends Decorator{
    
    public DecoratorEscudo(Component component) {
        super(component);
    }
    
     @Override
    public void desenhar() {
        System.out.println("DecoratorEscudo");
    }
}
