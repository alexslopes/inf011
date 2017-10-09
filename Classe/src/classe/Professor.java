/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.List;

/**
 *
 * @author aluno
 */
public class Professor implements Subject{
    private List<Observer> alunos;
    private boolean state;
    
    public boolean setState(boolean state){
        this.state = state;
        this.Notify();
        return this.state;
    }

    @Override
    public void Adcionar(Observer observer) {
        alunos.add(observer);
    }

    @Override
    public void Remover(Observer observer) {
        alunos.remove(observer);
    }

    @Override
    public void Notify() {

    }
}
