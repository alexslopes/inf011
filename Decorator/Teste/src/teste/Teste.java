/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import decorator.Decorator;
import decoratorCapacete.DecoratorCapacete;
import decoratorEscudo.DecoratorEscudo;
import decoratorEspada.DecoratorEspada;
import primitivo.Player;

/**
 *
 * @author alex
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Decorator decorator = new DecoratorEscudo(new DecoratorEspada(new DecoratorCapacete(new Player())));
        decorator.desenhar();
    }
    
}
