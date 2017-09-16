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
public class Player implements Component {

    @Override
    public void desenhar() {
        System.out.println("Player");
    }

}
