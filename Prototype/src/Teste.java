
import produtos.Chassi;
import produtos.Motor;
import produtos.Pneu;
import prototype.FlexibleFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alex
 */
public class Teste {

    public static void main(String[] args) {
        FlexibleFactory factory = new FlexibleFactory();
        factory.addPrototype("Chassi", new Chassi());
        factory.addPrototype("Motor", new Motor());
        factory.addPrototype("Pneu", new Pneu());
        
        Chassi chassi = (Chassi) factory.create("Chassi");
        System.out.println(chassi.toString());
    }
}
