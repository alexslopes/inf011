/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import com.sun.xml.internal.ws.util.StringUtils;
import interfaces.IIterator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class IteratorSuperPower implements IIterator {

    private List<Object> objetos;
    private String objeto;
    private int cont;
    private String operator;
    private double nota;

    public IteratorSuperPower(List<Object> objetos, String objeto, String operator, double nota) {
        this.objetos = objetos;
        this.objeto = objeto;
        this.operator = operator;
        this.nota = nota;
    }

    public IteratorSuperPower(List<Object> objetos, String objeto) {
        this.objetos = objetos;
        this.objeto = objeto;
    }

    @Override
    public void first() {
        this.cont = 0;
    }

    @Override
    public Aluno next() {
        for (Object x : objetos) {
            if (">".equals(operator)) {
                this.maior(objetos, nota);
            } else if ("<".equals(operator)) {
                this.menor(alunos, nota);
            } else if ("==".equals(operator)) {
                this.igual(alunos, nota);
            } else if (">=".equals(operator)) {
                this.maiorOuIgual(alunos, nota);
            } else if ("<=".equals(operator)) {
                this.menorOuIgual(alunos, nota);
            }
        }
    }

    @Override
    public boolean isDone() {
        return this.cont == alunos.size();
    }

    @Override
    public boolean hasNext() {
        if (cont < (alunos.size() - 1)) {
            return true;
        }
        return false;
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

    private Object getObjeto(Object objeto) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class clazz = Class.forName(objeto.getClass().getName());
        Method metodoDoSeuObjeto = clazz.getMethod("get" + StringUtils.capitalize(this.objeto));
        Object retornoDoMetodo = metodoDoSeuObjeto.invoke(objeto);
        return retornoDoMetodo;
    }

    private boolean comparador(Object objeto, double nota, String operator) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object x = getObjeto(objeto);
        
         if (">".equals(operator)) {
                return (double) x > nota;
            } else if ("<".equals(operator)) {
                return (double) x > nota;
            } else if ("==".equals(operator)) {
                return (double) x > nota;
            } else if (">=".equals(operator)) {
                this.maiorOuIgual(alunos, nota);
            } else if ("<=".equals(operator)) {
                this.menorOuIgual(alunos, nota);
            }
    }
    

    private boolean menor(Object objeto, double nota) {
        Object x = getObjeto(objeto);
        return (double) x < nota;
    }

    private void maiorOuIgual(List<Aluno> alunos, double nota) {
        for (Aluno x : alunos) {
            if (x.getNota() >= nota) {
                alunos.add(x);
            }
        }
    }

    private void menorOuIgual(List<Aluno> alunos, double nota) {
        for (Aluno x : alunos) {
            if (x.getNota() > nota) {
                alunos.add(x);
            }
        }
    }

    private void igual(List<Object> objetos, double nota) {
        for (Obje x : objetos) {
            if (x.getNota() == nota) {
                alunos.add(x);
            }
        }
    }

}
