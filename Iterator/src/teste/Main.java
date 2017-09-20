/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Iterator.IteratorSuperPower;
import interfaces.IIterator;
import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        alunos.add(new Aluno("Alex",'M',10));
        alunos.add(new Aluno("Mariana",'F',9));
        alunos.add(new Aluno("Flavia",'F',9.5));
        alunos.add(new Aluno("Henrique",'M',5));
        
        IIterator i = new  IteratorSuperPower(alunos, "nota","<", 7);
    
    
    while(i.hasNext()) {
        Aluno a = i.next();
    System.out.println(a.getNome());
    }
 

    }
}
