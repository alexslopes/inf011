/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Professor implements Subject{
    private List<Observer> alunosINF011;
    private List<Observer> alunosINF012;
    private HashMap<String, List> alunosMap = new HashMap<>();
    private boolean state;
    
    public Professor(){
        alunosINF012 = new ArrayList<Observer>();
        alunosINF011 = new ArrayList<Observer>();
        alunosMap.put("inf011", alunosINF011);
        alunosMap.put("inf012", alunosINF011);
    }
    
    public void setState(boolean state){
        this.state = state;
        this.NotifyINF011();
    }
    
    public boolean getState(){
        return this.state;
    }

    @Override
    public void AdcionarINF011(Observer observer) {
        alunosINF011.add(observer);
    }

    @Override
    public void RemoverINF011(Observer observer) {
        alunosINF011.remove(observer);
    }

    @Override
    public void AdcionarINF012(Observer observer) {
        alunosINF012.add(observer);
    }

    @Override
    public void RemoverINF012(Observer observer) {
        alunosINF012.remove(observer);
    }

    @Override
    public void NotifyINF011() {
        for(Object x : alunosMap.get("inf011")){
            Observer aluno = (Observer) x;
            aluno.update();
        }
    }

    @Override
    public void NotifyINF012() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
