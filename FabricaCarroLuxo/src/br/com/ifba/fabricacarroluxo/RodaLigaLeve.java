/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.fabricacarroluxo;

import br.com.ifba.interfaces.IRoda;

/**
 *
 * @author aluno
 */
public class RodaLigaLeve implements IRoda{

    @Override
    public String alinhar() {
        return "Alinhando roda de carro de luxo";
    }
    
}
