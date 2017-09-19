/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import interfaces.IIterator;
import java.util.List;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class IteratorPorSexo implements IIterator{

    private List<Aluno> alunos;
    private int cont;
    
    public IteratorPorSexo(List<Aluno> alunos, char genero) {
        for(Aluno x : alunos)
            if(x.getGenero() == genero)
                alunos.add(x);
        
        cont = 0;
    }
    
    @Override
    public void first() {
        this.cont = 0;
    }

    @Override
    public void next() {
        this.cont ++;
    }

    @Override
    public boolean isDone() {
        return this.cont == alunos.size();
    }

    @Override
    public Aluno currentItem() {
        if (isDone()) {
            cont = alunos.size() - 1;
        } else if (cont < 0) {
            cont = 0;
        }
        return alunos.get(cont);
    }
    
}
