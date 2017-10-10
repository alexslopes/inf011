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
    public void AdcionarINF011(Observer observer);
    
    public void RemoverINF011(Observer observer);
    
    public void AdcionarINF012(Observer observer);
    
    public void RemoverINF012(Observer observer);
    
    public void NotifyINF011();
    
    public void NotifyINF012();
    
    public boolean getState();
}
