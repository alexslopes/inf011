/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import prototype.IPrototype;

/**
 *
 * @author alex
 */
public class Chassi implements IPrototype{
    
    
    @Override
    public IPrototype clone() {
        return new Chassi();
    }
    
    public String toString(){
        return "Chassi";
    }
    
}
