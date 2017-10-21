/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.security.auth.Subject;

/**
 *
 * @author aluno
 */
public class Professor implements Subject {

    private HashMap<String, List> alunosMap = new HashMap<>();
    private boolean state = false;

    public Professor(String key, List aluno) {
        alunosMap.put( key, aluno);
    }

    public void setState(boolean state) {
        this.state = state;
        this.Notify();
    }

    public boolean getState() {
        return this.state;
    }

    public void Adcionar(String key, List aluno) {
        alunosMap.put(key, aluno);
    }

    public void Remover(List observer) {
        alunosMap.remove(observer);
    }

    @Override
    public void Notify(String key) {
        for (Object x : alunosMap.get(key)) {
            List aluno = (List) x;
            aluno.update();
        }
    }

    }

}
