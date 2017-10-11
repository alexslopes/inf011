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
public class Professor implements Subject {

    private List<IObserver> alunosINF011;
    private List<IObserver> alunosINF012;
    private HashMap<String, List> alunosMap = new HashMap<>();
    private boolean state = false;

    public Professor() {
        alunosINF012 = new ArrayList<IObserver>();
        alunosINF011 = new ArrayList<IObserver>();
        alunosMap.put("inf011", alunosINF011);
        alunosMap.put("inf012", alunosINF011);
    }

    public void setState(boolean state) {
        this.state = state;
        this.NotifyINF011();
        this.NotifyINF012();
    }

    public boolean getState() {
        return this.state;
    }

    @Override
    public void AdcionarINF011(IObserver observer) {
        alunosINF011.add(observer);
    }

    @Override
    public void RemoverINF011(IObserver observer) {
        alunosINF011.remove(observer);
    }

    @Override
    public void AdcionarINF012(IObserver observer) {
        alunosINF012.add(observer);
    }

    @Override
    public void RemoverINF012(IObserver observer) {
        alunosINF012.remove(observer);
    }

    @Override
    public void NotifyINF011() {
        for (Object x : alunosMap.get("inf011")) {
            IObserver aluno = (IObserver) x;
            aluno.update();
        }
    }

    @Override
    public void NotifyINF012() {
        for (Object x : alunosMap.get("inf012")) {
            IObserver aluno = (IObserver) x;
            aluno.update();
        }
    }

}
