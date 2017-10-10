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
public class Aluno implements Observer{
    private Subject professor;
    private boolean state;
    
    public Aluno(Subject professor){
        this.professor = professor;
    }
    
    @Override
    public void update(){
        state = this.professor.getState();
    }
    
}
