/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.fabricacarropopular;

import br.com.ifba.interfaces.IMotor;

/**
 *
 * @author aluno
 */
public class MotorV6 implements IMotor{

    @Override
    public String ligar() {
        return "Ligando motor de carro popular";
    }
}
