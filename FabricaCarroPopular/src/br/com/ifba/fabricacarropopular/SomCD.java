/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.fabricacarropopular;

import br.com.ifba.interfaces.ISom;

/**
 *
 * @author aluno
 */
public class SomCD implements ISom{

    @Override
    public String tocar() {
        return "Tocando som de carro popular";
    }
    
}
