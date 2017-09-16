/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.HashMap;

/**
 *
 * @author alex
 */
public class FlexibleFactory {
    private HashMap<String, IPrototype> prototypes = new HashMap<>();
    
    public boolean addPrototype(String key, IPrototype prototype){
        if(!prototypes.containsKey(key)){
            prototypes.put(key, prototype);
            return true;
        }
        return false;
    }
    
    public boolean removePrototype(String key){
        if(!prototypes.containsKey(key))
            return false;
        prototypes.remove(key);
        return true;
    }
    
    public void clear(){
        prototypes.clear();
    }
    
    public IPrototype create(String key){
        if(!prototypes.containsKey(key))
            return null;
        
        return prototypes.get(key).clone();
    }
}
