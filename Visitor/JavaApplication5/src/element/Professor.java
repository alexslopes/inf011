/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package element;

import visitor.Visitor;


/**
 *
 * @author aluno
 */
public class Professor implements IElement{
    private double salario;
    
    public Professor(double salario){
        this.setSalario(salario);
    }
    
    @Override
    public void Accept(Visitor v) {
        v.VisitConcretelementProfessor(this);
    }

    public void setSalario(double d) {
        this.salario = d;
    }

    public double getSalario() {
        return this.salario;
    }
    
}
