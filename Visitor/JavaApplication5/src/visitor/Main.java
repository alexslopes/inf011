package visitor;


import element.Aluno;
import element.Funcionario;
import element.IElement;
import element.Professor;
import java.util.ArrayList;
import java.util.List;
import visitor.Visitor;
import visitor.VisitorAluno;
import visitor.VisitorFuncionario;
import visitor.VisitorProfessor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        List<IElement> elements = new ArrayList<>();
        IElement alex = new Aluno(10);
        IElement andreus = new Aluno(10);
        IElement flavio = new Aluno(10);
        elements.add(alex);
        elements.add(andreus);
        elements.add(flavio);
        
        IElement marcelo = new Professor(10);
        IElement gustavo = new Professor(10);
        IElement paulo = new Professor(10);
        elements.add(marcelo);
        elements.add(gustavo);
        elements.add(paulo);
        
        IElement plinio = new Funcionario(10);
        IElement rafael = new Funcionario(10);
        IElement matheus = new Funcionario(10);
        elements.add(plinio);
        elements.add(rafael);
        elements.add(matheus);
        
        List<Visitor> visitors = new ArrayList<>();
        Visitor va = new VisitorAluno();
        Visitor vp = new VisitorProfessor();
        Visitor vf = new VisitorFuncionario();
        
        visitors.add(va);
        visitors.add(vp);
        visitors.add(vf);
        
        for(IElement element : elements){
            for(Visitor visitor : visitors)
                element.Accept(visitor);
        }
        
        
    }
}
