/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import interfaces.Command;

/**
 *
 * @author aluno
 */
public class CommandDividir implements Command{
    private int num1;
    private int num2;
    private int result;

    public CommandDividir(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    @Override
    public void redo() {
      result = num1 / num2; 
    }

    @Override
    public void undo() {
      result = num1 * num2;
    }
    
}
