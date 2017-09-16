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
public class Decorator implements Component{
    Component player;

    public Decorator(Component component){
        player = component;
    }
    
    public void desenhar(){
        player.desenhar();
    }
}
