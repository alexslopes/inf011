/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import element.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class VisitorAluno extends Visitor{
    private double media = 0;
    private int cont = 0;
    
    @Override
    public void VisitConcretelementAluno(Aluno a) {
       this.media += a.getNota();
       cont++;
       this.calcularMedia();
    }
    
    public void calcularMedia(){
        System.out.println(media/cont);
    }
}
