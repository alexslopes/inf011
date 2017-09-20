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
public class IteratorMeninas implements IIterator{
    private List<Aluno> meninas;
    private int cont;
    
    public IteratorMeninas(List<Aluno> alunos) {
        for(Aluno x : alunos)
            if(x.getGenero() == 'F')
                meninas.add(x);
        
        cont = 0;
    }

    @Override
    public void first() {
        cont = 0;
    }

    @Override
    public Object next() {
        cont++;
        return null;
    }

    @Override
    public boolean isDone() {
        return cont == meninas.size();
    }

    @Override
    public Aluno currentItem() {
        if (isDone()) {
            cont = meninas.size() - 1;
        }else if(cont < 0){
            cont = 0;
        }
        return meninas.get(cont);
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
