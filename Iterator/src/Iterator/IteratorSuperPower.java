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
public class IteratorSuperPower implements IIterator{

    private List<Aluno> alunos;
    private int cont;

    public IteratorSuperPower(List<Aluno> alunos, String objeto, String operator, double nota) {
        if (">".equals(operator)) {
            this.maior(alunos, nota);
        } else if ("<".equals(operator)) {
            this.menor(alunos, nota);
        } else if ("==".equals(operator)) {
            this.igual(alunos, nota);
        }else if (">=".equals(operator)){
            this.maiorOuIgual(alunos, nota);
        }else if ("<=".equals(operator)){
            this.menorOuIgual(alunos, nota);
        }
        
        cont = 0;
    }
    
    @Override
    public void first() {
        this.cont = 0;
    }

    @Override
    public void next() {
        this.cont++;
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
    
     
    private void maior(List<Aluno> alunos, double nota){
        for (Aluno x : alunos) {
                if (x.getNota() > nota) {
                    alunos.add(x);
                }
            }
    }
    
    private void menor(List<Aluno> alunos, double nota){
        for (Aluno x : alunos) {
                if (x.getNota() < nota) {
                    alunos.add(x);
                }
            }
    }
    
    private void maiorOuIgual(List<Aluno> alunos, double nota){
        for (Aluno x : alunos) {
                if (x.getNota() >= nota) {
                    alunos.add(x);
                }
            }
    }
    
    private void menorOuIgual(List<Aluno> alunos, double nota){
        for (Aluno x : alunos) {
                if (x.getNota() > nota) {
                    alunos.add(x);
                }
            }
    }
    
    private void igual(List<Aluno> alunos, double nota){
        for (Aluno x : alunos) {
                if (x.getNota() == nota) {
                    alunos.add(x);
                }
            }
    }
}
    
    
