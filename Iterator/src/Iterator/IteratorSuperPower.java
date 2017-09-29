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
    
    public Object verificadorDeMetodo(Object objeto, String metodo) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException{
        Class clazz = Class.forName(objeto.getClass().getName());
        Method metodoDoSeuObjeto = clazz.getMethod("get" + StringUtils.capitalize(metodo));
        Object retornoDoMetodo = metodoDoSeuObjeto.invoke(objeto);
        return retornoDoMetodo;

    }
    
    

    @Override
    public void first() {
        this.cont = 0;
    }

    @Override
    public Aluno next() {
        try {
            Object metodo = verificadorDeMetodo(this.objetos.get(cont), objeto);
            if(metodo instanceof Double){
                return compararNumeros(metodo);
            }else if (metodo instanceof Double){
                return compararString(metodo);
            }
        } catch (InvocationTargetException ex) {
            Logger.getLogger(IteratorSuperPower.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(IteratorSuperPower.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(IteratorSuperPower.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IteratorSuperPower.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public boolean isDone() {
        return objetos.size() == cont; 
    }

    @Override
    public boolean hasNext() {
       return (objetos.size() - 1) != cont; 
    }

    @Override
    public Aluno currentItem() {
        
    }


}
