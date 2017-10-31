/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package element;

import visitor.Visitor;

/**
 *
 * @author aluno
 */
public interface IElement {
    
    void Accept(Visitor v);

}
