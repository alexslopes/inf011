/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author aluno
 */
public interface Subject {
    public void Adcionar(Observer observer);
    
    public void Remover(Observer observer);
    
    public void Notify();
}
