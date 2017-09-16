
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex
 */
public class IteratorSuperPower {
    private List<Aluno> alunos;
    private String objeto;
    private char operator;
    private double nota;
    
    public IteratorSuperPower(List<Aluno> alunos, String objeto, char operator, double nota) {
        this.alunos = alunos;
        this.objeto = objeto;
        this.operator = operator;
        this.nota = nota;
    }
    
}
