/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import model.Aluno;

/**
 *
 * @author aluno
 */
public interface IIterator {
    void first();
    
    Object next();
    
    boolean isDone();
    
    boolean hasNext();
    
    Object currentItem();
}
