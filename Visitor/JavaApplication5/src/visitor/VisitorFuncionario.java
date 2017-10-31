/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import element.Funcionario;

/**
 *
 * @author aluno
 */
public class VisitorFuncionario extends Visitor{
    private double salario = 0;
    private int cont = 0;
    
    @Override
    public void VisitConcretelementFuncionario(Funcionario v) {
       this.salario += v.getSalario();
       cont++;
       this.calcularMedia();
    }

    public void calcularMedia(){
        System.out.println(salario/cont);
    }
}
