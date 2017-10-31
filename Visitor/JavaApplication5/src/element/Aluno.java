
package element;

import visitor.Visitor;


/**
 *
 * @author aluno
 */
public class Aluno implements IElement{
    private double nota;
    private Visitor v;
    
    public Aluno(double nota){
        this.setNota(nota);
    }
    
    public void Accept(Visitor v) {
        v.VisitConcretelementAluno(this);
    }

    
    public void setNota(double d) {
        this.nota = d;
    }

    
    public double getNota() {
        return nota;
    }
   
}
