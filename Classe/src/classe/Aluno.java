/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author aluno
 */
public class Aluno implements Observer{
    private Observable professor;
    private boolean state;
    
    public Aluno(Observable professor){
        this.professor = professor;
    }
    
    public boolean observerState() {
        return this.state;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.state = this.professor.getState();
    }

    
}
